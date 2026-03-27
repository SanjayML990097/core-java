class IPL {

    static String tournamentName = "IPL";

    static String teams[] = {
        "Chennai Super Kings","Mumbai Indians","Royal Challengers Bangalore","Kolkata Knight Riders","Delhi Capitals",
        "Rajasthan Royals","Sunrisers Hyderabad","Punjab Kings","Lucknow Super Giants","Gujarat Titans"
    };

    public static void main(String args[]) {

        System.out.println("Tournament name is: " + tournamentName);
        System.out.println("List of IPL teams are:");

        getTeams();
    }

    public static void getTeams() {
        for(String team : teams) {
            System.out.println(team);
        }
    }
}