package design.pattern.builder;

public class VeggiePizzaBuilder extends PizzaBuilder{
	
	Pizza pizza;
	
	public VeggiePizzaBuilder() {
		pizza = new Pizza();
	}

	@Override
	public void buildPizzaBase() {
		System.out.println("Building Veggie Pizza base");
		pizza.setName("Veggie Pizza");
	}

	@Override
	public void buildPizzaTopping() {
		System.out.println("Add Veggie pizza Topping");
		pizza.setSauce("Pizza sauce");
	}

	@Override
	public Pizza getPizza() {
		System.out.println("Returning Veggie Pizza");
		return this.pizza;
	}

}
