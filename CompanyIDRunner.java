class CompanyIDRunner {

    public static void main(String[] args) {

        CompanyID ids[] = new CompanyID[15];

        CompanyID c1 = new CompanyID();
        c1.idNumber = 1201;
        c1.role = "Software Engineer";
        c1.issueDate = "01-01-2023";
        c1.expiryDate = "01-01-2026";
        c1.companyName = "Infosys";
        ids[0] = c1;

        CompanyID c2 = new CompanyID();
        c2.idNumber = 1202;
        c2.role = "Tester";
        c2.issueDate = "05-02-2023";
        c2.expiryDate = "05-02-2026";
        c2.companyName = "TCS";
        ids[1] = c2;

        CompanyID c3 = new CompanyID();
        c3.idNumber = 1203;
        c3.role = "Manager";
        c3.issueDate = "10-03-2023";
        c3.expiryDate = "10-03-2026";
        c3.companyName = "Wipro";
        ids[2] = c3;

        CompanyID c4 = new CompanyID();
        c4.idNumber = 1204;
        c4.role = "HR";
        c4.issueDate = "15-04-2023";
        c4.expiryDate = "15-04-2026";
        c4.companyName = "Accenture";
        ids[3] = c4;

        CompanyID c5 = new CompanyID();
        c5.idNumber = 1205;
        c5.role = "Developer";
        c5.issueDate = "20-05-2023";
        c5.expiryDate = "20-05-2026";
        c5.companyName = "IBM";
        ids[4] = c5;

        CompanyID c6 = new CompanyID();
        c6.idNumber = 1206;
        c6.role = "Analyst";
        c6.issueDate = "25-06-2023";
        c6.expiryDate = "25-06-2026";
        c6.companyName = "Capgemini";
        ids[5] = c6;

        CompanyID c7 = new CompanyID();
        c7.idNumber = 1207;
        c7.role = "Support Engineer";
        c7.issueDate = "01-07-2023";
        c7.expiryDate = "01-07-2026";
        c7.companyName = "HCL";
        ids[6] = c7;

        CompanyID c8 = new CompanyID();
        c8.idNumber = 1208;
        c8.role = "Team Lead";
        c8.issueDate = "10-08-2023";
        c8.expiryDate = "10-08-2026";
        c8.companyName = "Tech Mahindra";
        ids[7] = c8;

        CompanyID c9 = new CompanyID();
        c9.idNumber = 1209;
        c9.role = "Consultant";
        c9.issueDate = "15-09-2023";
        c9.expiryDate = "15-09-2026";
        c9.companyName = "Deloitte";
        ids[8] = c9;

        CompanyID c10 = new CompanyID();
        c10.idNumber = 1210;
        c10.role = "Intern";
        c10.issueDate = "20-10-2023";
        c10.expiryDate = "20-10-2024";
        c10.companyName = "Google";
        ids[9] = c10;

        CompanyID c11 = new CompanyID();
        c11.idNumber = 1211;
        c11.role = "Data Scientist";
        c11.issueDate = "01-11-2023";
        c11.expiryDate = "01-11-2026";
        c11.companyName = "Microsoft";
        ids[10] = c11;

        CompanyID c12 = new CompanyID();
        c12.idNumber = 1212;
        c12.role = "UI Developer";
        c12.issueDate = "05-12-2023";
        c12.expiryDate = "05-12-2026";
        c12.companyName = "Amazon";
        ids[11] = c12;

        CompanyID c13 = new CompanyID();
        c13.idNumber = 1213;
        c13.role = "Backend Developer";
        c13.issueDate = "10-01-2024";
        c13.expiryDate = "10-01-2027";
        c13.companyName = "Flipkart";
        ids[12] = c13;

        CompanyID c14 = new CompanyID();
        c14.idNumber = 1214;
        c14.role = "System Engineer";
        c14.issueDate = "15-02-2024";
        c14.expiryDate = "15-02-2027";
        c14.companyName = "Oracle";
        ids[13] = c14;

        CompanyID c15 = new CompanyID();
        c15.idNumber = 1215;
        c15.role = "Project Manager";
        c15.issueDate = "20-03-2024";
        c15.expiryDate = "20-03-2027";
        c15.companyName = "SAP";
        ids[14] = c15;

        for (CompanyID id : ids) {
            System.out.println(id.idNumber);
            System.out.println(id.role);
            System.out.println(id.issueDate);
            System.out.println(id.expiryDate);
            System.out.println(id.companyName);
            System.out.println("----------------------");
        }
    }
}