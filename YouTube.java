class YouTube{
	String videoTitleNames[] = new String[15];
	int index;
	
	public boolean addVideo(String title){
		boolean isVideoAdded = false;
		if(title != null && !title.isEmpty()){
			videoTitleNames[index++] = title;
			isVideoAdded = true;
		}else{
			System.out.println("video not added");
		}
		return isVideoAdded;
	}
	
	public void getVideos(){
		System.out.println("the youtube video titles are :");
		for(String title : videoTitleNames){
			System.out.println(title);
		}
	}
}
