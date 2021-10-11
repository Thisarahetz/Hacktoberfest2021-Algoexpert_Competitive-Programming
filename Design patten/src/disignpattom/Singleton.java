package disignpattom;

public class Singleton {
	
	private static Singleton single;
	
	private Singleton() {
	}
	
	public static Singleton getinstance() {
		if(single==null) {
			single=new Singleton();
			System.out.println("Singleton invocation");
			
		}
		return single;
	}
	
}
