package Decorator_2;

public class Sugar extends AddOn {

	public Sugar(String description, Beverage beverage) {
		super(description, beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " with sugar";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 240;
	}

}
