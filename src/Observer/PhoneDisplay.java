package Observer;

public class PhoneDisplay implements Observer {

	protected WeatherStation weatherStation;

	public PhoneDisplay(WeatherStation weatherStation) {
		this.weatherStation = weatherStation;
		this.weatherStation.subscribe(this);

	}

	@Override
	public void update() {
		System.out.println("-----Phone Display------" + this.weatherStation.getState());

	}

}
