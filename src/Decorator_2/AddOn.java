package Decorator_2;

public abstract class AddOn extends Beverage {

	protected Beverage beverage;

	public AddOn(String description, Beverage beverage) {
		super(description);
		this.beverage = beverage;
	}

	public abstract String getDescription();

}
