package singleton;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("generate instance.");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
