class HouseExecuter{
	public static void main(String args[]){
		House h = new House();

		boolean added = h.addGame("Chess");
		System.out.println(added);
		added = h.addGame("Carrom");
		System.out.println(added);
		added = h.addGame("Ludo");
		System.out.println(added);
		added = h.addGame("Table Tennis");
		System.out.println(added);
		added = h.addGame("Snakes and Ladders");
		System.out.println(added);
		added = h.addGame("Playing Cards");
		System.out.println(added);

		boolean updated = h.updateGame("Ludo", "UNO");
		System.out.println(updated);

		boolean deleted = h.deleteGame("Carrom");
		System.out.println(deleted);

		h.getGames();
	}
}