package springcompleteannotate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springcompleteannotate.model.Consumer;
import springcompleteannotate.model.DigitalProduct;
import springcompleteannotate.model.ElectricalProduct;
import springcompleteannotate.model.PopupConsumer;
import springcompleteannotate.model.Product;

@Configuration
public class AppConfig {
	
	@Bean
	public Product createDigitalProduct() {
		return new DigitalProduct();
		
	}
	@Bean(name="consumer")
	public Consumer createConsumer() {
		return new PopupConsumer();
	}
	
	@Bean("electricalProduct")
	public Product createElectricalProduct() {
		return new ElectricalProduct();
	}
}
