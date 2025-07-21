package adaptertwo;

public class PrintBanner extends Print {
	private Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		// TODO Auto-generated method stub
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		// TODO Auto-generated method stub
		banner.showWithAster();
	}

}
