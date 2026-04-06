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
	
	public boolean updateMedicine(String oldMedicine, String newMedicine){
		boolean isUpdated = false;
		if(oldMedicine != null && newMedicine != null){
			for(int i=0; i<medicineNames.length; i++){
				if(oldMedicine.equals(medicineNames[i])){
					medicineNames[i] = newMedicine;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("medicine not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteMedicine(String medicine){
		boolean isDeleted = false;
		if(medicine != null){
			for(int i=0; i<medicineNames.length; i++){
				if(medicine.equals(medicineNames[i])){
					medicineNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("medicine not found to delete");
		}
		return isDeleted;
	}
	
	public void getMedicines(){
		System.out.println("the medicines are :");
		for(String medicine : medicineNames){
			System.out.println(medicine);
		}
	}
}  

