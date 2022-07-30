package Strategy;

public class ConcretMethod2 implements Strategy {

	@Override
	public int run(int x, int y) {
		System.out.println(x * y);
		return x * y;
	}

}
