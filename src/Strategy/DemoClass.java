package Strategy;

//at runtime it decides what type of object you want.
public class DemoClass {

	public static void main(String[] args) {
		Context context = new Context(new ConcretMethod1());

		context.execute(5, 4);

		context = new Context(new ConcretMethod2());
		context.execute(5, 2);
	}

}
