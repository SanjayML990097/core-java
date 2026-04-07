class KettleExecuter {
    public static void main(String args[]) {
        Kettle k = new Kettle();

        boolean added = k.addKettle("Electric Kettle");
        System.out.println(added);
        added = k.addKettle("Stainless Steel Kettle");
        System.out.println(added);
   added = k.addKettle("Glass Kettle");
        System.out.println(added);
        added = k.addKettle("Travel Kettle");
        System.out.println(added);
    added = k.addKettle("Cordless Kettle");
        System.out.println(added);
        added = k.addKettle("Whistling Kettle");
  System.out.println(added);
        added = k.addKettle("Tea Kettle");
        System.out.println(added);
        added = k.addKettle("Mini Kettle");
        System.out.println(added);
  added = k.addKettle("Smart Kettle");
        System.out.println(added);
   added = k.addKettle("Portable Kettle");
        System.out.println(added);

        boolean found = k.searchKettle("Tea Kettle");
        System.out.println("Found: " + found);

    boolean updated = k.updateKettle("Electric Kettle", "Electric Smart Kettle");
        System.out.println("Updated: " + updated);

        boolean deleted = k.deleteKettle("Glass Kettle");
        System.out.println("Deleted: " + deleted);
        k.getKettles();
    }
}