package Strategy;

public class Context {

	protected Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void execute(int a, int b) {
		this.strategy.run(a, b);
	}
}
