package jpawithann.service;

import java.util.List;

import jpawithann.dao.DepartmentDAO;
import jpawithann.dao.DepartmentDaoImpl;
import jpawithann.entities.Department;

public class DepartmentServiceImpl implements DepartmentService {
	
	DepartmentDAO departmentDao = new DepartmentDaoImpl();

	
	public List<Department> getAllDepartment() {
		
		return departmentDao.getAllDepartment();
	}

	public Department getDepartmentById(Integer deptNo) {
		
		return departmentDao.getDepartmentById(deptNo);
	}

	public void addDepartment(Department department) {
		departmentDao.addDepartment(department);

	}

	public Department updateDepartment(Department department) {
		
		return departmentDao.updateDepartment(department);
	}

	public void deleteDepartment(Integer deptNo) {
		departmentDao.deleteDepartment(deptNo);

	}

	public Department getDepartmentByName(String deptName) {
		// TODO Auto-generated method stub
		return departmentDao.getDepartmentByName(deptName);
	}

	public Integer updateDepartmentUsingQuery(Department department) {
		// TODO Auto-generated method stub
		return departmentDao.updateDepartmentUsingQuery(department);
	}

	public void deleteDepartmentByName(String deptName) {
		departmentDao.deleteDepartmentByName(deptName);

	}

}
