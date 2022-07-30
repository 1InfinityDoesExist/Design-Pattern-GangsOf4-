package Decorator_2;

public class CCD {
	public static void main(String[] args) {

		HouseBlend houseblend = new HouseBlend("House blend");
		System.out.println(houseblend.getDescription() + ":" + houseblend.cost());

		Milk milkAddOn = new Milk("House blend", houseblend);
		System.out.println(milkAddOn.getDescription() + ":" + milkAddOn.cost());

		Sugar sugarAddOn = new Sugar("House blend", milkAddOn);
		System.out.println(sugarAddOn.getDescription() + ":" + sugarAddOn.cost());
	}

}
