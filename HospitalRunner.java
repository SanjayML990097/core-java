class HospitalRunner {

    public static void main(String[] args) {

        Hospital hospitals[] = new Hospital[15];

        Hospital h1 = new Hospital();
        h1.hospitalId = 1701;
        h1.name = "Apollo Hospital";
        h1.city = "Bangalore";
        h1.noOfBeds = 500;
        h1.type = "Private";
        hospitals[0] = h1;

        Hospital h2 = new Hospital();
        h2.hospitalId = 1702;
        h2.name = "Fortis Hospital";
        h2.city = "Delhi";
        h2.noOfBeds = 450;
        h2.type = "Private";
        hospitals[1] = h2;

        Hospital h3 = new Hospital();
        h3.hospitalId = 1703;
        h3.name = "Manipal Hospital";
        h3.city = "Bangalore";
        h3.noOfBeds = 600;
        h3.type = "Private";
        hospitals[2] = h3;

        Hospital h4 = new Hospital();
        h4.hospitalId = 1704;
        h4.name = "Narayana Health";
        h4.city = "Bangalore";
        h4.noOfBeds = 700;
        h4.type = "Private";
        hospitals[3] = h4;

        Hospital h5 = new Hospital();
        h5.hospitalId = 1705;
        h5.name = "AIIMS";
        h5.city = "Delhi";
        h5.noOfBeds = 1000;
        h5.type = "Government";
        hospitals[4] = h5;

        Hospital h6 = new Hospital();
        h6.hospitalId = 1706;
        h6.name = "KIMS";
        h6.city = "Hyderabad";
        h6.noOfBeds = 550;
        h6.type = "Private";
        hospitals[5] = h6;

        Hospital h7 = new Hospital();
        h7.hospitalId = 1707;
        h7.name = "St. John Hospital";
        h7.city = "Bangalore";
        h7.noOfBeds = 400;
        h7.type = "Private";
        hospitals[6] = h7;

        Hospital h8 = new Hospital();
        h8.hospitalId = 1708;
        h8.name = "Columbia Asia";
        h8.city = "Mysore";
        h8.noOfBeds = 350;
        h8.type = "Private";
        hospitals[7] = h8;

        Hospital h9 = new Hospital();
        h9.hospitalId = 1709;
        h9.name = "Victoria Hospital";
        h9.city = "Bangalore";
        h9.noOfBeds = 800;
        h9.type = "Government";
        hospitals[8] = h9;

        Hospital h10 = new Hospital();
        h10.hospitalId = 1710;
        h10.name = "Rainbow Hospital";
        h10.city = "Chennai";
        h10.noOfBeds = 300;
        h10.type = "Private";
        hospitals[9] = h10;

        Hospital h11 = new Hospital();
        h11.hospitalId = 1711;
        h11.name = "Global Hospital";
        h11.city = "Mumbai";
        h11.noOfBeds = 650;
        h11.type = "Private";
        hospitals[10] = h11;

        Hospital h12 = new Hospital();
        h12.hospitalId = 1712;
        h12.name = "Care Hospital";
        h12.city = "Hyderabad";
        h12.noOfBeds = 500;
        h12.type = "Private";
        hospitals[11] = h12;

        Hospital h13 = new Hospital();
        h13.hospitalId = 1713;
        h13.name = "Government Hospital";
        h13.city = "Mysore";
        h13.noOfBeds = 600;
        h13.type = "Government";
        hospitals[12] = h13;

        Hospital h14 = new Hospital();
        h14.hospitalId = 1714;
        h14.name = "Medanta";
        h14.city = "Gurgaon";
        h14.noOfBeds = 900;
        h14.type = "Private";
        hospitals[13] = h14;

        Hospital h15 = new Hospital();
        h15.hospitalId = 1715;
        h15.name = "Aster Hospital";
        h15.city = "Bangalore";
        h15.noOfBeds = 550;
        h15.type = "Private";
        hospitals[14] = h15;

   
        for (Hospital h : hospitals) {
            System.out.println(h.hospitalId);
            System.out.println(h.name);
            System.out.println(h.city);
            System.out.println(h.noOfBeds);
            System.out.println(h.type);
            System.out.println("----------------------");
        }
    }
}