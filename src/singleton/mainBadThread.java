package singleton;

public class mainBadThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainBadThread("A").start();
		new mainBadThread("B").start();
		new mainBadThread("C").start();
		new mainBadThread("D").start();
	}
		
	public mainBadThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BadSingleton obj = BadSingleton.getInstance();
		System.out.println(getName() + ";" + obj);
	}

}
