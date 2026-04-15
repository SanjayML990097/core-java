class BankRunner {

    public static void main(String[] args) {

        Bank banks[] = new Bank[15];

        Bank b1 = new Bank();
        b1.bankId = 1801;
        b1.name = "SBI";
        b1.branch = "MG Road";
        b1.ifsc = "SBIN0001";
        b1.city = "Bangalore";
        banks[0] = b1;

        Bank b2 = new Bank();
        b2.bankId = 1802;
        b2.name = "HDFC";
        b2.branch = "Indiranagar";
        b2.ifsc = "HDFC0002";
        b2.city = "Bangalore";
        banks[1] = b2;

        Bank b3 = new Bank();
        b3.bankId = 1803;
        b3.name = "ICICI";
        b3.branch = "Whitefield";
        b3.ifsc = "ICIC0003";
        b3.city = "Bangalore";
        banks[2] = b3;

        Bank b4 = new Bank();
        b4.bankId = 1804;
        b4.name = "Axis";
        b4.branch = "BTM";
        b4.ifsc = "AXIS0004";
        b4.city = "Bangalore";
        banks[3] = b4;

        Bank b5 = new Bank();
        b5.bankId = 1805;
        b5.name = "Canara";
        b5.branch = "Jayanagar";
        b5.ifsc = "CNRB0005";
        b5.city = "Bangalore";
        banks[4] = b5;

        Bank b6 = new Bank();
        b6.bankId = 1806;
        b6.name = "Union Bank";
        b6.branch = "Yelahanka";
        b6.ifsc = "UBIN0006";
        b6.city = "Bangalore";
        banks[5] = b6;

        Bank b7 = new Bank();
        b7.bankId = 1807;
        b7.name = "Indian Bank";
        b7.branch = "Malleshwaram";
        b7.ifsc = "IDIB0007";
        b7.city = "Bangalore";
        banks[6] = b7;

        Bank b8 = new Bank();
        b8.bankId = 1808;
        b8.name = "Kotak";
        b8.branch = "HSR Layout";
        b8.ifsc = "KKBK0008";
        b8.city = "Bangalore";
        banks[7] = b8;

        Bank b9 = new Bank();
        b9.bankId = 1809;
        b9.name = "Yes Bank";
        b9.branch = "Electronic City";
        b9.ifsc = "YESB0009";
        b9.city = "Bangalore";
        banks[8] = b9;

        Bank b10 = new Bank();
        b10.bankId = 1810;
        b10.name = "Bank of Baroda";
        b10.branch = "Rajajinagar";
        b10.ifsc = "BARB0010";
        b10.city = "Bangalore";
        banks[9] = b10;

        Bank b11 = new Bank();
        b11.bankId = 1811;
        b11.name = "Punjab National Bank";
        b11.branch = "Hebbal";
        b11.ifsc = "PUNB0011";
        b11.city = "Bangalore";
        banks[10] = b11;

        Bank b12 = new Bank();
        b12.bankId = 1812;
        b12.name = "Central Bank";
        b12.branch = "KR Puram";
        b12.ifsc = "CBIN0012";
        b12.city = "Bangalore";
        banks[11] = b12;

        Bank b13 = new Bank();
        b13.bankId = 1813;
        b13.name = "IDBI";
        b13.branch = "Banashankari";
        b13.ifsc = "IBKL0013";
        b13.city = "Bangalore";
        banks[12] = b13;

        Bank b14 = new Bank();
        b14.bankId = 1814;
        b14.name = "South Indian Bank";
        b14.branch = "Marathahalli";
        b14.ifsc = "SIBL0014";
        b14.city = "Bangalore";
        banks[13] = b14;

        Bank b15 = new Bank();
        b15.bankId = 1815;
        b15.name = "UCO Bank";
        b15.branch = "Basavanagudi";
        b15.ifsc = "UCOB0015";
        b15.city = "Bangalore";
        banks[14] = b15;


        for (Bank b : banks) {
            System.out.println(b.bankId);
            System.out.println(b.name);
            System.out.println(b.branch);
            System.out.println(b.ifsc);
            System.out.println(b.city);
            System.out.println("----------------------");
        }
    }
}