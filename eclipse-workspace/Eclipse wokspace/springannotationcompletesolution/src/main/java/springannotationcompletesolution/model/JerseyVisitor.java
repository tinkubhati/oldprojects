package springannotationcompletesolution.model;

public class JerseyVisitor implements Visitor {

	private String name;
	private String greeting;
	
	public JerseyVisitor() {
		this.name="Tinku Bhati";
		this.greeting="Hello there!";
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getGreeting() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
