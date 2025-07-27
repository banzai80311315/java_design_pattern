package abstractfactory;

import abstractfactory.factory.*;

public class Main {
	public static void main(String[] arg) {
		if (arg.length != 2) {
			System.out.println("No");
			System.exit(0);
		}

		String filename = arg[0];
		String classname = arg[1];
		
		Factory factory = Factory.getFactory(classname);
		
		// Blog
		Link blog1 = factory.createLink("Blog 1", "xxxx");
		Link blog2 = factory.createLink("Blog 2", "yyyy");
		
		Tray blogTray = factory.createTray("Blog");
		blogTray.add(blog1);
		blogTray.add(blog2);
		
		// Page
		Page page = factory.createPage("Blog" , "Banzai");
		page.add(blogTray);
		
		page.output(filename);
	}
}
