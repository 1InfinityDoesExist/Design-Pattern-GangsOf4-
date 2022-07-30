package Adapter;

public class BirdAdapter implements ToyDuck {

	protected Bird bird;

	public BirdAdapter(Bird bird) {
		// TODO Auto-generated constructor stub
		this.bird = bird;
	}

	@Override
	public void squack() {
		// TODO Auto-generated method stub
		this.bird.makeSound();
	}

}
