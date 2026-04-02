class PoliceStation{
	String caseNames[] = new String[16];
	int index;
	
	public boolean addCase(String caseName){
		boolean isCaseAdded = false;
		if(caseName != null && !caseName.isEmpty()){
			caseNames[index++] = caseName;
			isCaseAdded = true;
		}else{
			System.out.println("case not added");
		}
		return isCaseAdded;
	}
	
	public void getCases(){
		System.out.println("the police cases are :");
		for(String caseName : caseNames){
			System.out.println(caseName);
		}
	}
}
