class ClinicExecutor {

    public static void main(String args[]) {

        Clinic ref = new Clinic();
        ref.clinicId = 1;
        ref.clinicName = "Sanjay Clinic";
        ref.clinicLocation = "J P Nagar";
        ref.clinicType = "Eye";

        Doctor doc = new Doctor();
        doc.doctorId = 1;
        doc.doctorName = "Karthik";
        doc.experience = 2;
        doc.fees = 2000;
        doc.specialization = "Eye Specialist";

        ref.doctor = doc;

        ref.getClinicDetails();
    }
}