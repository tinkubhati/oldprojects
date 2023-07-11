package jpawithann.dao;

import java.util.List;

import jpawithann.entities.Department;

	public interface DepartmentDAO {
		public List<Department> getAllDepartment();
		public Department getDepartmentById(Integer deptNo);
		public void addDepartment(Department department);
		
		public Department updateDepartment(Department department);
		public void deleteDepartment(Integer deptNo);
		
		public Department getDepartmentByName(String deptName);
		public Integer updateDepartmentUsingQuery(Department department);
		public void deleteDepartmentByName(String deptName);
	}

