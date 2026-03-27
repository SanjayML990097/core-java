class RacquetsExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + Racquets.getBrand());
      
      System.out.println("Type: " + Racquets.getType());
      
      System.out.println("Material: " + Racquets.getMaterial());
      
      System.out.println("Weight: " + Racquets.getWeightInGrams() + " grams");
      
      System.out.println("Grip Size: " + Racquets.getGripSize());
      
      System.out.println("Special Features: " + Racquets.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}