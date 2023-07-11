package jpaapp.entities;

public class Employee {

	private Integer id;
	private String firstName;
	private String lastName;
	private Double salary;
	
	//Has a relationship
	private Department department;
	
	
	public Department getDepartment() {
		return department;
	}
	public Employee() {
		
	}
	public Employee(Integer id, String firstName, String lastName, Double salary, Department dept) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
	
	public void setDepartment(Department department) {
		this.department = department;
		
	}
	
	
	
}
