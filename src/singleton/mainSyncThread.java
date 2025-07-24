package singleton;

public class mainSyncThread extends Thread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainSyncThread("A").start();
		new mainSyncThread("B").start();
		new mainSyncThread("C").start();
		new mainSyncThread("D").start();
	}
		
	public mainSyncThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		SynchronizedSingleton obj = SynchronizedSingleton.getInstance();
		System.out.println(getName() + ";" + obj);
	}
}
