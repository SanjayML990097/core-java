class SuperMarket{
	String productNames[] = new String[8];
	int index;
	
	public boolean addProduct(String product){
		boolean isProductAdded = false;
		if(product != null && !product.isEmpty()){
			productNames[index++] = product;
			isProductAdded = true;
		}else{
			System.out.println("product not added");
		}
		return isProductAdded;
	}
	
	public void getProducts(){
		System.out.println("the supermarket products are :");
		for(String product : productNames){
			System.out.println(product);
		}
	}
}
