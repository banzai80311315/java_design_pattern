package adapter.three;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileIO f1 = new FileProperties();
		FileIO f2 = new FileProperties();
		f1.readFromFile("file.txt");
		System.out.println(f1.getValue("width"));
		System.out.println("");
		
//		f2.setValue("width", "1024");
//		f2.setValue("height", "512");
//		f2.setValue("depth", "32");
//		f2.writeToFile("newfile.txt");
		
		f2.readFromFile("newfile.txt");
		System.out.println(f2.getValue("width"));
	}

}
