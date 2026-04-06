class ShowRoomExecuter {
    public static void main(String args[]) {
        ShowRoom s = new ShowRoom();

        boolean added = s.addManager("Ramesh");
        System.out.println(added);
        added = s.addManager("Suresh");
        System.out.println(added);
        added = s.addManager("Mahesh");
        System.out.println(added);
        added = s.addManager("Rajesh");
        System.out.println(added);
        added = s.addManager("Kiran");
        System.out.println(added);
        added = s.addManager("Arun");
        System.out.println(added);
        added = s.addManager("Vijay");
        System.out.println(added);
        added = s.addManager("Ravi");
        System.out.println(added);

        boolean updated = s.updateManager("Ramesh", "Ramesh Kumar");
        System.out.println("Updated: " + updated);

        boolean deleted = s.deleteManager("Suresh");
        System.out.println("Deleted: " + deleted);

        s.getManagers();
    }
}