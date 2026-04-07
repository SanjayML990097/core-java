class BedExecuter {
    public static void main(String args[]) {
        Bed b = new Bed();

   boolean added = b.addBed("Single Bed");
        System.out.println(added);
        added = b.addBed("Double Bed");
        System.out.println(added);
        added = b.addBed("Queen Size Bed");
   System.out.println(added);
        added = b.addBed("King Size Bed");
        System.out.println(added);
        added = b.addBed("Bunk Bed");
        System.out.println(added);
   added = b.addBed("Sofa Bed");
        System.out.println(added);
        added = b.addBed("Folding Bed");
    System.out.println(added);
        added = b.addBed("Storage Bed");
        System.out.println(added);
        added = b.addBed("Hydraulic Bed");
        System.out.println(added);
        added = b.addBed("Platform Bed");
        System.out.println(added);

    boolean found = b.searchBed("Queen Size Bed");
        System.out.println("Found: " + found);

        boolean updated = b.updateBed("Single Bed", "Single Cot");
  System.out.println("Updated: " + updated);

      boolean deleted = b.deleteBed("Bunk Bed");
        System.out.println("Deleted: " + deleted);

        b.getBeds();
    }
}