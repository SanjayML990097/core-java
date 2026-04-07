class CylinderExecuter {
    public static void main(String args[]) {
        Cylinder c = new Cylinder();

        boolean added = c.addCylinder("HP Gas");
        System.out.println(added);
        added = c.addCylinder("Indane Gas");
        System.out.println(added);
   added = c.addCylinder("Bharat Gas");
        System.out.println(added);
        added = c.addCylinder("Oxygen Cylinder");
        System.out.println(added);
        added = c.addCylinder("Nitrogen Cylinder");
   System.out.println(added);
        added = c.addCylinder("Helium Cylinder");
        System.out.println(added);
        added = c.addCylinder("CO2 Cylinder");
    System.out.println(added);
        added = c.addCylinder("LPG Cylinder");
        System.out.println(added);
    added = c.addCylinder("Medical Oxygen");
        System.out.println(added);
        added = c.addCylinder("Industrial Gas");
        System.out.println(added);

        boolean found = c.searchCylinder("LPG Cylinder");
        System.out.println("Found: " + found);

   boolean updated = c.updateCylinder("HP Gas", "HP Domestic Gas");
        System.out.println("Updated: " + updated);

        boolean deleted = c.deleteCylinder("Indane Gas");
        System.out.println("Deleted: " + deleted);
 c.getCylinders();
    }
}