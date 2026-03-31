class PersonExecutor {

    public static void main(String args[]) {

        Person ref = new Person();
        ref.personId = 1;
        ref.name = "Ravi";
        ref.age = 25;
        ref.gender = "Male";
        ref.address = "Bangalore";

        GovernmentIdentification g = new GovernmentIdentification();
        g.idNumber = 101;
        g.idType = "Aadhar";
        g.issuedBy = "Government of India";
        g.issueDate = "2020-01-01";
        g.expiryDate = "2030-01-01";

        ref.governmentIdentification = g;
		// 1
Person ref1 = new Person();
ref1.personId = 1;
ref1.name = "Person1";
ref1.age = 21;
ref1.gender = "Male";
ref1.address = "City1";

GovernmentIdentification g1 = new GovernmentIdentification();
g1.idNumber = 101;
g1.idType = "Aadhar";
g1.issuedBy = "Govt";
g1.issueDate = "2020-01-01";
g1.expiryDate = "2030-01-01";

ref1.governmentIdentification = g1;
ref1.getPersonDetails();

// 2
Person ref2 = new Person();
ref2.personId = 2;
ref2.name = "Person2";
ref2.age = 22;
ref2.gender = "Female";
ref2.address = "City2";

GovernmentIdentification g2 = new GovernmentIdentification();
g2.idNumber = 102;
g2.idType = "PAN";
g2.issuedBy = "Govt";
g2.issueDate = "2019-02-01";
g2.expiryDate = "2029-02-01";

ref2.governmentIdentification = g2;
ref2.getPersonDetails();

// 3
Person ref3 = new Person();
ref3.personId = 3;
ref3.name = "Person3";
ref3.age = 23;
ref3.gender = "Male";
ref3.address = "City3";

GovernmentIdentification g3 = new GovernmentIdentification();
g3.idNumber = 103;
g3.idType = "Passport";
g3.issuedBy = "Govt";
g3.issueDate = "2018-03-01";
g3.expiryDate = "2028-03-01";

ref3.governmentIdentification = g3;
ref3.getPersonDetails();

// 4
Person ref4 = new Person();
ref4.personId = 4;
ref4.name = "Person4";
ref4.age = 24;
ref4.gender = "Female";
ref4.address = "City4";

GovernmentIdentification g4 = new GovernmentIdentification();
g4.idNumber = 104;
g4.idType = "Driving License";
g4.issuedBy = "RTO";
g4.issueDate = "2021-04-01";
g4.expiryDate = "2031-04-01";

ref4.governmentIdentification = g4;
ref4.getPersonDetails();

// 5
Person ref5 = new Person();
ref5.personId = 5;
ref5.name = "Person5";
ref5.age = 25;
ref5.gender = "Male";
ref5.address = "City5";

GovernmentIdentification g5 = new GovernmentIdentification();
g5.idNumber = 105;
g5.idType = "Voter ID";
g5.issuedBy = "Election Commission";
g5.issueDate = "2022-05-01";
g5.expiryDate = "2032-05-01";

ref5.governmentIdentification = g5;
ref5.getPersonDetails();

// continue same pattern till 29

        ref.getPersonDetails();
    }
}