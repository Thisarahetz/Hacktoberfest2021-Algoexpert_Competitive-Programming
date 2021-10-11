package design.pattern.bridge;

public class SonyTV implements TV{

	@Override
	public void on() {
		System.out.println("Switch on Sony TV");
	}

	@Override
	public void off() {
		System.out.println("Switch off Sony TV");		
	}

	@Override
	public void tune(int chanel) {
		System.out.println("Switch on chanel in Sony TV is: " + chanel);
	}

}
