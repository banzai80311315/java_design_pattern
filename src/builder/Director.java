package builder;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("Hellow Type");
		builder.makeItems(new String[] {
				"How are you ?",
				"Hi !",
				"Hellow"
		});
		builder.close();
	}
}
