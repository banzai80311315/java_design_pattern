package adapterthree;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
	private Properties properties = new Properties();

	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader(filename);
		properties.load(reader);
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter(filename);
		properties.store(writer, "create new file");
	}

	@Override
	public void setValue(String key, String value) {
		// TODO Auto-generated method stub
		properties.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		// TODO Auto-generated method stub
		return properties.getProperty(key);
	}

}
