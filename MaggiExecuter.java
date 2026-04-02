
class MaggiExecuter{
	public static void main(String args[]){
		Maggi m = new Maggi();

		boolean added = m.addIngredient("Wheat Flour");
		System.out.println(added);
		added = m.addIngredient("Palm Oil");
		System.out.println(added);
		added = m.addIngredient("Salt");
		System.out.println(added);
		added = m.addIngredient("Sugar");
		System.out.println(added);
		added = m.addIngredient("Spices");
		System.out.println(added);
		added = m.addIngredient("Onion Powder");
		System.out.println(added);
		added = m.addIngredient("Garlic Powder");
		System.out.println(added);
		added = m.addIngredient("Chili Powder");
		System.out.println(added);
		added = m.addIngredient("Turmeric");
		System.out.println(added);
		added = m.addIngredient("Flavor Enhancer");
		System.out.println(added);
		added = m.addIngredient("Vegetable Oil");
		System.out.println(added);
		added = m.addIngredient("Starch");
		System.out.println(added);

		m.getIngredients();
	}
}