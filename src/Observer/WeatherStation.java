package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observerable {

	public List<Observer> observer = new ArrayList<>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyUpdate();
	}

	@Override
	public void subscribe(Observer o) {
		this.observer.add(o);

	}

	@Override
	public void unSubscribe(Observer o) {
		this.observer.remove(o);
	}

	@Override
	public void notifyUpdate() {
		observer.stream().forEach(Observer::update);

	}

}
