class TitanWatchExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + TitanWatch.getBrand());
      
      System.out.println("Model: " + TitanWatch.getModel());
      
      System.out.println("Display Type: " + TitanWatch.getDisplayType());
      
      System.out.println("Strap Material: " + TitanWatch.getStrapMaterial());
      
      System.out.println("Water Resistance: " + TitanWatch.getWaterResistance());
      
      System.out.println("Warranty: " + TitanWatch.getWarrantyYears() + " Years");
      
      System.out.println("Special Features: " + TitanWatch.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}