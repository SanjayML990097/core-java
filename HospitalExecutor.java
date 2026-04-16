class HospitalExecutor
{
	public static void main(String [] exe)
	{
		String ramSpecializations[] = {"Cardiology","Haert Fitness"};
		String anoopSpecializations[]= {"bp","sugar"};
		String monuSpecializations[]={"Orthopaedics"," Orthopaedics and Joint Replacement"};
		String sandhuSpecializations[]={"Cardiac Sciences " ," Interventional Cardiology"};
		String ajaySpecializations[]={"Internal Medicine"," General Physician"," Internal Medicine"};
	
		Hospital hospital = new Hospital();
		
		Doctor doctor = new Doctor();
		
		doctor.doctorId = 1;
		doctor.doctorName = "Dr. Salil Jain";
		doctor.designation = "SENIOR DIRECTOR & HOD NEPHROLOGY & RENAL TRANSPLANT | Fortis Manesar";
		doctor.expericence = "21 Years";
		doctor.fees = 2000;
		doctor.specializations = ramSpecializations;
		
		boolean isDoctorAdd = hospital.createDoctor(doctor);
		System.out.println(isDoctorAdd);
		
		Doctor doctors = new Doctor();
		
		doctors.doctorId = 2;
		doctors.doctorName = "Ram";
		doctors.designation = "Chairman";
		doctors.expericence = "40 Years";
		doctors.fees = 2000;
		doctors.specializations = anoopSpecializations;
		
		boolean isDoctorAdded = hospital.createDoctor(doctors);
		System.out.println(isDoctorAdded);
		
		Doctor doctorss = new Doctor();
		
		doctorss.doctorId = 3;
		doctorss.doctorName = "Dr. Monu Singh";
		doctorss.designation = "DIRECTOR ORTHOPAEDICS | Fortis Manesar";
		doctorss.expericence = "25 Years";
		doctorss.fees = 1200;
		doctorss.specializations = monuSpecializations;
		
		boolean isDoctorAdds = hospital.createDoctor(doctorss);
		System.out.println(isDoctorAdds);
		
		Doctor doctorsnew = new Doctor();
		
		doctorsnew.doctorId = 4;
		doctorsnew.doctorName = "Dr. (Col) Manjinder Sandhu";
		doctorsnew.designation = "PRINCIPAL DIRECTOR CARDIOLOGY | Fortis Gurgaon";
		doctorsnew.expericence = "35 Years";
		doctorsnew.fees = 2000;
		doctorsnew.specializations = sandhuSpecializations;
		
		boolean isDoctorAddss = hospital.createDoctor(doctorsnew);
		System.out.println(isDoctorAddss);
		
		Doctor doctorsnews = new Doctor();
		
		doctorsnews.doctorId = 5;
		doctorsnews.doctorName = "Dr. Ajay Agarwal";
		doctorsnews.designation = "CHAIRMAN - INTERNAL MEDICINE | Fortis Noida";
		doctorsnews.expericence = "25 Years";
		doctorsnews.fees = 1400;
		doctorsnews.specializations = ajaySpecializations;
		
		boolean isDoctorAddedd = hospital.createDoctor(doctorsnews);
		System.out.println(isDoctorAddedd);
		
		hospital.getAllDoctors();
	}
}