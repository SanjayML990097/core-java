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
	
	public void getTechnologies(){
		System.out.println("the course technologies are :");
		for(String tech : technologyNames){
			System.out.println(tech);
		}
	}
}
