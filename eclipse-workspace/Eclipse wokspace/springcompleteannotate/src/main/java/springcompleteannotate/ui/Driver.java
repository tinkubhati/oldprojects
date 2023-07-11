package springcompleteannotate.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import springcompleteannotate.config.AppConfig;
import springcompleteannotate.model.Consumer;

public class Driver {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Consumer con = factory.getBean("consumer",Consumer.class);
		System.out.println("Got Consumer " + con);
		con.consumer();
		factory.close();
       
	}

}
