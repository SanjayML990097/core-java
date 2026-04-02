class OlympicsExecuter{
	public static void main(String args[]){
		Olympics o = new Olympics();

boolean added = o.addSport("Athletics");
		System.out.println(added);
		added = o.addSport("Swimming");
		System.out.println(added);
		added = o.addSport("Gymnastics");
		System.out.println(added);
	added = o.addSport("Boxing");
		System.out.println(added);
		added = o.addSport("Wrestling");
		System.out.println(added);
		added = o.addSport("Badminton");
		System.out.println(added);
		added = o.addSport("Hockey");
	System.out.println(added);
		added = o.addSport("Football");
		System.out.println(added);
		added = o.addSport("Tennis");
		System.out.println(added);
		added = o.addSport("Table Tennis");
	System.out.println(added);
		added = o.addSport("Cycling");
		System.out.println(added);

		o.getSports();
	}
}