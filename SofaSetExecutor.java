class SofaSetExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + SofaSet.getBrand());
      
      System.out.println("Material: " + SofaSet.getMaterial());
      
      System.out.println("Seating Capacity: " + SofaSet.getSeatingCapacity());
      
      System.out.println("Color: " + SofaSet.getColor());
      
      System.out.println("Warranty: " + SofaSet.getWarrantyYears() + " Years");
      
      System.out.println("Special Features: " + SofaSet.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}