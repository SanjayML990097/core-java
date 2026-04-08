class Rto{
	PersonalDetail personList[] = new PersonalDetail[13];
	int index;
	public boolean addPersonDetail(PersonalDetail personDetail){
		boolean isAdded = false;
		boolean isNameValid = false;
		boolean isdobValid = false;
		boolean isGenderValid = false;
		boolean isfatherNameValid = false;
		boolean isAddress =false;
		
		if(personDetail.name != null && !personDetail.name.isEmpty()){
			isNameValid = true;
		}else System.out.println("Name is not valid");
		if(personDetail.dateOfBirth != null && !personDetail.dateOfBirth.isEmpty()){
			isdobValid = true;
		}else System.out.println("Date of Birth is not valid");
		if(personDetail.gender != null && !personDetail.gender.isEmpty()){
			isGenderValid = true;
		}else System.out.println("Gender is not valid");
		if(personDetail.fatherName != null && !personDetail.fatherName.isEmpty()){
			isfatherNameValid = true; 
		}else System.out.println("Father name is not valid");
		if(personDetail.address != null && !personDetail.address.isEmpty()){
			isAddress = true;
		}else System.out.println("Addres is not valid");
		
		if(isNameValid && isdobValid && isGenderValid && isfatherNameValid && isAddress){
			personList[index++] = personDetail;
			isAdded =true; 
		}
		return isAdded;
	}
	public void getPersonDetail(){
			for(PersonalDetail anyThing:personList){
				System.out.println(anyThing.name);
				System.out.println(anyThing.dateOfBirth);
				System.out.println(anyThing.gender);
				System.out.println(anyThing.fatherName);
				System.out.println(anyThing.address);
		        System.out.println("*********************");
			}
	}
}