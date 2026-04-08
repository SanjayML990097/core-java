class RtoRunner{
	public static void main(String[] args){
		Rto rto = new Rto();
		
		PersonalDetail personDetail = new PersonalDetail();
		
		personDetail.name ="Adithya";
		personDetail.dateOfBirth = "10/01/2001";
		personDetail.gender = "Male";
		personDetail.fatherName = "Manju";
		personDetail.address = "Shimogga";
		
		boolean IsAdded= rto.addPersonDetail(personDetail);
		System.out.println(IsAdded);
		
		PersonalDetail p1 = new PersonalDetail();
		p1.name = "Adithya";
		p1.dateOfBirth = "10/01/2001";
		p1.gender = "Male";
		p1.fatherName = "Manju";
		p1.address = "Shimogga";
		
	   IsAdded= rto.addPersonDetail(p1);
		System.out.println(IsAdded);

		PersonalDetail p2 = new PersonalDetail();
		p2.name = "Rohit";
		p2.dateOfBirth = "15/03/2000";
		p2.gender = "Male";
		p2.fatherName = "Suresh";
		p2.address = "Bangalore";
		
		IsAdded= rto.addPersonDetail(p2);
		System.out.println(IsAdded);
		

		PersonalDetail p3 = new PersonalDetail();
		p3.name = "Priya";
		p3.dateOfBirth = "22/07/2002";
		p3.gender = "Female";
		p3.fatherName = "Ramesh";
		p3.address = "Mysore";
		
		IsAdded= rto.addPersonDetail(p3);
		System.out.println(IsAdded);
		

		PersonalDetail p4 = new PersonalDetail();
		p4.name = "Kiran";
		p4.dateOfBirth = "05/11/1999";
		p4.gender = "Male";
		p4.fatherName = "Shankar";
		p4.address = "Hubli";
		
		IsAdded= rto.addPersonDetail(p4);
		System.out.println(IsAdded);
		

		PersonalDetail p5 = new PersonalDetail();
		p5.name = "Sneha";
		p5.dateOfBirth = "18/09/2001";
		p5.gender = "Female";
		p5.fatherName = "Mahesh";
		p5.address = "Mangalore";
		
		IsAdded= rto.addPersonDetail(p5);
		System.out.println(IsAdded);
		

		PersonalDetail p6 = new PersonalDetail();
		p6.name = "Arjun";
		p6.dateOfBirth = "30/12/2000";
		p6.gender = "Male";
		p6.fatherName = "Ravi";
		p6.address = "Tumkur";
		
		IsAdded= rto.addPersonDetail(p6);
		System.out.println(IsAdded);
		

		PersonalDetail p7 = new PersonalDetail();
		p7.name = "Divya";
		p7.dateOfBirth = "08/06/2003";
		p7.gender = "Female";
		p7.fatherName = "Kumar";
		p7.address = "Davangere";
		
		IsAdded= rto.addPersonDetail(p7);
		System.out.println(IsAdded);
		

		PersonalDetail p8 = new PersonalDetail();
		p8.name = "Vikas";
		p8.dateOfBirth = "27/02/1998";
		p8.gender = "Male";
		p8.fatherName = "Prakash";
		p8.address = "Belgaum";
		
		IsAdded= rto.addPersonDetail(p8);
		System.out.println(IsAdded);
		

		PersonalDetail p9 = new PersonalDetail();
		p9.name = "Pooja";
		p9.dateOfBirth = "14/04/2002";
		p9.gender = "Female";
		p9.fatherName = "Nagaraj";
		p9.address = "Udupi";
		
		IsAdded= rto.addPersonDetail(p9);
		System.out.println(IsAdded);
		

		PersonalDetail p10 = new PersonalDetail();
		p10.name = "Rahul";
		p10.dateOfBirth = "01/01/2000";
		p10.gender = "Male";
		p10.fatherName = "Anand";
		p10.address = "Chitradurga";
		
		IsAdded= rto.addPersonDetail(p10);
		System.out.println(IsAdded);
		

		PersonalDetail p11 = new PersonalDetail();
		p11.name = "Anjali";
		p11.dateOfBirth = "19/08/2001";
		p11.gender = "Female";
		p11.fatherName = "Harish";
		p11.address = "Hassan";
		
		IsAdded= rto.addPersonDetail(p11);
		System.out.println(IsAdded);
		

		PersonalDetail p12 = new PersonalDetail();
		p12.name = "Sanjay";
		p12.dateOfBirth = "25/05/1999";
		p12.gender = "Male";
		p12.fatherName = "Gopal";
		p12.address = "Bidar";
		
		IsAdded= rto.addPersonDetail(p12);
		System.out.println(IsAdded);
		
		
		rto.getPersonDetail();
	}
}