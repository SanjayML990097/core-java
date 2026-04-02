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
	
	public void getIngredients(){
		System.out.println("the maggi ingredients are :");
		for(String ingredient : ingredients){
			System.out.println(ingredient);
		}
	}
}
