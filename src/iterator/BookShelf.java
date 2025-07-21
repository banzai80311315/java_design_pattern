package iterator;


import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
	private ArrayList<Book> books;
	private int last = 0;

	public BookShelf() {
		this.books = new ArrayList<>();
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		books.add(book);
		last++;
	}

	public int getLength() {
		return last;
	}

	@Override
	public Iterator<Book> iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}

}
