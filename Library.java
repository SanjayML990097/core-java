class Library{
	String bookNames[] = new String[13];
	int index;
	
	public boolean addBook(String book){
		boolean isBookAdded = false;
		if(book != null && !book.isEmpty()){
			bookNames[index++] = book;
			isBookAdded = true;
		}else{
			System.out.println("book not added");
		}
		return isBookAdded;
	}
	
	public void getBooks(){
		System.out.println("the library books are :");
		for(String book : bookNames){
			System.out.println(book);
		}
	}
}
