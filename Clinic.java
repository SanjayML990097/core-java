class Clinic {
    
    int clinicId;
    String clinicName;
    String clinicLocation;
    String clinicType;
    
    Doctor doctor;

    public void getClinicDetails() {
        System.out.println("The clinicId is: " + clinicId);
        System.out.println("The clinicName is: " + clinicName);
        System.out.println("The clinicLocation is: " + clinicLocation);
        System.out.println("The clinicType is: " + clinicType);

        doctor.getDoctorDetails();
    }
}



