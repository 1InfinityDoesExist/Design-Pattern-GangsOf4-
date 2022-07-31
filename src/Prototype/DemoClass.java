package Prototype;

public class DemoClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		BookStore bookStore = new BookStore();
		bookStore.setName("Aelian");
		bookStore.loadData();

		BookStore b1 = (BookStore) bookStore.clone();
		bookStore.getBooks().remove(0);
		b1.setName("B1");

		System.out.println(bookStore);

		System.out.println(b1);
	}

}
