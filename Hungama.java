class Hungama{
	String showNames[] = new String[14];
	int index;
	
	public boolean addShow(String show){
		boolean isShowAdded = false;
		if(show != null && !show.isEmpty()){
			showNames[index++] = show;
			isShowAdded = true;
		}else{
			System.out.println("show not added");
		}
		return isShowAdded;
	}
	
	public boolean updateShow(String oldShow, String newShow){
		boolean isUpdated = false;
		if(oldShow != null && newShow != null){
			for(int i=0; i<showNames.length; i++){
				if(oldShow.equals(showNames[i])){
					showNames[i] = newShow;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("show not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteShow(String show){
		boolean isDeleted = false;
		if(show != null){
			for(int i=0; i<showNames.length; i++){
				if(show.equals(showNames[i])){
					showNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("show not found to delete");
		}
		return isDeleted;
	}
	
	public void getShows(){
		System.out.println("the hungama shows are :");
		for(String show : showNames){
			System.out.println(show);
		}
	}
}  

