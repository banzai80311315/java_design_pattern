package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {
	private String owner;

	public IDCard(String owner) {
		System.out.print(owner + "のカードを作成します");
		this.owner = owner;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.print(this + "を使います");
	}

	@Override
	public String toString() {
		return "[IDCard : " + owner + "]";
	}

	public String getOwner() {
		return owner;
	}

}
