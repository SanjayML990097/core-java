
class TripExecuter{
	public static void main(String args[]){
		Trip t = new Trip();

		boolean added = t.addPlace("Mysore");
		System.out.println(added);
		added = t.addPlace("Coorg");
		System.out.println(added);
		added = t.addPlace("Ooty");
		System.out.println(added);
		added = t.addPlace("Goa");
		System.out.println(added);
		added = t.addPlace("Kerala");
		System.out.println(added);
		added = t.addPlace("Manali");
		System.out.println(added);
		added = t.addPlace("Shimla");
		System.out.println(added);
		added = t.addPlace("Darjeeling");
		System.out.println(added);
		added = t.addPlace("Jaipur");
		System.out.println(added);
		added = t.addPlace("Agra");
		System.out.println(added);
		added = t.addPlace("Delhi");
		System.out.println(added);
		added = t.addPlace("Mumbai");
		System.out.println(added);
		added = t.addPlace("Bangalore");
		System.out.println(added);

		t.getPlaces();
	}
}