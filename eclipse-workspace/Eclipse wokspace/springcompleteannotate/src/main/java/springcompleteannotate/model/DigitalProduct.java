package springcompleteannotate.model;

public class DigitalProduct implements Product {

	private String name;
	private String product;
	

	
	public DigitalProduct() {
		this.name="Realme X2 Pro";
		this.product="Smartphone";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProduct( ) {
		return product;

	}

	public String getName() {
		return name;
		
		
	}

}
