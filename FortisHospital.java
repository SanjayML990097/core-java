class FortisHospital{
	Doctor doctors[] = new Doctor[20];
	int index;
	
	
	public boolean addDoctor(Doctor doctor){
		boolean isDoctorAdded = false;
		boolean isIdValid= false;
		boolean isDoctorName = false;
		boolean isDesignation = false;
		boolean isExperience = false;
		boolean isfees = false;
		if(doctor.doctorId >0){
			isIdValid = true;
		}
		else System.out.println("Doctor Id is not valid");
		if(doctor.doctorName != null && !doctor.doctorName.isEmpty()){
			isDoctorName = true;
		}else System.out.println("Doctor name is not valid");
		
		if(doctor.designation != null && !doctor.designation.isEmpty()){
			isDesignation = true;
		}else System.out.println("Doctor Designation is not valid");
		
		if(doctor.experience != null && !doctor.experience.isEmpty()){
			isExperience = true;
		}else System.out.println("Doctor has not experience");
		
		if(doctor.fees >250 && doctor.fees <2500){
			isfees = true;
		}else System.out.println("Doctor Fees is not proper");
		
		
		if(isIdValid && isDoctorName && isDesignation && isExperience && isfees )
		{
			doctors[index++] = doctor;
			isDoctorAdded = true;
		}
		return isDoctorAdded;
	}
	
	public void getDoctors(){
		for(Doctor doctor:doctors){
			System.out.println("Doctor Id is"+ doctor.doctorId);
			System.out.println("Doctor Name is" + doctor.doctorName);
			System.out.println("Doctor Name is" + doctor.designation);
			System.out.println("Doctor Name is" + doctor.experience);
			System.out.println("Doctor Name is" + doctor.fees);
		}
	}
}