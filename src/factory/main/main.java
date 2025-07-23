package factory.main;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Kazuya Banzai");
		System.out.print("\n=========\n");
		Product card2 = factory.create("Momoco Banzai");
		System.out.print("\n=========\n");
		card1.use();
		System.out.print("\n=========\n");
		card2.use();

	}

}
