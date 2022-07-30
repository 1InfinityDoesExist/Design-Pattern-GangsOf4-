package Decorator_1;

public class DemoClass {
	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(circle);
		//circle.draw();

		redCircle.draw();
	}

}
