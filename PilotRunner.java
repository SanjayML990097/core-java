class PilotRunner {

    public static void main(String[] args) {

        Pilot pilots[] = new Pilot[15];

        Pilot p1 = new Pilot();
        p1.pilotId = 701;
        p1.name = "Arjun";
        p1.experience = 5;
        p1.licenseType = "Commercial";
        p1.salary = 80000;
        pilots[0] = p1;

        Pilot p2 = new Pilot();
        p2.pilotId = 702;
        p2.name = "Rahul";
        p2.experience = 8;
        p2.licenseType = "Commercial";
        p2.salary = 95000;
        pilots[1] = p2;

        Pilot p3 = new Pilot();
        p3.pilotId = 703;
        p3.name = "Vikram";
        p3.experience = 10;
        p3.licenseType = "Airline Transport";
        p3.salary = 120000;
        pilots[2] = p3;

        Pilot p4 = new Pilot();
        p4.pilotId = 704;
        p4.name = "Kiran";
        p4.experience = 6;
        p4.licenseType = "Private";
        p4.salary = 70000;
        pilots[3] = p4;

        Pilot p5 = new Pilot();
        p5.pilotId = 705;
        p5.name = "Sneha";
        p5.experience = 7;
        p5.licenseType = "Commercial";
        p5.salary = 90000;
        pilots[4] = p5;

        Pilot p6 = new Pilot();
        p6.pilotId = 706;
        p6.name = "Divya";
        p6.experience = 9;
        p6.licenseType = "Airline Transport";
        p6.salary = 115000;
        pilots[5] = p6;

        Pilot p7 = new Pilot();
        p7.pilotId = 707;
        p7.name = "Ramesh";
        p7.experience = 4;
        p7.licenseType = "Private";
        p7.salary = 65000;
        pilots[6] = p7;

        Pilot p8 = new Pilot();
        p8.pilotId = 708;
        p8.name = "Anil";
        p8.experience = 11;
        p8.licenseType = "Airline Transport";
        p8.salary = 125000;
        pilots[7] = p8;

        Pilot p9 = new Pilot();
        p9.pilotId = 709;
        p9.name = "Pooja";
        p9.experience = 6;
        p9.licenseType = "Commercial";
        p9.salary = 85000;
        pilots[8] = p9;

        Pilot p10 = new Pilot();
        p10.pilotId = 710;
        p10.name = "Manoj";
        p10.experience = 3;
        p10.licenseType = "Private";
        p10.salary = 60000;
        pilots[9] = p10;

        Pilot p11 = new Pilot();
        p11.pilotId = 711;
        p11.name = "Lakshmi";
        p11.experience = 8;
        p11.licenseType = "Commercial";
        p11.salary = 95000;
        pilots[10] = p11;

        Pilot p12 = new Pilot();
        p12.pilotId = 712;
        p12.name = "Harsha";
        p12.experience = 5;
        p12.licenseType = "Private";
        p12.salary = 70000;
        pilots[11] = p12;

        Pilot p13 = new Pilot();
        p13.pilotId = 713;
        p13.name = "Suresh";
        p13.experience = 12;
        p13.licenseType = "Airline Transport";
        p13.salary = 130000;
        pilots[12] = p13;

        Pilot p14 = new Pilot();
        p14.pilotId = 714;
        p14.name = "Meena";
        p14.experience = 7;
        p14.licenseType = "Commercial";
        p14.salary = 90000;
        pilots[13] = p14;

        Pilot p15 = new Pilot();
        p15.pilotId = 715;
        p15.name = "Kavya";
        p15.experience = 9;
        p15.licenseType = "Airline Transport";
        p15.salary = 110000;
        pilots[14] = p15;

       
        for (Pilot pilot : pilots) {
            System.out.println(pilot.pilotId);
            System.out.println(pilot.name);
            System.out.println(pilot.experience);
            System.out.println(pilot.licenseType);
            System.out.println(pilot.salary);
            System.out.println("----------------------");
        }
    }
}