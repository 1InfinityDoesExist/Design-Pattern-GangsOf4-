package Decorator_1;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		setRedBoarder(decoratedShape);
	}

	private void setRedBoarder(Shape decoratedShape) {
		System.out.println("Boarder is red");

	}
}
