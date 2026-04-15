class Table{
	Team teams[]= new Team[10];
	
	public void getTable(){
		for(Team team: teams){
			System.out.println(team.teamName);
			System.out.println(team.playedMatches);
			System.out.println(team.won);
			System.out.println(team.loss);
			System.out.println(team.nrr);
		}
	}
}