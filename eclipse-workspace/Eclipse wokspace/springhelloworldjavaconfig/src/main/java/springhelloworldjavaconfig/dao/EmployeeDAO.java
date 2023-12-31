package springhelloworldjavaconfig.dao;

import java.util.List;

import springhelloworldjavaconfig.model.Employee;

public interface EmployeeDAO {

	//CRUD operations
	
		
		//Create
		public void save(Employee employee);
		//Read
		public Employee getById(int id);
		//Update
		public void update(Employee employee);
		//Delete
		public void deleteById(int id);
		//Get All
		public List<Employee> getAll();
		
	

}
