class EmployeeExecutor {

    public static void main(String[] args) {

        Employee employees[] = new Employee[15];

        Employee e1 = new Employee();
        e1.empId = 1101;
        e1.name = "Ravi";
        e1.age = 28;
        e1.department = "HR";
        e1.city = "Bangalore";
        employees[0] = e1;

        Employee e2 = new Employee();
        e2.empId = 1102;
        e2.name = "Sneha";
        e2.age = 26;
        e2.department = "Finance";
        e2.city = "Mysore";
        employees[1] = e2;

        Employee e3 = new Employee();
        e3.empId = 1103;
        e3.name = "Arjun";
        e3.age = 30;
        e3.department = "IT";
        e3.city = "Hyderabad";
        employees[2] = e3;

        Employee e4 = new Employee();
        e4.empId = 1104;
        e4.name = "Divya";
        e4.age = 27;
        e4.department = "Marketing";
        e4.city = "Chennai";
        employees[3] = e4;

        Employee e5 = new Employee();
        e5.empId = 1105;
        e5.name = "Kiran";
        e5.age = 29;
        e5.department = "Sales";
        e5.city = "Delhi";
        employees[4] = e5;

        Employee e6 = new Employee();
        e6.empId = 1106;
        e6.name = "Pooja";
        e6.age = 25;
        e6.department = "HR";
        e6.city = "Pune";
        employees[5] = e6;

        Employee e7 = new Employee();
        e7.empId = 1107;
        e7.name = "Manoj";
        e7.age = 31;
        e7.department = "IT";
        e7.city = "Bangalore";
        employees[6] = e7;

        Employee e8 = new Employee();
        e8.empId = 1108;
        e8.name = "Lakshmi";
        e8.age = 28;
        e8.department = "Finance";
        e8.city = "Mumbai";
        employees[7] = e8;

        Employee e9 = new Employee();
        e9.empId = 1109;
        e9.name = "Rahul";
        e9.age = 32;
        e9.department = "Sales";
        e9.city = "Kolkata";
        employees[8] = e9;

        Employee e10 = new Employee();
        e10.empId = 1110;
        e10.name = "Meena";
        e10.age = 27;
        e10.department = "Marketing";
        e10.city = "Jaipur";
        employees[9] = e10;

        Employee e11 = new Employee();
        e11.empId = 1111;
        e11.name = "Vikram";
        e11.age = 30;
        e11.department = "IT";
        e11.city = "Hyderabad";
        employees[10] = e11;

        Employee e12 = new Employee();
        e12.empId = 1112;
        e12.name = "Suresh";
        e12.age = 35;
        e12.department = "HR";
        e12.city = "Bangalore";
        employees[11] = e12;

        Employee e13 = new Employee();
        e13.empId = 1113;
        e13.name = "Kavya";
        e13.age = 26;
        e13.department = "Finance";
        e13.city = "Chennai";
        employees[12] = e13;

        Employee e14 = new Employee();
        e14.empId = 1114;
        e14.name = "Harsha";
        e14.age = 29;
        e14.department = "Sales";
        e14.city = "Pune";
        employees[13] = e14;

        Employee e15 = new Employee();
        e15.empId = 1115;
        e15.name = "Anil";
        e15.age = 33;
        e15.department = "IT";
        e15.city = "Delhi";
        employees[14] = e15;

        for (Employee emp : employees) {
            System.out.println(emp.empId);
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.department);
            System.out.println(emp.city);
            System.out.println("----------------------");
        }
    }
}