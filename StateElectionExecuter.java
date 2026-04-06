class StateElectionExecuter {
    public static void main(String args[]) {
        StateElection s = new StateElection();

        boolean added = s.addParty("BJP");
        System.out.println(added);
        added = s.addParty("Congress");
        System.out.println(added);
        added = s.addParty("AAP");
        System.out.println(added);
        added = s.addParty("JD(S)");
        System.out.println(added);
        added = s.addParty("Shiv Sena");
        System.out.println(added);
        added = s.addParty("TMC");
        System.out.println(added);
        added = s.addParty("DMK");
        System.out.println(added);

        boolean updated = s.updateParty("AAP", "Aam Aadmi Party");
        System.out.println("Updated: " + updated);

        boolean deleted = s.deleteParty("TMC");
        System.out.println("Deleted: " + deleted);

        s.getParties();
    }
}