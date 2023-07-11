package designpattern.builderpizza;

public class ItalianPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("Cheese Burst");
		
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Ham+Pineapple");
		
		
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Italian");
		
	}

}
