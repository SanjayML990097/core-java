class MedicalShopExecuter{
	public static void main(String args[]){
		MedicalShop m = new MedicalShop();

		boolean added = m.addMedicine("Paracetamol");
		System.out.println(added);
		added = m.addMedicine("Ibuprofen");
		System.out.println(added);
		added = m.addMedicine("Aspirin");
		System.out.println(added);
		added = m.addMedicine("Cetirizine");
		System.out.println(added);
		added = m.addMedicine("Amoxicillin");
		System.out.println(added);
		added = m.addMedicine("Azithromycin");
		System.out.println(added);
		added = m.addMedicine("Metformin");
		System.out.println(added);
		added = m.addMedicine("Omeprazole");
		System.out.println(added);
		added = m.addMedicine("Dolo 650");
		System.out.println(added);
		added = m.addMedicine("Cough Syrup");
		System.out.println(added);

		boolean updated = m.updateMedicine("Aspirin", "Disprin");
		System.out.println(updated);

		boolean deleted = m.deleteMedicine("Ibuprofen");
		System.out.println(deleted);

		m.getMedicines();
	}
}