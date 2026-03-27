class SpinBikesExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + SpinBikes.getBrand());
      
      System.out.println("Type: " + SpinBikes.getType());
      
      System.out.println("Flywheel Weight: " + SpinBikes.getFlywheelWeight() + " Kg");
      
      System.out.println("Weight Capacity: " + SpinBikes.getWeightCapacity() + " Kg");
      
      System.out.println("Resistance Type: " + SpinBikes.getResistanceType());
      
      System.out.println("Special Features: " + SpinBikes.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}