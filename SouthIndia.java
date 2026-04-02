class SouthIndia{
	String airportNames[] = new String[9];
	int index;
	
	public boolean addAirport(String airport){
		boolean isAirportAdded = false;
		if(airport != null && !airport.isEmpty()){
			airportNames[index++] = airport;
			isAirportAdded = true;
		}else{
			System.out.println("airport not added");
		}
		return isAirportAdded;
	}
	
	public void getAirports(){
		System.out.println("the south india airports are :");
		for(String airport : airportNames){
			System.out.println(airport);
		}
	}
}
