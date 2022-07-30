package Decorator_2;

public class Milk extends AddOn {

	public Milk(String description, Beverage beverage) {
		super(description, beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " with milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 300;
	}

}
