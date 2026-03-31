class BankExecutor
{
    public static void main(String args[])
    {
        System.out.println("Bank Details Fetching...");

        Bank bank1 = new Bank(); AccountHolder h1 = new AccountHolder();
        h1.holderId=1; h1.holderName="Sanju"; h1.address="BTM"; h1.phone="90001"; h1.isActive=true;
        bank1.bankId=1; bank1.bankName="SBI"; bank1.branch="BTM"; bank1.balance=50000; bank1.accountHolder=h1;

        Bank bank2 = new Bank(); AccountHolder h2 = new AccountHolder();
        h2.holderId=2; h2.holderName="Ravi"; h2.address="HSR"; h2.phone="90002"; h2.isActive=true;
        bank2.bankId=2; bank2.bankName="HDFC"; bank2.branch="HSR"; bank2.balance=60000; bank2.accountHolder=h2;

        Bank bank3 = new Bank(); AccountHolder h3 = new AccountHolder();
        h3.holderId=3; h3.holderName="Amit"; h3.address="Indiranagar"; h3.phone="90003"; h3.isActive=true;
        bank3.bankId=3; bank3.bankName="ICICI"; bank3.branch="Indiranagar"; bank3.balance=70000; bank3.accountHolder=h3;

        Bank bank4 = new Bank(); AccountHolder h4 = new AccountHolder();
        h4.holderId=4; h4.holderName="Kiran"; h4.address="Whitefield"; h4.phone="90004"; h4.isActive=false;
        bank4.bankId=4; bank4.bankName="Axis"; bank4.branch="Whitefield"; bank4.balance=80000; bank4.accountHolder=h4;

        Bank bank5 = new Bank(); AccountHolder h5 = new AccountHolder();
        h5.holderId=5; h5.holderName="Sneha"; h5.address="Marathahalli"; h5.phone="90005"; h5.isActive=true;
        bank5.bankId=5; bank5.bankName="Kotak"; bank5.branch="Marathahalli"; bank5.balance=90000; bank5.accountHolder=h5;

        Bank bank6 = new Bank(); AccountHolder h6 = new AccountHolder();
        h6.holderId=6; h6.holderName="Divya"; h6.address="Yelahanka"; h6.phone="90006"; h6.isActive=true;
        bank6.bankId=6; bank6.bankName="Canara"; bank6.branch="Yelahanka"; bank6.balance=55000; bank6.accountHolder=h6;

        Bank bank7 = new Bank(); AccountHolder h7 = new AccountHolder();
        h7.holderId=7; h7.holderName="Arjun"; h7.address="Rajajinagar"; h7.phone="90007"; h7.isActive=false;
        bank7.bankId=7; bank7.bankName="BOB"; bank7.branch="Rajajinagar"; bank7.balance=65000; bank7.accountHolder=h7;

        Bank bank8 = new Bank(); AccountHolder h8 = new AccountHolder();
        h8.holderId=8; h8.holderName="Pooja"; h8.address="Malleshwaram"; h8.phone="90008"; h8.isActive=true;
        bank8.bankId=8; bank8.bankName="Union"; bank8.branch="Malleshwaram"; bank8.balance=75000; bank8.accountHolder=h8;

        Bank bank9 = new Bank(); AccountHolder h9 = new AccountHolder();
        h9.holderId=9; h9.holderName="Rahul"; h9.address="Hebbal"; h9.phone="90009"; h9.isActive=true;
        bank9.bankId=9; bank9.bankName="PNB"; bank9.branch="Hebbal"; bank9.balance=85000; bank9.accountHolder=h9;

        Bank bank10 = new Bank(); AccountHolder h10 = new AccountHolder();
        h10.holderId=10; h10.holderName="Megha"; h10.address="KR Puram"; h10.phone="90010"; h10.isActive=false;
        bank10.bankId=10; bank10.bankName="Yes Bank"; bank10.branch="KR Puram"; bank10.balance=95000; bank10.accountHolder=h10;

        Bank bank11 = new Bank(); AccountHolder h11 = new AccountHolder();
        h11.holderId=11; h11.holderName="Vikram"; h11.address="BTM"; h11.phone="90011"; h11.isActive=true;
        bank11.bankId=11; bank11.bankName="SBI Prime"; bank11.branch="BTM"; bank11.balance=52000; bank11.accountHolder=h11;

        Bank bank12 = new Bank(); AccountHolder h12 = new AccountHolder();
        h12.holderId=12; h12.holderName="Nisha"; h12.address="HSR"; h12.phone="90012"; h12.isActive=true;
        bank12.bankId=12; bank12.bankName="HDFC Plus"; bank12.branch="HSR"; bank12.balance=62000; bank12.accountHolder=h12;

        Bank bank13 = new Bank(); AccountHolder h13 = new AccountHolder();
        h13.holderId=13; h13.holderName="Ramesh"; h13.address="Indiranagar"; h13.phone="90013"; h13.isActive=false;
        bank13.bankId=13; bank13.bankName="ICICI Gold"; bank13.branch="Indiranagar"; bank13.balance=72000; bank13.accountHolder=h13;

        Bank bank14 = new Bank(); AccountHolder h14 = new AccountHolder();
        h14.holderId=14; h14.holderName="Kavya"; h14.address="Whitefield"; h14.phone="90014"; h14.isActive=true;
        bank14.bankId=14; bank14.bankName="Axis Pro"; bank14.branch="Whitefield"; bank14.balance=82000; bank14.accountHolder=h14;

        Bank bank15 = new Bank(); AccountHolder h15 = new AccountHolder();
        h15.holderId=15; h15.holderName="Suresh"; h15.address="Marathahalli"; h15.phone="90015"; h15.isActive=true;
        bank15.bankId=15; bank15.bankName="Kotak Elite"; bank15.branch="Marathahalli"; bank15.balance=92000; bank15.accountHolder=h15;

        Bank bank16 = new Bank(); AccountHolder h16 = new AccountHolder();
        h16.holderId=16; h16.holderName="Anu"; h16.address="Yelahanka"; h16.phone="90016"; h16.isActive=false;
        bank16.bankId=16; bank16.bankName="Canara Plus"; bank16.branch="Yelahanka"; bank16.balance=54000; bank16.accountHolder=h16;

        Bank bank17 = new Bank(); AccountHolder h17 = new AccountHolder();
        h17.holderId=17; h17.holderName="Deepak"; h17.address="Rajajinagar"; h17.phone="90017"; h17.isActive=true;
        bank17.bankId=17; bank17.bankName="BOB Prime"; bank17.branch="Rajajinagar"; bank17.balance=64000; bank17.accountHolder=h17;

        Bank bank18 = new Bank(); AccountHolder h18 = new AccountHolder();
        h18.holderId=18; h18.holderName="Priya"; h18.address="Malleshwaram"; h18.phone="90018"; h18.isActive=true;
        bank18.bankId=18; bank18.bankName="Union Plus"; bank18.branch="Malleshwaram"; bank18.balance=74000; bank18.accountHolder=h18;

        Bank bank19 = new Bank(); AccountHolder h19 = new AccountHolder();
        h19.holderId=19; h19.holderName="Manoj"; h19.address="Hebbal"; h19.phone="90019"; h19.isActive=false;
        bank19.bankId=19; bank19.bankName="PNB Gold"; bank19.branch="Hebbal"; bank19.balance=84000; bank19.accountHolder=h19;

        Bank bank20 = new Bank(); AccountHolder h20 = new AccountHolder();
        h20.holderId=20; h20.holderName="Neha"; h20.address="KR Puram"; h20.phone="90020"; h20.isActive=true;
        bank20.bankId=20; bank20.bankName="Yes Prime"; bank20.branch="KR Puram"; bank20.balance=94000; bank20.accountHolder=h20;

        System.out.println(bank1.bankName+" - "+bank1.accountHolder.holderName);
        System.out.println(bank2.bankName+" - "+bank2.accountHolder.holderName);
        System.out.println(bank3.bankName+" - "+bank3.accountHolder.holderName);
        System.out.println(bank4.bankName+" - "+bank4.accountHolder.holderName);
        System.out.println(bank5.bankName+" - "+bank5.accountHolder.holderName);
        System.out.println(bank6.bankName+" - "+bank6.accountHolder.holderName);
        System.out.println(bank7.bankName+" - "+bank7.accountHolder.holderName);
        System.out.println(bank8.bankName+" - "+bank8.accountHolder.holderName);
        System.out.println(bank9.bankName+" - "+bank9.accountHolder.holderName);
        System.out.println(bank10.bankName+" - "+bank10.accountHolder.holderName);
        System.out.println(bank11.bankName+" - "+bank11.accountHolder.holderName);
        System.out.println(bank12.bankName+" - "+bank12.accountHolder.holderName);
        System.out.println(bank13.bankName+" - "+bank13.accountHolder.holderName);
        System.out.println(bank14.bankName+" - "+bank14.accountHolder.holderName);
        System.out.println(bank15.bankName+" - "+bank15.accountHolder.holderName);
        System.out.println(bank16.bankName+" - "+bank16.accountHolder.holderName);
        System.out.println(bank17.bankName+" - "+bank17.accountHolder.holderName);
        System.out.println(bank18.bankName+" - "+bank18.accountHolder.holderName);
        System.out.println(bank19.bankName+" - "+bank19.accountHolder.holderName);
        System.out.println(bank20.bankName+" - "+bank20.accountHolder.holderName);
    }
}