class Universe{
	String galaxies[] = new String[11];
	int index;
	
	public boolean addGalaxy(String galaxy){
		boolean isGalaxyAdded = false;
		if(galaxy != null && !galaxy.isEmpty()){
			galaxies[index++] = galaxy;
			isGalaxyAdded = true;
		}else{
			System.out.println("galaxy not added");
		}
		return isGalaxyAdded;
	}
	
	public void getGalaxies(){
		System.out.println("the galaxies in universe are :");
		for(String galaxy : galaxies){
			System.out.println(galaxy);
		}
	}
}
