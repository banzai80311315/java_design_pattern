package iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("Around the Wold in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderlla"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));

		Iterator<Book> it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			System.out.println(book.getName());
		}
		
		System.out.println("");
		
		for(Book book : bookShelf) {
			System.out.println(book.getName());
		}
	
	}

}
