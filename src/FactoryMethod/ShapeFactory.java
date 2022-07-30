package FactoryMethod;

public class ShapeFactory {

	public Shape getShape(String shape) {
		if (shape == "CIRCLE") {
			return new Circle();
		} else {
			return new Triangle();
		}

	}

}
