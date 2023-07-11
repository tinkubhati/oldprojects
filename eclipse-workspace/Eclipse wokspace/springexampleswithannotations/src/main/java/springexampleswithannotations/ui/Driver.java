package springexampleswithannotations.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springexampleswithannotations.model.Address;
import springexampleswithannotations.model.Customer;
import springexampleswithannotations.model.Person;

public class Driver {

	public static void main(String[] args) {
		
		String springConfigurationFile = "springconfig-annotations.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		
		Address resiAdd = context.getBean("addressBean1",Address.class);
		resiAdd.setAddressId(1);
		resiAdd.setCity("Greater Noida");
		resiAdd.setCountry("India");
		resiAdd.setState("Uttar Pradesh");
		
		System.out.println("Got Residential Address"+ resiAdd);
		Customer cust = context.getBean("customer", Customer.class);
		cust.setCustomerName("Tinku Bhati");
		System.out.println("Got Customer " + cust.getCustomerName());
		
		Person per = context.getBean("person",Person.class);
		System.out.println("Got Person " +  per.getPersonName());
		
		
		
		
	}

}
