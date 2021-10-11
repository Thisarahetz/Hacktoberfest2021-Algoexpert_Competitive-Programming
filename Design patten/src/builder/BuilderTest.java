package builder;

public class BuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Waiter waiter1 = new Waiter(new CheesyPizzaBuilder()).serve();
		System.out.println();
		Waiter waiter2 = new Waiter(new VeggiePizzaBuilder()).serve();
		
		
		
	}

}
