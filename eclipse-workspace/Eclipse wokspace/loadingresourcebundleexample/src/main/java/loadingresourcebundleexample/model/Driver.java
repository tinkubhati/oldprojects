package loadingresourcebundleexample.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("spring-hello.xml");
		HelloWorld hlw = context.getBean("helloBean",HelloWorld.class);
		System.out.println(hlw.getMessage1());
		System.out.println(hlw.getMessage2());

	}

}
