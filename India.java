class India{
	String states[] = new String[29];
	int index;
	
	public boolean addState(String state){
			boolean isStateAdded = false;
			if(state != null && !state.isEmpty()){
				states[index++]=state;
				isStateAdded = true;
			}else{
				System.out.println("state not added");
			}
				return isStateAdded;
	}
	
	public void getStates(){
		System.out.println("the indian states are :");
		for(String state:states){
			System.out.println(state);
		}
	}
}
				
	