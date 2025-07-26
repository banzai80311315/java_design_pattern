package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.register("warning_box", new MassageBox('*'));

		Product p1 = manager.create("warning_box");
		p1.use("helloWorld!");

	}

}
