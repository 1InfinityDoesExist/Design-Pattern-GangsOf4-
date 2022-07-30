package Adapter;

public class DemoClass {
	public static void main(String[] args) {

		ToyDuck toy = new BirdAdapter(new Sparrow());
		toy.squack();
	}
}
