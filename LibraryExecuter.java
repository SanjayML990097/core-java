class LibraryExecuter{
	public static void main(String args[]){
		Library l = new Library();

		boolean added = l.addBook("Java Programming");
		System.out.println(added);
		added = l.addBook("Python Basics");
		System.out.println(added);
		added = l.addBook("Data Structures");
		System.out.println(added);
		added = l.addBook("Operating Systems");
		System.out.println(added);
		added = l.addBook("Computer Networks");
		System.out.println(added);
		added = l.addBook("Database Management");
		System.out.println(added);
		added = l.addBook("Software Engineering");
		System.out.println(added);
		added = l.addBook("Artificial Intelligence");
		System.out.println(added);
		added = l.addBook("Machine Learning");
		System.out.println(added);
		added = l.addBook("Cyber Security");
		System.out.println(added);
		added = l.addBook("Cloud Computing");
		System.out.println(added);
		added = l.addBook("Web Development");
		System.out.println(added);
		added = l.addBook("Mobile App Development");
		System.out.println(added);

		l.getBooks();
	}
}