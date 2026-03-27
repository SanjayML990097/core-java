class KitBagsExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + KitBags.getBrand());
      
      System.out.println("Type: " + KitBags.getType());
      
      System.out.println("Material: " + KitBags.getMaterial());
      
      System.out.println("Capacity: " + KitBags.getCapacityInLiters() + " Liters");
      
      System.out.println("Color: " + KitBags.getColor());
      
      System.out.println("Special Features: " + KitBags.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}