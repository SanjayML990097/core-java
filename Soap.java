class Soap
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Dove");
      return "Dove";
   }

   public static String getFragrance()
   {
      System.out.println("getFragrance() invoked");
      System.out.println("Mild Floral");
      return "Mild Floral";
   }

   public static String getSkinType()
   {
      System.out.println("getSkinType() invoked");
      System.out.println("Suitable for Dry Skin");
      return "Suitable for Dry Skin";
   }

   public static int getWeight()
   {
      System.out.println("getWeight() invoked");
      System.out.println("100 Grams");
      return 100;
   }

   public static String getIngredients()
   {
      System.out.println("getIngredients() invoked");
      System.out.println("Glycerin");
      return "Ingredients Displayed";
   }

   public static String getSpecialFeatures()
   {
      System.out.println("getSpecialFeatures() invoked");
      System.out.println("Dermatologically Tested");
      return "Special Features Displayed";
   }
}