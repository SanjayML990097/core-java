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
	
	public boolean updateSport(String oldSport, String newSport){
		boolean isUpdated = false;
		if(oldSport != null && newSport != null){
			for(int i=0; i<sportNames.length; i++){
				if(oldSport.equals(sportNames[i])){
					sportNames[i] = newSport;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("sport not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteSport(String sport){
		boolean isDeleted = false;
		if(sport != null){
			for(int i=0; i<sportNames.length; i++){
				if(sport.equals(sportNames[i])){
					sportNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("sport not found to delete");
		}
		return isDeleted;
	}
	
	public void getSports(){
		System.out.println("the olympic sports are :");
		for(String sport : sportNames){
			System.out.println(sport);
		}
	}
}  

