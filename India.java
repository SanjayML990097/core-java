class India{
	String states[] = new String[29];
	int index;
	
	public boolean addState(String state){
		boolean isStateAdded = false;
		if(state != null && !state.isEmpty()){
			states[index++] = state;
			isStateAdded = true;
		}else{
			System.out.println("state not added");
		}
		return isStateAdded;
	}
	
	public boolean updateState(String oldState, String newState){
		boolean isUpdated = false;
		if(oldState != null && newState != null){
			for(int i=0; i<states.length; i++){
				if(oldState.equals(states[i])){
					states[i] = newState;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("state not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteState(String state){
		boolean isDeleted = false;
		if(state != null){
			for(int i=0; i<states.length; i++){
				if(state.equals(states[i])){
					states[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("state not found to delete");
		}
		return isDeleted;
	}
	
	public void getStates(){
		System.out.println("the indian states are :");
		for(String state:states){
			System.out.println(state);
		}
	}
}
				
