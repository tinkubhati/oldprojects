package jpawithann.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import jpawithann.entities.Department;
import jpawithann.utility.HibernateUtility;

public class DepartmentDaoImpl implements DepartmentDAO {

	
		//HIBERNET SESSION IS NEEDED
	Session session = HibernateUtility.getSessionFactory().openSession();
	
	
	public List<Department> getAllDepartment() {
		
		return session.createQuery("Select d from Department d ",Department.class ).getResultList();
	}
	
	
      //Retrieve By Primary Key
	public Department getDepartmentById(Integer deptNo) {
		session.beginTransaction();
		Department dept = session.get(Department.class, deptNo);
		session.getTransaction().commit();
		return dept;
	}

	//Create -- add or insert data in relational table
	public void addDepartment(Department department) {
		session.beginTransaction();
		session.persist(department);
		session.getTransaction().commit();

	}

	public Department updateDepartment(Department department) {
		
		session.beginTransaction();
		session.update(department);
		session.getTransaction().commit();
		Department dep = session.get(Department.class, department.getDeptNo());
		return dep;
	}

	public void deleteDepartment(Integer deptNo) {
		//remove
		session.getTransaction().begin();
		Department dep = new Department();
		dep.setDeptNo(deptNo);
		session.delete(dep);
		session.getTransaction().commit();

	}

	public Department getDepartmentByName(String deptName) {

//		Department dept=(Department) session.createNamedQuery(deptName, Department.class);
////		System.out.println(dept);
//		session.getTransaction().commit();
//		session.beginTransaction();
//		Criteria c = session.createCriteria(Department.class);
//		c.add(Restrictions.eq("deptName", deptName));
//		List<Department> departments = c.list();
//		for(Department dep : departments) {
//			System.out.println(dep);
//		}
		
		TypedQuery<?> query = session.getNamedQuery("findDepartmentByName");
		query.setParameter("dname", deptName);
		
		Department department = (Department) query.getSingleResult();
		return department ;
	}

	public Integer updateDepartmentUsingQuery(Department department) {
		
		String query = "Update Department Set deptName=:dName Where deptNo=deptId";
		session.beginTransaction();
		Query q = session.createNativeQuery(query);
		q.setParameter("dName", department.getDeptName());
		q.setParameter("deptId", department.getDeptNo());
		int row=q.executeUpdate();
		session.getTransaction().commit();
		if(row>0) {
			return row ;
		}
		return null;
	}

	public void deleteDepartmentByName(String deptName) {
		session.beginTransaction();
		Query q= session.createNamedQuery("deleteDepartmentByName");
		q.setParameter("name", deptName);
		q.executeUpdate();
		session.getTransaction().commit();

	}

}
