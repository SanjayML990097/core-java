class MedicalShop{
	String medicineNames[] = new String[10];
	int index;
	
	public boolean addMedicine(String medicine){
		boolean isMedicineAdded = false;
		if(medicine != null && !medicine.isEmpty()){
			medicineNames[index++] = medicine;
			isMedicineAdded = true;
		}else{
			System.out.println("medicine not added");
		}
		return isMedicineAdded;
	}
	
	public void getMedicines(){
		System.out.println("the medicines are :");
		for(String medicine : medicineNames){
			System.out.println(medicine);
		}
	}
}
