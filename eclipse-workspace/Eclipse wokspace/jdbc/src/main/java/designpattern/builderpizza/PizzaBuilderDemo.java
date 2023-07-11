package designpattern.builderpizza;

public class PizzaBuilderDemo {

	public static void main(String[] args) {
	 Waiter waiter = new Waiter();
	 ItalianPizzaBuilder italianPizzaBuilder = new ItalianPizzaBuilder();
	 PizzaBuilder nykPizzaBuilder = new NYKPizzaBuilder();
	 
	 waiter.setPizzaBuilder(nykPizzaBuilder);
	 waiter.constructPizza();
	 
	 waiter.setPizzaBuilder(italianPizzaBuilder);
	 waiter.constructPizza();
	 
	 Pizza pizza = waiter.getPizza();
	 
	 System.out.println(pizza.getDough());
	 System.out.println(pizza.getSauce());
	 System.out.println(pizza.getTopping());
	}

}