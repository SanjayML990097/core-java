class FreelancerExecutor
{
    public static void main(String args[])
    {
        System.out.println("Freelancer Details Fetching...");

        Freelancer f1 = new Freelancer(); Client c1 = new Client();
        c1.clientId=1; c1.clientName="Rahul"; c1.project="Web App"; c1.budget=50000; c1.isActive=true;
        f1.freelancerId=1; f1.name="Arjun"; f1.skill="Java"; f1.experience=3; f1.client=c1;

        Freelancer f2 = new Freelancer(); Client c2 = new Client();
        c2.clientId=2; c2.clientName="Sneha"; c2.project="Mobile App"; c2.budget=60000; c2.isActive=true;
        f2.freelancerId=2; f2.name="Ravi"; f2.skill="Android"; f2.experience=4; f2.client=c2;

        Freelancer f3 = new Freelancer(); Client c3 = new Client();
        c3.clientId=3; c3.clientName="Amit"; c3.project="Website"; c3.budget=40000; c3.isActive=true;
        f3.freelancerId=3; f3.name="Kiran"; f3.skill="HTML"; f3.experience=2; f3.client=c3;

        Freelancer f4 = new Freelancer(); Client c4 = new Client();
        c4.clientId=4; c4.clientName="Pooja"; c4.project="UI Design"; c4.budget=30000; c4.isActive=false;
        f4.freelancerId=4; f4.name="Divya"; f4.skill="UI/UX"; f4.experience=5; f4.client=c4;

        Freelancer f5 = new Freelancer(); Client c5 = new Client();
        c5.clientId=5; c5.clientName="Manoj"; c5.project="Backend"; c5.budget=70000; c5.isActive=true;
        f5.freelancerId=5; f5.name="Suresh"; f5.skill="Spring"; f5.experience=6; f5.client=c5;

        Freelancer f6 = new Freelancer(); Client c6 = new Client();
        c6.clientId=6; c6.clientName="Neha"; c6.project="API Dev"; c6.budget=55000; c6.isActive=true;
        f6.freelancerId=6; f6.name="Anu"; f6.skill="NodeJS"; f6.experience=3; f6.client=c6;

        Freelancer f7 = new Freelancer(); Client c7 = new Client();
        c7.clientId=7; c7.clientName="Ramesh"; c7.project="Ecommerce"; c7.budget=80000; c7.isActive=false;
        f7.freelancerId=7; f7.name="Deepak"; f7.skill="React"; f7.experience=4; f7.client=c7;

        Freelancer f8 = new Freelancer(); Client c8 = new Client();
        c8.clientId=8; c8.clientName="Kavya"; c8.project="Testing"; c8.budget=25000; c8.isActive=true;
        f8.freelancerId=8; f8.name="Priya"; f8.skill="QA"; f8.experience=2; f8.client=c8;

        Freelancer f9 = new Freelancer(); Client c9 = new Client();
        c9.clientId=9; c9.clientName="Vikram"; c9.project="Automation"; c9.budget=45000; c9.isActive=true;
        f9.freelancerId=9; f9.name="Akash"; f9.skill="Python"; f9.experience=3; f9.client=c9;

        Freelancer f10 = new Freelancer(); Client c10 = new Client();
        c10.clientId=10; c10.clientName="Nisha"; c10.project="ML Model"; c10.budget=90000; c10.isActive=false;
        f10.freelancerId=10; f10.name="Rahul"; f10.skill="AI"; f10.experience=5; f10.client=c10;

        Freelancer f11 = new Freelancer(); Client c11 = new Client();
        c11.clientId=11; c11.clientName="Arjun"; c11.project="Web App"; c11.budget=52000; c11.isActive=true;
        f11.freelancerId=11; f11.name="Manoj"; f11.skill="Java"; f11.experience=4; f11.client=c11;

        Freelancer f12 = new Freelancer(); Client c12 = new Client();
        c12.clientId=12; c12.clientName="Sneha"; c12.project="Mobile App"; c12.budget=62000; c12.isActive=true;
        f12.freelancerId=12; f12.name="Ravi"; f12.skill="Android"; f12.experience=5; f12.client=c12;

        Freelancer f13 = new Freelancer(); Client c13 = new Client();
        c13.clientId=13; c13.clientName="Amit"; c13.project="Website"; c13.budget=42000; c13.isActive=false;
        f13.freelancerId=13; f13.name="Kiran"; f13.skill="HTML"; f13.experience=3; f13.client=c13;

        Freelancer f14 = new Freelancer(); Client c14 = new Client();
        c14.clientId=14; c14.clientName="Pooja"; c14.project="UI Design"; c14.budget=32000; c14.isActive=true;
        f14.freelancerId=14; f14.name="Divya"; f14.skill="UI/UX"; f14.experience=6; f14.client=c14;

        Freelancer f15 = new Freelancer(); Client c15 = new Client();
        c15.clientId=15; c15.clientName="Manoj"; c15.project="Backend"; c15.budget=72000; c15.isActive=true;
        f15.freelancerId=15; f15.name="Suresh"; f15.skill="Spring"; f15.experience=7; f15.client=c15;

        Freelancer f16 = new Freelancer(); Client c16 = new Client();
        c16.clientId=16; c16.clientName="Neha"; c16.project="API Dev"; c16.budget=54000; c16.isActive=false;
        f16.freelancerId=16; f16.name="Anu"; f16.skill="NodeJS"; f16.experience=4; f16.client=c16;

        Freelancer f17 = new Freelancer(); Client c17 = new Client();
        c17.clientId=17; c17.clientName="Ramesh"; c17.project="Ecommerce"; c17.budget=64000; c17.isActive=true;
        f17.freelancerId=17; f17.name="Deepak"; f17.skill="React"; f17.experience=5; f17.client=c17;

        Freelancer f18 = new Freelancer(); Client c18 = new Client();
        c18.clientId=18; c18.clientName="Kavya"; c18.project="Testing"; c18.budget=34000; c18.isActive=true;
        f18.freelancerId=18; f18.name="Priya"; f18.skill="QA"; f18.experience=3; f18.client=c18;

        Freelancer f19 = new Freelancer(); Client c19 = new Client();
        c19.clientId=19; c19.clientName="Vikram"; c19.project="Automation"; c19.budget=44000; c19.isActive=false;
        f19.freelancerId=19; f19.name="Akash"; f19.skill="Python"; f19.experience=4; f19.client=c19;

        Freelancer f20 = new Freelancer(); Client c20 = new Client();
        c20.clientId=20; c20.clientName="Nisha"; c20.project="ML Model"; c20.budget=94000; c20.isActive=true;
        f20.freelancerId=20; f20.name="Rahul"; f20.skill="AI"; f20.experience=6; f20.client=c20;

        System.out.println(f1.name+" - "+f1.client.clientName);
        System.out.println(f2.name+" - "+f2.client.clientName);
        System.out.println(f3.name+" - "+f3.client.clientName);
        System.out.println(f4.name+" - "+f4.client.clientName);
        System.out.println(f5.name+" - "+f5.client.clientName);
        System.out.println(f6.name+" - "+f6.client.clientName);
        System.out.println(f7.name+" - "+f7.client.clientName);
        System.out.println(f8.name+" - "+f8.client.clientName);
        System.out.println(f9.name+" - "+f9.client.clientName);
        System.out.println(f10.name+" - "+f10.client.clientName);
        System.out.println(f11.name+" - "+f11.client.clientName);
        System.out.println(f12.name+" - "+f12.client.clientName);
        System.out.println(f13.name+" - "+f13.client.clientName);
        System.out.println(f14.name+" - "+f14.client.clientName);
        System.out.println(f15.name+" - "+f15.client.clientName);
        System.out.println(f16.name+" - "+f16.client.clientName);
        System.out.println(f17.name+" - "+f17.client.clientName);
        System.out.println(f18.name+" - "+f18.client.clientName);
        System.out.println(f19.name+" - "+f19.client.clientName);
        System.out.println(f20.name+" - "+f20.client.clientName);
    }
}