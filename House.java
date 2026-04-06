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
	
	public boolean updateGame(String oldGame, String newGame){
		boolean isUpdated = false;
		if(oldGame != null && newGame != null){
			for(int i=0; i<indoorGames.length; i++){
				if(oldGame.equals(indoorGames[i])){
					indoorGames[i] = newGame;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("game not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteGame(String game){
		boolean isDeleted = false;
		if(game != null){
			for(int i=0; i<indoorGames.length; i++){
				if(game.equals(indoorGames[i])){
					indoorGames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("game not found to delete");
		}
		return isDeleted;
	}
	
	public void getGames(){
		System.out.println("the indoor games are :");
		for(String game : indoorGames){
			System.out.println(game);
		}
	}
}  

