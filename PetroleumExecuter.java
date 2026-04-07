class PetroleumExecuter {
    public static void main(String args[]) {
        Petroleum p = new Petroleum();

    boolean added = p.addPetroleum("Petrol");
        System.out.println(added);
        added = p.addPetroleum("Diesel");
        System.out.println(added);
   added = p.addPetroleum("Kerosene");
        System.out.println(added);
        added = p.addPetroleum("LPG");
   System.out.println(added);
        added = p.addPetroleum("CNG");
        System.out.println(added);
        added = p.addPetroleum("Aviation Fuel");
     System.out.println(added);
        added = p.addPetroleum("Bitumen");
        System.out.println(added);
        added = p.addPetroleum("Paraffin Wax");
   System.out.println(added);
        added = p.addPetroleum("Lubricating Oil");
        System.out.println(added);
        added = p.addPetroleum("Petroleum Jelly");
 System.out.println(added);

      boolean found = p.searchPetroleum("LPG");
        System.out.println("Found: " + found);

    boolean updated = p.updatePetroleum("Petrol", "Premium Petrol");
        System.out.println("Updated: " + updated);

        boolean deleted = p.deletePetroleum("Diesel");
    System.out.println("Deleted: " + deleted);

        p.getPetroleums();
    }
}