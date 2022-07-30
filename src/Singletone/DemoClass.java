package Singletone;

public class DemoClass {
	public static void main(String[] args) {
		System.out.println(Singletone.getInstance());
		Singletone singletone = Singletone.getInstance();
		System.out.println(singletone);
		singletone.display();
	}

}
