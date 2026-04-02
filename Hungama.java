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
	
	public void getShows(){
		System.out.println("the hungama shows are :");
		for(String show : showNames){
			System.out.println(show);
		}
	}
}
