package designpattern.builderpizza;


public abstract class PizzaBuilder {
	
	Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}
