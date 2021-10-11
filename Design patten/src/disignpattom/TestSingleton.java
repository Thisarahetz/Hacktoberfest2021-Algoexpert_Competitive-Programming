package disignpattom;

public class TestSingleton implements Runnable{
	public static void main(String args[]) {
		
		new Thread(new TestSingleton()).start();
		
		for (int i = 0; i < 10; i++) {
			Singleton.getinstance();
			TestSingleton.getinstance();
		}
	}

	private static void getinstance() {
		// TODO Auto-generated method stub
		
	}

}
