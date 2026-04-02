class Military{
	String weaponNames[] = new String[21];
	int index;
	
	public boolean addWeapon(String weapon){
		boolean isWeaponAdded = false;
		if(weapon != null && !weapon.isEmpty()){
			weaponNames[index++] = weapon;
			isWeaponAdded = true;
		}else{
			System.out.println("weapon not added");
		}
		return isWeaponAdded;
	}
	
	public void getWeapons(){
		System.out.println("the military weapons are :");
		for(String weapon : weaponNames){
			System.out.println(weapon);
		}
	}
}
