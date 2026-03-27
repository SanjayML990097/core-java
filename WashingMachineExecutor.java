class WashingMachineExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + WashingMachine.getBrand());
      
      System.out.println("Capacity: " + WashingMachine.getCapacity());
      
      System.out.println("Type: " + WashingMachine.getType());
      
      System.out.println("Energy Rating: " + WashingMachine.getEnergyRating());
      
      System.out.println("Wash Programs: " + WashingMachine.getWashPrograms());
      
      System.out.println("Maximum Spin Speed: " + WashingMachine.getMaximumSpinSpeed() + " RPM");
      
      System.out.println("Special Features: " + WashingMachine.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}