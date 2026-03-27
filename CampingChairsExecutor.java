class CampingChairsExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + CampingChairs.getBrand());
      
      System.out.println("Material: " + CampingChairs.getMaterial());
      
      System.out.println("Weight Capacity: " + CampingChairs.getWeightCapacityInKg() + " kg");
      
      System.out.println("Foldable: " + CampingChairs.getFoldable());
      
      System.out.println("Chair Weight: " + CampingChairs.getWeight());
      
      System.out.println("Special Features: " + CampingChairs.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}