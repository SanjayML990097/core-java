class SteelExecuter {
    public static void main(String args[]) {
        Steel s = new Steel();

        boolean added = s.addSteel("Stainless Steel");
    System.out.println(added);
        added = s.addSteel("Carbon Steel");
        System.out.println(added);
    added = s.addSteel("Alloy Steel");
        System.out.println(added);
        added = s.addSteel("Tool Steel");
        System.out.println(added);
        added = s.addSteel("Mild Steel");
        System.out.println(added);
        added = s.addSteel("High Speed Steel");
        System.out.println(added);
        added = s.addSteel("Spring Steel");
        System.out.println(added);
        added = s.addSteel("Structural Steel");
   System.out.println(added);
        added = s.addSteel("Galvanized Steel");
        System.out.println(added);
        added = s.addSteel("Duplex Steel");
        System.out.println(added);

        boolean found = s.searchSteel("Mild Steel");
  System.out.println("Found: " + found);

        boolean updated = s.updateSteel("Carbon Steel", "Low Carbon Steel");
        System.out.println("Updated: " + updated);

  boolean deleted = s.deleteSteel("Tool Steel");
        System.out.println("Deleted: " + deleted);

        s.getSteels();
    }
}