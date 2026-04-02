class House{
	String indoorGames[] = new String[6];
	int index;
	
	public boolean addGame(String game){
		boolean isGameAdded = false;
		if(game != null && !game.isEmpty()){
			indoorGames[index++] = game;
			isGameAdded = true;
		}else{
			System.out.println("game not added");
		}
		return isGameAdded;
	}
	
	public void getGames(){
		System.out.println("the indoor games are :");
		for(String game : indoorGames){
			System.out.println(game);
		}
	}
}
