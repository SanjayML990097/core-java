class AmazonExecuter{
	public static void main(String args[]){
		Amazon a = new Amazon();

		boolean added = a.addCategory("Electronics");
		System.out.println(added);
		added = a.addCategory("Clothing");
		System.out.println(added);
		added = a.addCategory("Books");
		System.out.println(added);
		added = a.addCategory("Home & Kitchen");
		System.out.println(added);
		added = a.addCategory("Beauty");
		System.out.println(added);
		added = a.addCategory("Sports");
		System.out.println(added);
		added = a.addCategory("Toys");
		System.out.println(added);
		added = a.addCategory("Grocery");
		System.out.println(added);
		added = a.addCategory("Furniture");
		System.out.println(added);
		added = a.addCategory("Jewellery");
		System.out.println(added);
		added = a.addCategory("Footwear");
		System.out.println(added);
		added = a.addCategory("Watches");
		System.out.println(added);
		added = a.addCategory("Bags");
		System.out.println(added);
		added = a.addCategory("Automotive");
		System.out.println(added);
		added = a.addCategory("Pet Supplies");
		System.out.println(added);
		added = a.addCategory("Health");
		System.out.println(added);
		added = a.addCategory("Baby Products");
		System.out.println(added);
		added = a.addCategory("Office Supplies");
		System.out.println(added);
		added = a.addCategory("Garden");
		System.out.println(added);
		added = a.addCategory("Music");
		System.out.println(added);
		added = a.addCategory("Movies");
		System.out.println(added);

		boolean updated = a.updateCategory("Books", "E-Books");
		System.out.println(updated);

		boolean deleted = a.deleteCategory("Toys");
		System.out.println(deleted);

		a.getCategories();
	}
}