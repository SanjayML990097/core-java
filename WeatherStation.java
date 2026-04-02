class WeatherStation{
	double temparatureReadings[] = new double[17];
	int index;
	
	public boolean addTemperature(double temp){
		boolean isTemperatureAdded = false;
		if(index < temparatureReadings.length){
			temparatureReadings[index++] = temp;
			isTemperatureAdded = true;
		}else{
			System.out.println("temperature not added");
		}
		return isTemperatureAdded;
	}
	
	public void getTemperatures(){
		System.out.println("the temperature readings are :");
		for(double temp : temparatureReadings){
			System.out.println(temp);
		}
	}
}
