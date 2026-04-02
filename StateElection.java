class StateElection{
	String partyNames[] = new String[7];
	int index;
	
	public boolean addParty(String party){
		boolean isPartyAdded = false;
		if(party != null && !party.isEmpty()){
			partyNames[index++] = party;
			isPartyAdded = true;
		}else{
			System.out.println("party not added");
		}
		return isPartyAdded;
	}
	
	public void getParties(){
		System.out.println("the political parties are :");
		for(String party : partyNames){
			System.out.println(party);
		}
	}
}
