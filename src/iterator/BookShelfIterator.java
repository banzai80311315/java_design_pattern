package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Book next() {
		// TODO Auto-generated method stub
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
