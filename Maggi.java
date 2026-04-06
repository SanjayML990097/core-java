class Maggi{
	String ingredients[] = new String[12];
	int index;
	
	public boolean addIngredient(String ingredient){
		boolean isIngredientAdded = false;
		if(ingredient != null && !ingredient.isEmpty()){
			ingredients[index++] = ingredient;
			isIngredientAdded = true;
		}else{
			System.out.println("ingredient not added");
		}
		return isIngredientAdded;
	}
	
	public boolean updateIngredient(String oldIngredient, String newIngredient){
		boolean isUpdated = false;
		if(oldIngredient != null && newIngredient != null){
			for(int i=0; i<ingredients.length; i++){
				if(oldIngredient.equals(ingredients[i])){
					ingredients[i] = newIngredient;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("ingredient not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteIngredient(String ingredient){
		boolean isDeleted = false;
		if(ingredient != null){
			for(int i=0; i<ingredients.length; i++){
				if(ingredient.equals(ingredients[i])){
					ingredients[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("ingredient not found to delete");
		}
		return isDeleted;
	}
	
	public void getIngredients(){
		System.out.println("the maggi ingredients are :");
		for(String ingredient : ingredients){
			System.out.println(ingredient);
		}
	}
}  

