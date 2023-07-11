package jpaapp.ui;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import jpaapp.entities.Department;
import jpaapp.entities.Employee;
import jpaapp.utilities.HibernateUtility;

public class JPAMainApp {

	public static void main(String[] args) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Department dept = session.find(Department.class, 1);
		
		
		Department dp = new Department();
		dp.setDeptName("Marketing");
		
		session.beginTransaction();
		Employee emp = new Employee();
		emp.setFirstName("Suraj");
		emp.setLastName("Bisht");
		emp.setSalary(234223.99);
		emp.setDepartment(dept);
		
		
		Employee emp1 = new Employee();
		emp1.setFirstName("Girraj");
		emp1.setLastName("Bisht");
		emp1.setSalary(124223.99);
		emp1.setDepartment(dp);
		
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp);
		empSet.add(emp1);
		
		dp.setEmployees(empSet);
		session.persist(dp);
	/**	
		//Find
//		Employee employee = session.find(Employee.class, 2);
//		System.out.println(employee);
		**/
//		session.persist(empSet);
		session.getTransaction().commit();

	}

}
