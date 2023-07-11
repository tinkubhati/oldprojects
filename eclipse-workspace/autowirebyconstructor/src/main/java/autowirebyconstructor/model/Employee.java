package autowirebyconstructor.model;

import java.time.LocalDate;

public class Employee {

	private String empName;
	private Address address;
	private LocalDate dob;
	
	public Employee(String empName, Address address, LocalDate dob) {
		super();
		this.empName = empName;
		this.address = address;
		this.dob = dob;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + ", dob=" + dob + "]";
	}
	
	
}
