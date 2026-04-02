class Salon{
	String services[] = new String[7];
	int index;
	
	public boolean addService(String service){
		boolean isServiceAdded = false;
		if(service != null && !service.isEmpty()){
			services[index++] = service;
			isServiceAdded = true;
		}else{
			System.out.println("service not added");
		}
		return isServiceAdded;
	}
	
	public void getServices(){
		System.out.println("the salon services are :");
		for(String service : services){
			System.out.println(service);
		}
	}
}
