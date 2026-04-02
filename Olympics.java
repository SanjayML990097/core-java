class Olympics{
	String sportNames[] = new String[11];
	int index;
	
	public boolean addSport(String sport){
		boolean isSportAdded = false;
		if(sport != null && !sport.isEmpty()){
			sportNames[index++] = sport;
			isSportAdded = true;
		}else{
			System.out.println("sport not added");
		}
		return isSportAdded;
	}
	
	public void getSports(){
		System.out.println("the olympic sports are :");
		for(String sport : sportNames){
			System.out.println(sport);
		}
	}
}
