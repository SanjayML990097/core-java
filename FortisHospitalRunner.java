class FortisHospitalRunner{
	public static void main(String[] args){
		
		String anoopMisra[] = {"Diabetology","Endocrinology"};
		FortisHospital hospital = new FortisHospital();
		
		Doctor doctor = new Doctor();
		
		doctor.doctorId = 1;
		doctor.doctorName ="Dr. Anoop Misra";
		doctor.designation ="PRINCIPAL DIRECTOR CARDIOLOGY";
		doctor.experience = "35 Years";
		doctor.specializations = anoopMisra;
		doctor.fees = 1000;

		boolean isDoctorAdded=hospital.addDoctor(doctor);
		System.out.println(isDoctorAdded);
		
		Doctor doctorTwo = new Doctor();
		
		doctorTwo.doctorId = 2;
		doctorTwo.doctorName ="Dr. (Col) Manjinder Sandhu";
		doctorTwo.designation ="EXECUTIVE CHAIRMAN";
		doctorTwo.experience = "40 Years";
		doctorTwo.specializations = anoopMisra;
		doctorTwo.fees = 1000;

		isDoctorAdded=hospital.addDoctor(doctorTwo);
		System.out.println(isDoctorAdded);
		
		Doctor doctorThree = new Doctor();
		
		doctorThree.doctorId = 3;
		doctorThree.doctorName ="Dr. (Prof.) Amit Javed";
		doctorThree.designation ="PRINCIPAL DIRECTOR & HOD LAP GI, GI ONCO";
		doctorThree.experience = "25 years";
		doctorThree.specializations = anoopMisra;
		doctorThree.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorThree);
		System.out.println(isDoctorAdded);
		
		Doctor doctorFour = new Doctor();
		
		doctorFour.doctorId = 4;
		doctorFour.doctorName ="Dr. Ajay Agarwal";
		doctorFour.designation ="CHAIRMAN - INTERNAL MEDICINE  ";
		doctorFour.experience = "25 Years";
		doctorFour.specializations = anoopMisra;
		doctorFour.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorFour);
		System.out.println(isDoctorAdded);
		
		Doctor doctorFive = new Doctor();
		
		doctorFive.doctorId = 5;
		doctorFive.doctorName ="Dr. Ajay Kaul";
		doctorFive.designation ="CHAIRMAN CARDIAC SCIENCE";
		doctorFive.experience = "38 years";
		doctorFive.specializations = anoopMisra;
		doctorFive.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorFive);
		System.out.println(isDoctorAdded);
		
		Doctor doctorSix = new Doctor();
		
		doctorSix.doctorId = 6;
		doctorSix.doctorName ="Dr. Ajit Singh Narula";
		doctorSix.designation ="PRINCIPAL DIRECTOR NEPHROLOGY ";
		doctorSix.experience = "40 years";
		doctorSix.specializations = anoopMisra;
		doctorSix.fees = 1000;

		isDoctorAdded=hospital.addDoctor(doctorSix);
		System.out.println(isDoctorAdded);
		
		Doctor doctorSeven = new Doctor();
		doctorSeven.doctorId = 7;
		doctorSeven.doctorName ="Dr. Amite Pankaj Aggarwal";
		doctorSeven.designation ="PRINCIPAL DIRECTOR & HOD - ORTHOPAEDICS ";
		doctorSeven.experience = "27 Years";
		doctorSeven.specializations = anoopMisra;
		doctorSeven.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorSeven);
		System.out.println(isDoctorAdded);
		
		Doctor doctorEight = new Doctor();
		doctorEight.doctorId = 8;
		doctorEight.doctorName ="Dr. Amite Pankaj Aggarwal";
		doctorEight.designation ="PRINCIPAL DIRECTOR & HOD - ORTHOPAEDICS ";
		doctorEight.experience = "27 Years";
		doctorEight.specializations = anoopMisra;
		doctorEight.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorSeven);
		System.out.println(isDoctorAdded);
		
		Doctor doctorNine = new Doctor();
		doctorNine.doctorId = 9;
		doctorNine.doctorName ="Dr. Anil Kumar Anand";
		doctorNine.designation ="PRINCIPAL DIRECTOR & HOD - ORTHOPAEDICS ";
		doctorNine.experience = "27 Years";
		doctorNine.specializations = anoopMisra;
		doctorNine.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorSeven);
		System.out.println(isDoctorAdded);
		
		
		Doctor doctorTen = new Doctor();
		doctorTen.doctorId = 10;
		doctorTen.doctorName ="Dr. Anil Mandhani";
		doctorTen.designation ="CHAIRMAN-UROLOGY ";
		doctorTen.experience = "35 Years";
		doctorTen.specializations = anoopMisra;
		doctorTen.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorSeven);
		System.out.println(isDoctorAdded);
		
		Doctor doctorEleven = new Doctor();
		
		doctorEleven.doctorId = 11;
		doctorEleven.doctorName ="Dr. Anita Saxena";
		doctorEleven.designation ="EXECUTIVE DIRECTOR PAEDIATRIC CARDIOLOGY";
		doctorEleven.experience = "40 Years";
		doctorEleven.specializations = anoopMisra;
		doctorEleven.fees = 1000;

		isDoctorAdded=hospital.addDoctor(doctorEleven);
		System.out.println(isDoctorAdded);
		
		Doctor doctorTwelve = new Doctor();
		
		doctorTwelve.doctorId = 12;
		doctorTwelve.doctorName ="Dr. Anil Saxena";
		doctorTwelve.designation ="CHAIRMAN CARDIOLOGY ";
		doctorTwelve.experience = "35 Years";
		doctorTwelve.specializations = anoopMisra;
		doctorTwelve.fees = 1000;

		isDoctorAdded=hospital.addDoctor(doctorTwelve);
		System.out.println(isDoctorAdded);
		
		Doctor doctorThirten = new Doctor();
		
		doctorThirten.doctorId = 13;
		doctorThirten.doctorName ="Dr. Ankur BAHL";
		doctorThirten.designation ="PRINCIPAL DIRECTOR MEDICAL ONCOLOGY";
		doctorThirten.experience = "15 Years";
		doctorThirten.specializations = anoopMisra;
		doctorThirten.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorThirten);
		System.out.println(isDoctorAdded);
		
		Doctor doctorForteen = new Doctor();
		
		doctorForteen.doctorId = 14;
		doctorForteen.doctorName ="Dr. Ankur Bahl";
		doctorForteen.designation ="PRINCIPAL DIRECTOR MEDICAL ONCOLOGY";
		doctorForteen.experience = "15 Years";
		doctorForteen.specializations = anoopMisra;
		doctorForteen.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorForteen);
		System.out.println(isDoctorAdded);
		
		Doctor doctorFifteen = new Doctor();
		
		doctorFifteen.doctorId = 15;
		doctorFifteen.doctorName ="Dr. Arvind Kumar";
		doctorFifteen.designation ="PRINCIPAL DIRECTOR & HOD PAEDIATRICS ";
		doctorFifteen.experience = "42 Years";
		doctorFifteen.specializations = anoopMisra;
		doctorFifteen.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorFifteen);
		System.out.println(isDoctorAdded);
		
		Doctor doctorSixteen = new Doctor();
		
		doctorSixteen.doctorId = 16;
		doctorSixteen.doctorName ="Dr. Arvind Kumar";
		doctorSixteen.designation ="PRINCIPAL DIRECTOR & HOD PAEDIATRICS";
		doctorSixteen.experience = "42 Years";
		doctorSixteen.specializations = anoopMisra;
		doctorSixteen.fees = 1000;

		isDoctorAdded=hospital.addDoctor(doctorSixteen);
		System.out.println(isDoctorAdded);
		
		Doctor doctorSeventeen = new Doctor();
		doctorSeventeen.doctorId = 17;
		doctorSeventeen.doctorName ="Dr. Arvind Kumar Khurana";
		doctorSeventeen.designation ="PRINCIPAL DIRECTOR GASTROENTEROLOGY ";
		doctorSeventeen.experience = "35 Years";
		doctorSeventeen.specializations = anoopMisra;
		doctorSeventeen.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorSeventeen);
		System.out.println(isDoctorAdded);
		
		Doctor doctorEighteen = new Doctor();
		doctorEighteen.doctorId = 18;
		doctorEighteen.doctorName ="Dr. Ashok Seth";
		doctorEighteen.designation ="CHAIRMAN CARDIAC SCIENCE";
		doctorEighteen.experience = "40 Years";
		doctorEighteen.specializations = anoopMisra;
		doctorEighteen.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorEighteen);
		System.out.println(isDoctorAdded);
		
		Doctor doctorNinteen = new Doctor();
		doctorNinteen.doctorId = 19;
		doctorNinteen.doctorName ="Dr. Atul Kumar Mittal";
		doctorNinteen.designation ="PRINCIPAL DIRECTOR ENT";
		doctorNinteen.experience = "27 Years";
		doctorNinteen.specializations = anoopMisra;
		doctorNinteen.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorNinteen);
		System.out.println(isDoctorAdded);
		
		
		Doctor doctorTwenty = new Doctor();
		doctorTwenty.doctorId = 20;
		doctorTwenty.doctorName ="Dr. Atul Mathur";
		doctorTwenty.designation ="PRINCIPAL DIRECTOR & HOD - ORTHOPAEDICS ";
		doctorTwenty.experience = "34 Years";
		doctorTwenty.specializations = anoopMisra;
		doctorTwenty.fees = 1000;

		 isDoctorAdded=hospital.addDoctor(doctorTwenty);
		System.out.println(isDoctorAdded);
		
		
		
		hospital.getDoctors();
	}
}




