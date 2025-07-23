package template;

public class CharDisplay extends AbstractDisplay {
	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	protected void open() {
		// TODO Auto-generated method stub
		System.out.print("<<");
	}

	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.print(ch);
	}

	@Override
	protected void close() {
		// TODO Auto-generated method stub
		System.out.print(">>");
	}

}
