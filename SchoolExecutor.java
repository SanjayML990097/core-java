class SchoolExecutor {

    public static void main(String[] args) {

        School schools[] = new School[15];

        School s1 = new School();
        s1.schoolId = 501;
        s1.schoolName = "National Public School";
        s1.location = "Bangalore";
        s1.noOfStudents = 2000;
        s1.board = "CBSE";
        schools[0] = s1;

        School s2 = new School();
        s2.schoolId = 502;
        s2.schoolName = "Delhi Public School";
        s2.location = "Bangalore";
        s2.noOfStudents = 2500;
        s2.board = "CBSE";
        schools[1] = s2;

        School s3 = new School();
        s3.schoolId = 503;
        s3.schoolName = "St. Joseph School";
        s3.location = "Mysore";
        s3.noOfStudents = 1800;
        s3.board = "ICSE";
        schools[2] = s3;

        School s4 = new School();
        s4.schoolId = 504;
        s4.schoolName = "Kendriya Vidyalaya";
        s4.location = "Hubli";
        s4.noOfStudents = 1500;
        s4.board = "CBSE";
        schools[3] = s4;

        School s5 = new School();
        s5.schoolId = 505;
        s5.schoolName = "Sri Chaitanya School";
        s5.location = "Bangalore";
        s5.noOfStudents = 3000;
        s5.board = "State";
        schools[4] = s5;

        School s6 = new School();
        s6.schoolId = 506;
        s6.schoolName = "Narayana School";
        s6.location = "Hyderabad";
        s6.noOfStudents = 2800;
        s6.board = "State";
        schools[5] = s6;

        School s7 = new School();
        s7.schoolId = 507;
        s7.schoolName = "Ryan International School";
        s7.location = "Bangalore";
        s7.noOfStudents = 2200;
        s7.board = "CBSE";
        schools[6] = s7;

        School s8 = new School();
        s8.schoolId = 508;
        s8.schoolName = "Oxford School";
        s8.location = "Mangalore";
        s8.noOfStudents = 1700;
        s8.board = "ICSE";
        schools[7] = s8;

        School s9 = new School();
        s9.schoolId = 509;
        s9.schoolName = "Vidyashilp Academy";
        s9.location = "Bangalore";
        s9.noOfStudents = 1600;
        s9.board = "ICSE";
        schools[8] = s9;

        School s10 = new School();
        s10.schoolId = 510;
        s10.schoolName = "Greenwood High";
        s10.location = "Bangalore";
        s10.noOfStudents = 2100;
        s10.board = "IB";
        schools[9] = s10;

        School s11 = new School();
        s11.schoolId = 511;
        s11.schoolName = "Bishop Cotton School";
        s11.location = "Shimoga";
        s11.noOfStudents = 1400;
        s11.board = "ICSE";
        schools[10] = s11;

        School s12 = new School();
        s12.schoolId = 512;
        s12.schoolName = "Presidency School";
        s12.location = "Bangalore";
        s12.noOfStudents = 2300;
        s12.board = "CBSE";
        schools[11] = s12;

        School s13 = new School();
        s13.schoolId = 513;
        s13.schoolName = "Cambridge School";
        s13.location = "Delhi";
        s13.noOfStudents = 1900;
        s13.board = "CBSE";
        schools[12] = s13;

        School s14 = new School();
        s14.schoolId = 514;
        s14.schoolName = "DAV School";
        s14.location = "Chennai";
        s14.noOfStudents = 1750;
        s14.board = "CBSE";
        schools[13] = s14;

        School s15 = new School();
        s15.schoolId = 515;
        s15.schoolName = "Modern School";
        s15.location = "Delhi";
        s15.noOfStudents = 2600;
        s15.board = "CBSE";
        schools[14] = s15;

        for (School school : schools) {
            System.out.println(school.schoolId);
            System.out.println(school.schoolName);
            System.out.println(school.location);
            System.out.println(school.noOfStudents);
            System.out.println(school.board);
            System.out.println("----------------------");
        }
    }
}