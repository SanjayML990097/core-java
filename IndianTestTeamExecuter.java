
class IndianTestTeamExecuter{
	public static void main(String args[]){
		IndianTestTeam t = new IndianTestTeam();

		boolean added = t.addPlayer("Rohit Sharma");
		System.out.println(added);
		added = t.addPlayer("Shubman Gill");
		System.out.println(added);
		added = t.addPlayer("Virat Kohli");
		System.out.println(added);
		added = t.addPlayer("Cheteshwar Pujara");
		System.out.println(added);
		added = t.addPlayer("Ajinkya Rahane");
		System.out.println(added);
		added = t.addPlayer("Rishabh Pant");
		System.out.println(added);
		added = t.addPlayer("Ravindra Jadeja");
		System.out.println(added);
		added = t.addPlayer("Ravichandran Ashwin");
		System.out.println(added);
		added = t.addPlayer("Jasprit Bumrah");
		System.out.println(added);
		added = t.addPlayer("Mohammed Shami");
		System.out.println(added);
		added = t.addPlayer("Mohammed Siraj");
		System.out.println(added);

		t.getPlayers();
	}
}