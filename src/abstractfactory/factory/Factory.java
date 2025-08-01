package abstractfactory.factory;

public abstract class Factory {
	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(classname).getDeclaredConstructor().newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("class:" + classname + " is not found.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract Link createLink(String cation , String url);
	public abstract Tray createTray(String cation);
	public abstract Page createPage(String title , String author);
}
