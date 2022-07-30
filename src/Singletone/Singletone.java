package Singletone;

public class Singletone {

	private static Singletone singletone = null;

	private Singletone() {

	}

	public static Singletone getInstance() {
		if (singletone == null) {
			singletone = new Singletone();
		}
		return singletone;
	}

	public void display() {
		System.out.println("I am singletone class");
	}

}
