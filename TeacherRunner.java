class TeacherRunner {

    public static void main(String[] args) {

        Teacher teachers[] = new Teacher[15];

        Teacher t1 = new Teacher();
        t1.teacherId = 301;
        t1.name = "Ravi";
        t1.subject = "Maths";
        t1.salary = 45000;
        t1.qualification = "MSc";
        teachers[0] = t1;

        Teacher t2 = new Teacher();
        t2.teacherId = 302;
        t2.name = "Sita";
        t2.subject = "Physics";
        t2.salary = 48000;
        t2.qualification = "MSc";
        teachers[1] = t2;

        Teacher t3 = new Teacher();
        t3.teacherId = 303;
        t3.name = "Anil";
        t3.subject = "Chemistry";
        t3.salary = 47000;
        t3.qualification = "MSc";
        teachers[2] = t3;

        Teacher t4 = new Teacher();
        t4.teacherId = 304;
        t4.name = "Meena";
        t4.subject = "Biology";
        t4.salary = 46000;
        t4.qualification = "MSc";
        teachers[3] = t4;

        Teacher t5 = new Teacher();
        t5.teacherId = 305;
        t5.name = "Kiran";
        t5.subject = "English";
        t5.salary = 44000;
        t5.qualification = "MA";
        teachers[4] = t5;

        Teacher t6 = new Teacher();
        t6.teacherId = 306;
        t6.name = "Priya";
        t6.subject = "Computer Science";
        t6.salary = 50000;
        t6.qualification = "MCA";
        teachers[5] = t6;

        Teacher t7 = new Teacher();
        t7.teacherId = 307;
        t7.name = "Ramesh";
        t7.subject = "History";
        t7.salary = 43000;
        t7.qualification = "MA";
        teachers[6] = t7;

        Teacher t8 = new Teacher();
        t8.teacherId = 308;
        t8.name = "Divya";
        t8.subject = "Geography";
        t8.salary = 42000;
        t8.qualification = "MA";
        teachers[7] = t8;

        Teacher t9 = new Teacher();
        t9.teacherId = 309;
        t9.name = "Arun";
        t9.subject = "Economics";
        t9.salary = 41000;
        t9.qualification = "MA";
        teachers[8] = t9;

        Teacher t10 = new Teacher();
        t10.teacherId = 310;
        t10.name = "Sneha";
        t10.subject = "Political Science";
        t10.salary = 40500;
        t10.qualification = "MA";
        teachers[9] = t10;

        Teacher t11 = new Teacher();
        t11.teacherId = 311;
        t11.name = "Vikram";
        t11.subject = "Maths";
        t11.salary = 46000;
        t11.qualification = "MSc";
        teachers[10] = t11;

        Teacher t12 = new Teacher();
        t12.teacherId = 312;
        t12.name = "Pooja";
        t12.subject = "Physics";
        t12.salary = 47000;
        t12.qualification = "MSc";
        teachers[11] = t12;

        Teacher t13 = new Teacher();
        t13.teacherId = 313;
        t13.name = "Rahul";
        t13.subject = "Chemistry";
        t13.salary = 48000;
        t13.qualification = "MSc";
        teachers[12] = t13;

        Teacher t14 = new Teacher();
        t14.teacherId = 314;
        t14.name = "Lakshmi";
        t14.subject = "Biology";
        t14.salary = 45000;
        t14.qualification = "MSc";
        teachers[13] = t14;

        Teacher t15 = new Teacher();
        t15.teacherId = 315;
        t15.name = "Manoj";
        t15.subject = "Computer Science";
        t15.salary = 52000;
        t15.qualification = "MCA";
        teachers[14] = t15;
		
        for (Teacher teacher : teachers) {
            System.out.println(teacher.teacherId);
            System.out.println(teacher.name);
            System.out.println(teacher.subject);
            System.out.println(teacher.salary);
            System.out.println(teacher.qualification);
            System.out.println("----------------------");
        }
    }
}