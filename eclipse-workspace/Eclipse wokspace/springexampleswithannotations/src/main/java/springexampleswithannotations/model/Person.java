package springexampleswithannotations.model;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {

	private Long aadharCardNumber;
	private Address residentialAddress;
	private Address permanentAddress;
	private String personName;
	
	
	public Person() {
		
	}


	public Person(Long aadharCardNumber, Address residentialAddress, Address permanentAddress, String personName) {
		
		this.aadharCardNumber = aadharCardNumber;
		this.residentialAddress = residentialAddress;
		this.permanentAddress = permanentAddress;
		this.personName = personName;
	}


	public Long getAadharCardNumber() {
		return aadharCardNumber;
	}


	public void setAadharCardNumber(Long aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}


	public Address getResidentialAddress() {
		return residentialAddress;
	}


	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}


	public Address getPermanentAddress() {
		return permanentAddress;
	}


	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	@Override
	public String toString() {
		return "Person [aadharCardNumber=" + aadharCardNumber + ", residentialAddress=" + residentialAddress
				+ ", permanentAddress=" + permanentAddress + ", personName=" + personName + "]";
	}
	
	
	
	
	
	
	
	
}
