class StudentExecutor {

    public static void main(String[] args) {

        Student students[] = new Student[15];

        Student s1 = new Student();
        s1.studentId = 401;
        s1.name = "Adithya";
        s1.age = 22;
        s1.course = "BCA";
        s1.college = "VTU";
        students[0] = s1;

        Student s2 = new Student();
        s2.studentId = 402;
        s2.name = "Rahul";
        s2.age = 23;
        s2.course = "MCA";
        s2.college = "Bangalore University";
        students[1] = s2;

        Student s3 = new Student();
        s3.studentId = 403;
        s3.name = "Sneha";
        s3.age = 21;
        s3.course = "BSc";
        s3.college = "Jain College";
        students[2] = s3;

        Student s4 = new Student();
        s4.studentId = 404;
        s4.name = "Kiran";
        s4.age = 22;
        s4.course = "BCom";
        s4.college = "Christ University";
        students[3] = s4;

        Student s5 = new Student();
        s5.studentId = 405;
        s5.name = "Divya";
        s5.age = 20;
        s5.course = "BA";
        s5.college = "Mount Carmel";
        students[4] = s5;

        Student s6 = new Student();
        s6.studentId = 406;
        s6.name = "Arjun";
        s6.age = 23;
        s6.course = "MCA";
        s6.college = "VTU";
        students[5] = s6;

        Student s7 = new Student();
        s7.studentId = 407;
        s7.name = "Pooja";
        s7.age = 21;
        s7.course = "BCA";
        s7.college = "Dayananda Sagar";
        students[6] = s7;

        Student s8 = new Student();
        s8.studentId = 408;
        s8.name = "Manoj";
        s8.age = 22;
        s8.course = "BSc";
        s8.college = "Reva University";
        students[7] = s8;

        Student s9 = new Student();
        s9.studentId = 409;
        s9.name = "Anil";
        s9.age = 24;
        s9.course = "MBA";
        s9.college = "IIM Bangalore";
        students[8] = s9;

        Student s10 = new Student();
        s10.studentId = 410;
        s10.name = "Lakshmi";
        s10.age = 23;
        s10.course = "MCom";
        s10.college = "Bangalore University";
        students[9] = s10;

        Student s11 = new Student();
        s11.studentId = 411;
        s11.name = "Ravi";
        s11.age = 22;
        s11.course = "BCA";
        s11.college = "VTU";
        students[10] = s11;

        Student s12 = new Student();
        s12.studentId = 412;
        s12.name = "Meena";
        s12.age = 21;
        s12.course = "BSc";
        s12.college = "Jain College";
        students[11] = s12;

        Student s13 = new Student();
        s13.studentId = 413;
        s13.name = "Vikram";
        s13.age = 23;
        s13.course = "MBA";
        s13.college = "Christ University";
        students[12] = s13;

        Student s14 = new Student();
        s14.studentId = 414;
        s14.name = "Snehal";
        s14.age = 22;
        s14.course = "MCA";
        s14.college = "Reva University";
        students[13] = s14;

        Student s15 = new Student();
        s15.studentId = 415;
        s15.name = "Harsha";
        s15.age = 20;
        s15.course = "BCA";
        s15.college = "Dayananda Sagar";
        students[14] = s15;


        for (Student student : students) {
            System.out.println(student.studentId);
            System.out.println(student.name);
            System.out.println(student.age);
            System.out.println(student.course);
            System.out.println(student.college);
            System.out.println("----------------------");
        }
    }
}