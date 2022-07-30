package FactoryMethod;

public class DemoClass {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape = shapeFactory.getShape("CIRCLE_1");
		shape.draw();

	}

}
