package springscopes.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springscopes.bean.CustomerService;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("springconfig.xml");
		       CustomerService msg1 = factory.getBean("customerServiceSingleton",CustomerService.class);
		      msg1.setMessage("Hello this is singleton 1");
              System.out.println("singleton(message) " + msg1.getMessage());
              
              CustomerService msg2 = factory.getBean("customerServiceSingleton",CustomerService.class);
              msg2.setMessage("this is Singleton 2 ");
              System.out.println("Singleton(message2) "+ msg2.getMessage());
              
              CustomerService msg3 = factory.getBean("customerServicePrototype",CustomerService.class);
              msg3.setMessage("this is Prototype 1 ");
              System.out.println("Prototype(message 1) "+ msg3.getMessage());
		
              CustomerService msg4 = factory.getBean("customerServicePrototype",CustomerService.class);
              msg4.setMessage("this is Prototype 2 ");
              System.out.println("Prototype(message 2) "+ msg4
            		  .getMessage());
              
              System.out.println("**************************************************");
              System.out.println(msg1.hashCode());
              System.out.println(msg2.hashCode());
              System.out.println(msg3.hashCode());
              System.out.println(msg4.hashCode());
              
		
		
	}

}
