
class SouthIndiaExecuter{
	public static void main(String args[]){
		SouthIndia s = new SouthIndia();

		boolean added = s.addAirport("Kempegowda International Airport");
		System.out.println(added);
		added = s.addAirport("Chennai International Airport");
		System.out.println(added);
		added = s.addAirport("Rajiv Gandhi International Airport");
		System.out.println(added);
		added = s.addAirport("Cochin International Airport");
		System.out.println(added);
		added = s.addAirport("Trivandrum International Airport");
		System.out.println(added);
		added = s.addAirport("Calicut International Airport");
		System.out.println(added);
		added = s.addAirport("Mangalore International Airport");
		System.out.println(added);
		added = s.addAirport("Coimbatore International Airport");
		System.out.println(added);
		added = s.addAirport("Madurai Airport");
		System.out.println(added);

		s.getAirports();
	}
}