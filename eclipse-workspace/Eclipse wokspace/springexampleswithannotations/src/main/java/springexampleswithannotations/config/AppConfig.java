package springexampleswithannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springexampleswithannotations.model.Address;
import springexampleswithannotations.model.Customer;

@Configuration
public class AppConfig {

	@Bean
	public Customer createCustomer(){
		return new Customer();
	}
	
	@Bean(name="addressBean1")
	public Address createResidentialAddress() {
		return new Address();
	}
	
	
	
	
	
}
