class IPL {
    public static void main(String args[]) {

        String tournamentName = "IPL ";

        String teams[] = {
            "Chennai Super Kings","Mumbai Indians","Royal Challengers Bangalore","Kolkata Knight Riders","Delhi Capitals",
            "Rajasthan Royals","Sunrisers Hyderabad","Punjab Kings","Lucknow Super Giants","Gujarat Titans" };
            

        System.out.println("Tournament name is " + tournamentName);

        System.out.println("List of IPL teams are:");

        System.out.println(
            teams[0] + "\n" + teams[1] + "\n" +
            teams[2] + "\n" + teams[3] + "\n" +
            teams[4] + "\n" + teams[5] + "\n" +
            teams[6] + "\n" + teams[7] + "\n" +
            teams[8] + "\n" + teams[9]
        );
    }
}
