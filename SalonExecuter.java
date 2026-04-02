
class SalonExecuter{
	public static void main(String args[]){
		Salon s = new Salon();

		boolean added = s.addService("Hair Cut");
		System.out.println(added);
		added = s.addService("Hair Wash");
		System.out.println(added);
		added = s.addService("Hair Coloring");
		System.out.println(added);
		added = s.addService("Facial");
		System.out.println(added);
		added = s.addService("Manicure");
		System.out.println(added);
		added = s.addService("Pedicure");
		System.out.println(added);
		added = s.addService("Shaving");
		System.out.println(added);

		s.getServices();
	}
}