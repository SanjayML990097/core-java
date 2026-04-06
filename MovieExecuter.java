class MovieExecuter{
	public static void main(String args[]){
		Movie m = new Movie();

		boolean added = m.addCast("Actor 1");
		System.out.println(added);
		added = m.addCast("Actor 2");
		System.out.println(added);
		added = m.addCast("Actor 3");
		System.out.println(added);
		added = m.addCast("Actor 4");
		System.out.println(added);
		added = m.addCast("Actor 5");
		System.out.println(added);
		added = m.addCast("Actor 6");
		System.out.println(added);
		added = m.addCast("Actor 7");
		System.out.println(added);
		added = m.addCast("Actor 8");
		System.out.println(added);
		added = m.addCast("Actor 9");
		System.out.println(added);

		boolean updated = m.updateCast("Actor 3", "Lead Actor");
		System.out.println(updated);

		boolean deleted = m.deleteCast("Actor 6");
		System.out.println(deleted);

		m.getCasts();
	}
}