package builder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}

		if (args[0].equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String filename = htmlbuilder.getHTMLResult();
			System.out.println("HTMLfile : " + filename + " is create.");
		} else {
			usage();
			System.exit(0);
		}
	}

	public static void usage() {
		System.out.println("Usage: java Main html");
	}
}
