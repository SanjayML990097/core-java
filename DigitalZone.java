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
	
	public boolean updateLaptopBrand(String oldBrand, String newBrand){
		boolean isUpdated = false;
		if(oldBrand != null && newBrand != null){
			for(int i=0; i<laptopBrandNames.length; i++){
				if(oldBrand.equals(laptopBrandNames[i])){
					laptopBrandNames[i] = newBrand;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("brand not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteLaptopBrand(String brand){
		boolean isDeleted = false;
		if(brand != null){
			for(int i=0; i<laptopBrandNames.length; i++){
				if(brand.equals(laptopBrandNames[i])){
					laptopBrandNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("brand not found to delete");
		}
		return isDeleted;
	}
	
	public void getLaptopBrands(){
		System.out.println("the laptop brands are :");
		for(String brand : laptopBrandNames){
			System.out.println(brand);
		}
	}
}  

