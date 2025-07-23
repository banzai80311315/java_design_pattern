package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {
	private String owner;
	private int number;

	IDCard(String owner, int number) {
		System.out.print(owner + "のカードを作成します。" + "\n番号は" + number + "です。");
		this.owner = owner;
		this.number = number;
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.print(this + "を使います");
	}

	@Override
	public String toString() {
		return "[IDCard : " + owner + "(" + number + ")" + "]";
	}

	public String getOwner() {
		return owner;
	}

	public int getNumber() {
		return number;
	}

}
