package autowirebytype.model;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		String xmlFile = "beans.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);
		
		Employee emp1 = context.getBean("employee", Employee.class);
	    System.out.println(emp1);
	    
//	    System.out.println("************************************");
//	    
//	    Employee emp2 = context.getBean("employee1", Employee.class);
//	    System.out.println(emp2);
	    
	}

}
