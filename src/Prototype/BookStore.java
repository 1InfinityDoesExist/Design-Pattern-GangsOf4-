package Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable {

	private String name;
	private List<Book> books = new ArrayList<Book>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void loadData() {
		for (int iter = 0; iter < 10; iter++) {
			Book book = new Book();
			book.setId(iter);
			book.setName("Book " + iter);
			getBooks().add(book);
		}
	}

	@Override
	public String toString() {
		return "BookStore [name=" + name + ", books=" + books + "]";
	}

	@Override
	protected BookStore clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookStore bs = new BookStore();
		for (Book b : getBooks()) {
			bs.getBooks().add(b);
		}
		return bs;
	}

}
