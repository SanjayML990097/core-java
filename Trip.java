class Trip{
	String places[] = new String[13];
	int index;
	
	public boolean addPlace(String place){
		boolean isPlaceAdded = false;
		if(place != null && !place.isEmpty()){
			places[index++] = place;
			isPlaceAdded = true;
		}else{
			System.out.println("place not added");
		}
		return isPlaceAdded;
	}
	
	public void getPlaces(){
		System.out.println("the trip places are :");
		for(String place : places){
			System.out.println(place);
		}
	}
}
