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
	
	public boolean updateWeapon(String oldWeapon, String newWeapon){
		boolean isUpdated = false;
		if(oldWeapon != null && newWeapon != null){
			for(int i=0; i<weaponNames.length; i++){
				if(oldWeapon.equals(weaponNames[i])){
					weaponNames[i] = newWeapon;
					isUpdated = true;
					break;
				}
			}
		}
		if(!isUpdated){
			System.out.println("weapon not found to update");
		}
		return isUpdated;
	}
	
	public boolean deleteWeapon(String weapon){
		boolean isDeleted = false;
		if(weapon != null){
			for(int i=0; i<weaponNames.length; i++){
				if(weapon.equals(weaponNames[i])){
					weaponNames[i] = null;
					isDeleted = true;
					break;
				}
			}
		}
		if(!isDeleted){
			System.out.println("weapon not found to delete");
		}
		return isDeleted;
	}
	
	public void getWeapons(){
		System.out.println("the military weapons are :");
		for(String weapon : weaponNames){
			System.out.println(weapon);
		}
	}
}  

