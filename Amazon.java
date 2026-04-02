class Amazon{
	String categoryNames[] = new String[21];
	int index;
	
	public boolean addCategory(String category){
		boolean isCategoryAdded = false;
		if(category != null && !category.isEmpty()){
			categoryNames[index++] = category;
			isCategoryAdded = true;
		}else{
			System.out.println("category not added");
		}
		return isCategoryAdded;
	}
	
	public void getCategories(){
		System.out.println("the amazon categories are :");
		for(String category : categoryNames){
			System.out.println(category);
		}
	}
}
