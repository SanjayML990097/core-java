
class WeatherStationExecuter{
	public static void main(String args[]){
		WeatherStation w = new WeatherStation();

		boolean added = w.addTemperature(30.5);
		System.out.println(added);
		added = w.addTemperature(31.2);
		System.out.println(added);
		added = w.addTemperature(29.8);
		System.out.println(added);
		added = w.addTemperature(32.1);
		System.out.println(added);
		added = w.addTemperature(33.0);
		System.out.println(added);
		added = w.addTemperature(34.5);
		System.out.println(added);
		added = w.addTemperature(35.2);
		System.out.println(added);
		added = w.addTemperature(36.1);
		System.out.println(added);
		added = w.addTemperature(37.0);
		System.out.println(added);
		added = w.addTemperature(38.3);
		System.out.println(added);
		added = w.addTemperature(39.5);
		System.out.println(added);
		added = w.addTemperature(40.2);
		System.out.println(added);
		added = w.addTemperature(41.0);
		System.out.println(added);
		added = w.addTemperature(42.3);
		System.out.println(added);
		added = w.addTemperature(43.1);
		System.out.println(added);
		added = w.addTemperature(44.0);
		System.out.println(added);
		added = w.addTemperature(45.5);
		System.out.println(added);

		w.getTemperatures();
	}
}