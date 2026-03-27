class WalkingPadsExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + WalkingPads.getBrand());
      
      System.out.println("Type: " + WalkingPads.getType());
      
      System.out.println("Motor Power: " + WalkingPads.getMotorPowerHP() + " HP");
      
      System.out.println("Maximum Speed: " + WalkingPads.getMaximumSpeed() + " km/h");
      
      System.out.println("Weight Capacity: " + WalkingPads.getWeightCapacity() + " kg");
      
      System.out.println("Special Features: " + WalkingPads.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}