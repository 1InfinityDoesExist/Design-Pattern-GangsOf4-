package Observer;

public class IPodDisplay implements Observer {

	protected WeatherStation weatherStation;

	public IPodDisplay(WeatherStation weatherStation) {
		// TODO Auto-generated constructor stub
		this.weatherStation = weatherStation;
		this.weatherStation.subscribe(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("----IPod Display " + weatherStation.getState());

	}

}
