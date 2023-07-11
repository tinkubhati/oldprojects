package springannotationcompletesolution.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import springannotationcompletesolution.config.AppConfig;
import springannotationcompletesolution.model.Greeter;

public class Driver {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeter g = factory.getBean("greeter",Greeter.class);
		System.out.println("Got Greeter " + g);
		g.greet();
		factory.close();

	}

}
