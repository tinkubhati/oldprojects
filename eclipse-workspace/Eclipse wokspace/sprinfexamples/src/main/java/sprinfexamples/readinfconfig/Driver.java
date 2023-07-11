package sprinfexamples.readinfconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
 public static void main(String[] args) {
	 
	 //configuration metadata
	 String springConfigurationFile = "springconfig.xml";
	 
	 //Instantiating a Spring IoC container 
	 AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
	 
	 //Here using context.getBean method we are trying to get an instance of customer class
	 Customer cust = context.getBean("customer",Customer.class);
	 System.out.println(cust.getCustomerId());
	 System.out.println(cust.getCustomerName());
	 System.out.println(cust.getAddress().getCity());
	 
	 System.out.println("************************8");
	 
	 //Person and is dependent beans
	 Person person = context.getBean("personBean",Person.class);
	 System.out.println(person.getResidentialAddress().getCity());
	 System.out.println(person.getPermanentAddress().getCity());
	 System.out.println(person.getAadharCardNumber());
	 context.close();
	 
	 
 	}
}
