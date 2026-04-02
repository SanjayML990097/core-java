class Movie{
	String casts[] = new String[9];
	int index;
	
	public boolean addCast(String cast){
		boolean isCastAdded = false;
		if(cast != null && !cast.isEmpty()){
			casts[index++] = cast;
			isCastAdded = true;
		}else{
			System.out.println("cast not added");
		}
		return isCastAdded;
	}
	
	public void getCasts(){
		System.out.println("the movie casts are :");
		for(String cast : casts){
			System.out.println(cast);
		}
	}
}
