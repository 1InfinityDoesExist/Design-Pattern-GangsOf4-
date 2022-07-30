package Observer;

public class DemoClass {

	public static void main(String[] args) {

		WeatherStation ws = new WeatherStation();
		new PhoneDisplay(ws);
		new IPodDisplay(ws);

		ws.setState(5);
		System.out.println();
		ws.setState(20);
	}

}
