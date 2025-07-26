package prototype;

import prototype.framework.Product;

public class MassageBox implements Product {
	private char decochar;

	public MassageBox(char decochar) {
		this.decochar = decochar;
	}
	
	public MassageBox(MassageBox original) {
		this.decochar = original.decochar;
	}

	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int decolen = 1 + s.length() + 1;
		for (int i = 0; i <= decolen; i++) {
			System.out.print(decochar);
		}
		System.out.print("\n");
		System.out.println(decochar + s + decochar);
		for (int i = 0; i <= decolen; i++) {
			System.out.print(decochar);
		}
	}

	@Override
	public Product createCopy() {
		// TODO Auto-generated method stub
		return new MassageBox(this);
	}

}
