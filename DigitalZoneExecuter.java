class DigitalZoneExecuter{
	public static void main(String args[]){
		DigitalZone d = new DigitalZone();

		boolean added = d.addLaptopBrand("HP");
		System.out.println(added);
		added = d.addLaptopBrand("Dell");
		System.out.println(added);
		added = d.addLaptopBrand("Lenovo");
		System.out.println(added);
		added = d.addLaptopBrand("Asus");
		System.out.println(added);
		added = d.addLaptopBrand("Acer");
		System.out.println(added);
		added = d.addLaptopBrand("Apple");
		System.out.println(added);

		boolean updated = d.updateLaptopBrand("Dell", "Dell Inspiron");
		System.out.println(updated);

		boolean deleted = d.deleteLaptopBrand("Acer");
		System.out.println(deleted);

		d.getLaptopBrands();
	}
}