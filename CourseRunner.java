class CourseRunner {

    public static void main(String[] args) {

        Course courses[] = new Course[15];

        Course c1 = new Course();
        c1.courseId = 1901;
        c1.name = "Java";
        c1.duration = 6;
        c1.fee = 15000;
        c1.institute = "Xworkz";
        courses[0] = c1;

        Course c2 = new Course();
        c2.courseId = 1902;
        c2.name = "Python";
        c2.duration = 4;
        c2.fee = 12000;
        c2.institute = "Udemy";
        courses[1] = c2;

        Course c3 = new Course();
        c3.courseId = 1903;
        c3.name = "Full Stack";
        c3.duration = 8;
        c3.fee = 25000;
        c3.institute = "Coursera";
        courses[2] = c3;

        Course c4 = new Course();
        c4.courseId = 1904;
        c4.name = "Data Science";
        c4.duration = 6;
        c4.fee = 30000;
        c4.institute = "Simplilearn";
        courses[3] = c4;

        Course c5 = new Course();
        c5.courseId = 1905;
        c5.name = "Machine Learning";
        c5.duration = 5;
        c5.fee = 28000;
        c5.institute = "edX";
        courses[4] = c5;

        Course c6 = new Course();
        c6.courseId = 1906;
        c6.name = "Cloud Computing";
        c6.duration = 4;
        c6.fee = 22000;
        c6.institute = "AWS Academy";
        courses[5] = c6;

        Course c7 = new Course();
        c7.courseId = 1907;
        c7.name = "Cyber Security";
        c7.duration = 5;
        c7.fee = 26000;
        c7.institute = "NIIT";
        courses[6] = c7;

        Course c8 = new Course();
        c8.courseId = 1908;
        c8.name = "DevOps";
        c8.duration = 4;
        c8.fee = 24000;
        c8.institute = "Great Learning";
        courses[7] = c8;

        Course c9 = new Course();
        c9.courseId = 1909;
        c9.name = "AI";
        c9.duration = 6;
        c9.fee = 32000;
        c9.institute = "Stanford Online";
        courses[8] = c9;

        Course c10 = new Course();
        c10.courseId = 1910;
        c10.name = "React";
        c10.duration = 3;
        c10.fee = 10000;
        c10.institute = "Udemy";
        courses[9] = c10;

        Course c11 = new Course();
        c11.courseId = 1911;
        c11.name = "Angular";
        c11.duration = 3;
        c11.fee = 11000;
        c11.institute = "Coursera";
        courses[10] = c11;

        Course c12 = new Course();
        c12.courseId = 1912;
        c12.name = "Spring Boot";
        c12.duration = 4;
        c12.fee = 18000;
        c12.institute = "Xworkz";
        courses[11] = c12;

        Course c13 = new Course();
        c13.courseId = 1913;
        c13.name = "SQL";
        c13.duration = 2;
        c13.fee = 8000;
        c13.institute = "Oracle";
        courses[12] = c13;

        Course c14 = new Course();
        c14.courseId = 1914;
        c14.name = "C++";
        c14.duration = 3;
        c14.fee = 9000;
        c14.institute = "NIIT";
        courses[13] = c14;

        Course c15 = new Course();
        c15.courseId = 1915;
        c15.name = "UI/UX";
        c15.duration = 3;
        c15.fee = 12000;
        c15.institute = "Google";
        courses[14] = c15;

    
        for (Course c : courses) {
            System.out.println(c.courseId);
            System.out.println(c.name);
            System.out.println(c.duration);
            System.out.println(c.fee);
            System.out.println(c.institute);
            System.out.println("----------------------");
        }
    }
}