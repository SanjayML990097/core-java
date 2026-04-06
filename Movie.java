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
	
	public boolean updateCast(String oldCast, String newCast){
		boolean isUpdated = false;
		if(oldCast != null && newCast != null){
			for(int i=0; i<casts.length; i++){
				if(oldCast.equals(casts[i])){
					casts[i] = newCast;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("cast not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteCast(String cast){
		boolean isDeleted = false;
		if(cast != null){
			for(int i=0; i<casts.length; i++){
				if(cast.equals(casts[i])){
					casts[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("cast not found to delete");
		}
		return isDeleted;
	}
	
	public void getCasts(){
		System.out.println("the movie casts are :");
		for(String cast : casts){
			System.out.println(cast);
		}
	}
}  

