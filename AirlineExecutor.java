class AirlineExecutor {

    public static void main(String[] args) {

        Airline airlines[] = new Airline[15];

        Airline a1 = new Airline();
        a1.airlineId = 201;
        a1.airlineName = "IndiGo";
        a1.country = "India";
        a1.noOfFlights = 1500;
        a1.type = "Domestic";
        airlines[0] = a1;

        Airline a2 = new Airline();
        a2.airlineId = 202;
        a2.airlineName = "Air India";
        a2.country = "India";
        a2.noOfFlights = 1200;
        a2.type = "International";
        airlines[1] = a2;

        Airline a3 = new Airline();
        a3.airlineId = 203;
        a3.airlineName = "SpiceJet";
        a3.country = "India";
        a3.noOfFlights = 900;
        a3.type = "Domestic";
        airlines[2] = a3;

        Airline a4 = new Airline();
        a4.airlineId = 204;
        a4.airlineName = "Vistara";
        a4.country = "India";
        a4.noOfFlights = 800;
        a4.type = "International";
        airlines[3] = a4;

        Airline a5 = new Airline();
        a5.airlineId = 205;
        a5.airlineName = "Emirates";
        a5.country = "UAE";
        a5.noOfFlights = 2000;
        a5.type = "International";
        airlines[4] = a5;

        Airline a6 = new Airline();
        a6.airlineId = 206;
        a6.airlineName = "Qatar Airways";
        a6.country = "Qatar";
        a6.noOfFlights = 1800;
        a6.type = "International";
        airlines[5] = a6;

        Airline a7 = new Airline();
        a7.airlineId = 207;
        a7.airlineName = "Lufthansa";
        a7.country = "Germany";
        a7.noOfFlights = 1600;
        a7.type = "International";
        airlines[6] = a7;

        Airline a8 = new Airline();
        a8.airlineId = 208;
        a8.airlineName = "British Airways";
        a8.country = "UK";
        a8.noOfFlights = 1700;
        a8.type = "International";
        airlines[7] = a8;

        Airline a9 = new Airline();
        a9.airlineId = 209;
        a9.airlineName = "Singapore Airlines";
        a9.country = "Singapore";
        a9.noOfFlights = 1400;
        a9.type = "International";
        airlines[8] = a9;

        Airline a10 = new Airline();
        a10.airlineId = 210;
        a10.airlineName = "AirAsia";
        a10.country = "Malaysia";
        a10.noOfFlights = 1300;
        a10.type = "Domestic";
        airlines[9] = a10;

        Airline a11 = new Airline();
        a11.airlineId = 211;
        a11.airlineName = "Go First";
        a11.country = "India";
        a11.noOfFlights = 700;
        a11.type = "Domestic";
        airlines[10] = a11;

        Airline a12 = new Airline();
        a12.airlineId = 212;
        a12.airlineName = "Akasa Air";
        a12.country = "India";
        a12.noOfFlights = 600;
        a12.type = "Domestic";
        airlines[11] = a12;

        Airline a13 = new Airline();
        a13.airlineId = 213;
        a13.airlineName = "Turkish Airlines";
        a13.country = "Turkey";
        a13.noOfFlights = 1900;
        a13.type = "International";
        airlines[12] = a13;

        Airline a14 = new Airline();
        a14.airlineId = 214;
        a14.airlineName = "Etihad Airways";
        a14.country = "UAE";
        a14.noOfFlights = 1750;
        a14.type = "International";
        airlines[13] = a14;

        Airline a15 = new Airline();
        a15.airlineId = 215;
        a15.airlineName = "Delta Airlines";
        a15.country = "USA";
        a15.noOfFlights = 2200;
        a15.type = "International";
        airlines[14] = a15;

        for (Airline airline : airlines) {
            System.out.println(airline.airlineId);
            System.out.println(airline.airlineName);
            System.out.println(airline.country);
            System.out.println(airline.noOfFlights);
            System.out.println(airline.type);
            System.out.println("----------------------");
        }
    }
}