class SoapExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + Soap.getBrand());
      
      System.out.println("Fragrance: " + Soap.getFragrance());
      
      System.out.println("Skin Type: " + Soap.getSkinType());
      
      System.out.println("Weight: " + Soap.getWeight() + " grams");
      
      System.out.println("Ingredients: " + Soap.getIngredients());
      
      System.out.println("Special Features: " + Soap.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}