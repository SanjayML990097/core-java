class TurbineExecuter {
    public static void main(String args[]) {
        Turbine t = new Turbine();

   boolean added = t.addTurbine("Steam Turbine");
        System.out.println(added);
        added = t.addTurbine("Gas Turbine");
     System.out.println(added);
        added = t.addTurbine("Wind Turbine");
        System.out.println(added);
        added = t.addTurbine("Hydraulic Turbine");
  System.out.println(added);
        added = t.addTurbine("Impulse Turbine");
        System.out.println(added);
        added = t.addTurbine("Reaction Turbine");
System.out.println(added);
        added = t.addTurbine("Kaplan Turbine");
        System.out.println(added);
        added = t.addTurbine("Francis Turbine");
   System.out.println(added);
        added = t.addTurbine("Pelton Turbine");
        System.out.println(added);
        added = t.addTurbine("Micro Turbine");
        System.out.println(added);

    boolean found = t.searchTurbine("Wind Turbine");
        System.out.println("Found: " + found);

        boolean updated = t.updateTurbine("Steam Turbine", "Advanced Steam Turbine");
      System.out.println("Updated: " + updated);

        boolean deleted = t.deleteTurbine("Gas Turbine");
    System.out.println("Deleted: " + deleted);

        t.getTurbines();
    }
}