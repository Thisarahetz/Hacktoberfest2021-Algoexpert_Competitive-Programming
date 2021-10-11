package design.pattern.builder;

public class Waiter {
	
	PizzaBuilder pizzaBuilder;
	
	public Waiter(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
	
	public Waiter serve(){
		pizzaBuilder.buildPizzaBase();
		pizzaBuilder.buildPizzaTopping();
		return this;
	}

}
