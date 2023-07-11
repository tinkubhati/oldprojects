package springannotationcompletesolution.model;

public class AmarilliVisitor implements Visitor {

	private String name;
	private String greeting;
	
	public AmarilliVisitor() {
		this.name="Roop Nagar";
		this.greeting="Ram Ram";
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		
		return name;
	}

	public String getGreeting() {
		
		return greeting;
	}

}
