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
	
	public void getPlayers(){
		System.out.println("the indian test team players are :");
		for(String player : playerNames){
			System.out.println(player);
		}
	}
}
