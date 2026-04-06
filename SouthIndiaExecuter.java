class SouthIndiaExecuter {
    public static void main(String args[]) {
        SouthIndia s = new SouthIndia();

        boolean added = s.addAirport("Kempegowda International Airport");
        System.out.println(added);
        added = s.addAirport("Chennai International Airport");
        System.out.println(added);
        added = s.addAirport("Rajiv Gandhi International Airport");
        System.out.println(added);
        added = s.addAirport("Cochin International Airport");
        System.out.println(added);
        added = s.addAirport("Trivandrum International Airport");
        System.out.println(added);
        added = s.addAirport("Calicut International Airport");
        System.out.println(added);
        added = s.addAirport("Mangalore International Airport");
        System.out.println(added);
        added = s.addAirport("Coimbatore International Airport");
        System.out.println(added);
        added = s.addAirport("Madurai Airport");
        System.out.println(added);

        boolean updated = s.updateAirport("Madurai Airport", "Madurai International Airport");
        System.out.println("Updated: " + updated);

        boolean deleted = s.deleteAirport("Calicut International Airport");
        System.out.println("Deleted: " + deleted);

        s.getAirports();
    }
}