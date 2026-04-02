
class HungamaExecuter{
	public static void main(String args[]){
		Hungama h = new Hungama();

		boolean added = h.addShow("Doraemon");
		System.out.println(added);
		added = h.addShow("Shinchan");
		System.out.println(added);
		added = h.addShow("Pokemon");
		System.out.println(added);
		added = h.addShow("Dragon Ball Z");
		System.out.println(added);
		added = h.addShow("Ninja Hattori");
		System.out.println(added);
		added = h.addShow("Kiteretsu");
		System.out.println(added);
		added = h.addShow("Perman");
		System.out.println(added);
		added = h.addShow("Power Rangers");
		System.out.println(added);
		added = h.addShow("Ben 10");
		System.out.println(added);
		added = h.addShow("Tom and Jerry");
		System.out.println(added);
		added = h.addShow("Mr. Bean");
		System.out.println(added);
		added = h.addShow("Chhota Bheem");
		System.out.println(added);
		added = h.addShow("Oggy and the Cockroaches");
		System.out.println(added);
		added = h.addShow("Motu Patlu");
		System.out.println(added);

		h.getShows();
	}
}