package abstractfactory.listfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

public class ListFactory extends Factory {

	@Override
	public Link createLink(String cation, String url) {
		// TODO Auto-generated method stub
		return new ListLink(cation , url);
	}

	@Override
	public Tray createTray(String cation) {
		// TODO Auto-generated method stub
		return new ListTray(cation);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new ListPage(title , author);
	}

}
