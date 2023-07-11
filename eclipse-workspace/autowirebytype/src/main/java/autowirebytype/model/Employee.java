package autowirebytype.model;

public class Employee {

	private String empName;
	private Address address;
	private Address add;
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
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
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + ", add=" + add + "]";
	}



	
	
	
}
