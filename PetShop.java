class PetShop{
	String accessories[] = new String[16];
	int index;
	
	public boolean addAccessory(String accessory){
		boolean isAccessoryAdded = false;
		if(accessory != null && !accessory.isEmpty()){
			accessories[index++] = accessory;
			isAccessoryAdded = true;
		}else{
			System.out.println("accessory not added");
		}
		return isAccessoryAdded;
	}
	
	public void getAccessories(){
		System.out.println("the pet accessories are :");
		for(String accessory : accessories){
			System.out.println(accessory);
		}
	}
}
