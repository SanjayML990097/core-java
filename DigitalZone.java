class DigitalZone{
	String laptopBrandNames[] = new String[6];
	int index;
	
	public boolean addLaptopBrand(String brand){
		boolean isBrandAdded = false;
		if(brand != null && !brand.isEmpty()){
			laptopBrandNames[index++] = brand;
			isBrandAdded = true;
		}else{
			System.out.println("brand not added");
		}
		return isBrandAdded;
	}
	
	public void getLaptopBrands(){
		System.out.println("the laptop brands are :");
		for(String brand : laptopBrandNames){
			System.out.println(brand);
		}
	}
}
