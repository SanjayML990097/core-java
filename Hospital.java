class Hospital
{
	Doctor doctors[]=new Doctor[5];
	
	int index;
	public boolean createDoctor(Doctor ref)
	{
		doctors[index]=ref;
		index++;
		return true;
	}
	public void getAllDoctors()
	{
	 for(Doctor doctor : doctors)
	 {
		System.out.println(doctor.doctorId);
		System.out.println(doctor.doctorName);
		System.out.println(doctor.designation);
		System.out.println(doctor.expericence);
		System.out.println(doctor.fees);
		for(String specialization : doctor.specializations)
		{
			System.out.println(specialization);
		}
	 }
		
		
	}

}