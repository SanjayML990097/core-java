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
	
	public boolean updateCategory(String oldCategory, String newCategory){
		boolean isUpdated = false;
		if(oldCategory != null && newCategory != null){
			for(int i=0; i<categoryNames.length; i++){
				if(oldCategory.equals(categoryNames[i])){
					categoryNames[i] = newCategory;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("category not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteCategory(String category){
		boolean isDeleted = false;
		if(category != null){
			for(int i=0; i<categoryNames.length; i++){
				if(category.equals(categoryNames[i])){
					categoryNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("category not found to delete");
		}
		return isDeleted;
	}
	
	public void getCategories(){
		System.out.println("the amazon categories are :");
		for(String category : categoryNames){
			System.out.println(category);
		}
	}
}           
