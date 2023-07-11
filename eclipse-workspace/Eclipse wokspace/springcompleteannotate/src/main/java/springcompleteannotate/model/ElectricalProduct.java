package springcompleteannotate.model;

import org.springframework.stereotype.Component;

@Component
public class ElectricalProduct implements Product {

	private String name;
	private String product;
	
	
	public ElectricalProduct() {
		this.name="Whirlpool Fridge 4D Matic";
		this.product="Refrigirator";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getName() {
		
		return name;
	}

	public String getProduct() {
		
		return product;
	}

	


}
