class ShowRoom{
	String managerNames[] = new String[8];
	int index;
	
	public boolean addManager(String manager){
		boolean isManagerAdded = false;
		if(manager != null && !manager.isEmpty()){
			managerNames[index++] = manager;
			isManagerAdded = true;
		}else{
			System.out.println("manager not added");
		}
		return isManagerAdded;
	}
	
	public void getManagers(){
		System.out.println("the showroom managers are :");
		for(String manager : managerNames){
			System.out.println(manager);
		}
	}
}
