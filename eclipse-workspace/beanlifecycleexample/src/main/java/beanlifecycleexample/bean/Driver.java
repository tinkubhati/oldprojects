package beanlifecycleexample.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context4 =
				new ClassPathXmlApplicationContext("beans.xml");
				BookBean bookBean = (BookBean) context4.getBean("bookBeanPost");
				((AbstractApplicationContext) context4).registerShutdownHook();
				}

}
