package singleton;

import java.util.HashMap;
import java.util.Map;

public class Triple {
	private static Map<String, Triple> map = new HashMap<>();
	static {
		String[] names = { "Alpha", "Beta", "Gamma" };
		for (String s : names) {
			map.put(s, new Triple(s));
		}
	}

	private String name;

	private Triple(String name) {
		System.out.println("The instance " + name + " is created");
		this.name = name;
	}

	public static Triple getInstance(String name) {
		return map.get(name);
	}

	@Override
	public String toString() {
		return this.name;
	}

}
