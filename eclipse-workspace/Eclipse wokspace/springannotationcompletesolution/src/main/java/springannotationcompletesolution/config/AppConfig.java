package springannotationcompletesolution.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springannotationcompletesolution.model.AmarilliVisitor;
import springannotationcompletesolution.model.Greeter;
import springannotationcompletesolution.model.JerseyVisitor;
import springannotationcompletesolution.model.PopupGreeter;
import springannotationcompletesolution.model.Visitor;

@Configuration
public class AppConfig {
	
	@Bean
	public Visitor createVisitor() {
		return new AmarilliVisitor();
		
	}
	@Bean(name="greeter")
	public Greeter createGreeter() {
		return new PopupGreeter();
	}
	
	@Bean("jerseyVisitor")
	public Visitor createJerseyVisitor() {
		return new JerseyVisitor();
	}
}
