class PoliceStationExecuter {
    public static void main(String args[]) {
        PoliceStation p = new PoliceStation();

        boolean added = p.addCase("Theft Case");
        System.out.println(added);
        added = p.addCase("Robbery Case");
        System.out.println(added);
        added = p.addCase("Fraud Case");
        System.out.println(added);
        added = p.addCase("Murder Case");
        System.out.println(added);
        added = p.addCase("Kidnap Case");
        System.out.println(added);
        added = p.addCase("Cyber Crime");
        System.out.println(added);
        added = p.addCase("Drug Case");
        System.out.println(added);
        added = p.addCase("Assault Case");
        System.out.println(added);
        added = p.addCase("Accident Case");
        System.out.println(added);
        added = p.addCase("Missing Person");
        System.out.println(added);
        added = p.addCase("Smuggling Case");
        System.out.println(added);
        added = p.addCase("Forgery Case");
        System.out.println(added);
        added = p.addCase("Harassment Case");
        System.out.println(added);
        added = p.addCase("Extortion Case");
        System.out.println(added);
        added = p.addCase("Trespassing Case");
        System.out.println(added);
        added = p.addCase("Domestic Violence");
        System.out.println(added);

        boolean updated = p.updateCase("Theft Case", "Chain Snatching Case");
        System.out.println("Updated: " + updated);

        boolean deleted = p.deleteCase("Robbery Case");
        System.out.println("Deleted: " + deleted);

        p.getCases();
    }
}