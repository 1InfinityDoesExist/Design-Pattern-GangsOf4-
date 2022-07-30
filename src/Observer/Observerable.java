package Observer;

public interface Observerable {

	public void subscribe(Observer o);

	public void unSubscribe(Observer o);

	public void notifyUpdate();

}
