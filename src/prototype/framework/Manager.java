package prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	private Map<String , Product> showcase = new HashMap<>();
	
	public void register(String name , Product prototype) {
		showcase.put(name , prototype);
	}
	
	public Product create(String ptototypeName) {
		Product p = showcase.get(ptototypeName);
		return p.createCopy();
	}
}
