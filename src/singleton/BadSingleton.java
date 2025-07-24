package singleton;

public class BadSingleton {
	private static BadSingleton badSingleton = null;
	
	private BadSingleton() {
		System.out.println("create instance");
		slowdown();
	}
	
	public static BadSingleton getInstance() {
		if(badSingleton == null) {
			badSingleton = new BadSingleton();
		}
		return badSingleton;
	}
	
	private void slowdown() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
	}
}
