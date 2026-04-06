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
	
	public boolean updateBook(String oldBook, String newBook){
		boolean isUpdated = false;
		if(oldBook != null && newBook != null){
			for(int i=0; i<bookNames.length; i++){
				if(oldBook.equals(bookNames[i])){
					bookNames[i] = newBook;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("book not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteBook(String book){
		boolean isDeleted = false;
		if(book != null){
			for(int i=0; i<bookNames.length; i++){
				if(book.equals(bookNames[i])){
					bookNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("book not found to delete");
		}
		return isDeleted;
	}
	
	public void getBooks(){
		System.out.println("the library books are :");
		for(String book : bookNames){
			System.out.println(book);
		}
	}
}  

