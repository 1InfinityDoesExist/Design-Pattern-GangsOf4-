package Strategy;

public class ConcretMethod1 implements Strategy {

	@Override
	public int run(int x, int y) {
		// TODO Auto-generated method stub

		System.out.println(x + y);
		return x + y;
	}

}
