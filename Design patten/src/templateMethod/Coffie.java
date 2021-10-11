package templateMethod;

public class Coffie extends Beverage {

	@Override
	void addCondiments() {
		System.out.println("Add suger and milk.");
	}

	@Override
	void brew() {
		System.out.println("Stripping coffie through filter.");
	}
}



