class Course{
	String technologyNames[] = new String[15];
	int index;
	
	public boolean addTechnology(String tech){
		boolean isTechnologyAdded = false;
		if(tech != null && !tech.isEmpty()){
			technologyNames[index++] = tech;
			isTechnologyAdded = true;
		}else{
			System.out.println("technology not added");
		}
		return isTechnologyAdded;
	}
	
	public boolean updateTechnology(String oldTech, String newTech){
		boolean isUpdated = false;
		if(oldTech != null && newTech != null){
			for(int i=0; i<technologyNames.length; i++){
				if(oldTech.equals(technologyNames[i])){
					technologyNames[i] = newTech;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("technology not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteTechnology(String tech){
		boolean isDeleted = false;
		if(tech != null){
			for(int i=0; i<technologyNames.length; i++){
				if(tech.equals(technologyNames[i])){
					technologyNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("technology not found to delete");
		}
		return isDeleted;
	}
	
	public void getTechnologies(){
		System.out.println("the course technologies are :");
		for(String tech : technologyNames){
			System.out.println(tech);
		}
	}
}  
