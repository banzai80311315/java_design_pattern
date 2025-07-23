package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

public class IDCardFactory extends Factory {
	private int number = 0;
	
	@Override
	protected void registerProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.print(product + "を登録しました");
	}

	@Override
	protected Product createProduct(String owner) {
		// TODO Auto-generated method stub
		number++;
		return new IDCard(owner , number);
	}

}
