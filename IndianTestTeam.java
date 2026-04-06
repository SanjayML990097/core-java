class IndianTestTeam{
	String playerNames[] = new String[11];
	int index;
	
	public boolean addPlayer(String player){
		boolean isPlayerAdded = false;
		if(player != null && !player.isEmpty()){
			playerNames[index++] = player;
			isPlayerAdded = true;
		}else{
			System.out.println("player not added");
		}
		return isPlayerAdded;
	}
	
	public boolean updatePlayer(String oldPlayer, String newPlayer){
		boolean isUpdated = false;
		if(oldPlayer != null && newPlayer != null){
			for(int i=0; i<playerNames.length; i++){
				if(oldPlayer.equals(playerNames[i])){
					playerNames[i] = newPlayer;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("player not found to update");
		}
		return isUpdated;
	}
	
	public boolean deletePlayer(String player){
		boolean isDeleted = false;
		if(player != null){
			for(int i=0; i<playerNames.length; i++){
				if(player.equals(playerNames[i])){
					playerNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("player not found to delete");
		}
		return isDeleted;
	}
	
	public void getPlayers(){
		System.out.println("the indian test team players are :");
		for(String player : playerNames){
			System.out.println(player);
		}
	}
}  

