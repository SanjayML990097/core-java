class SofaSet
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("HomeStyle");
      return "HomeStyle";
   }

   public static String getMaterial()
   {
      System.out.println("getMaterial() invoked");
      System.out.println("Premium Fabric");
      return "Premium Fabric";
   }

   public static String getSeatingCapacity()
   {
      System.out.println("getSeatingCapacity() invoked");
      System.out.println("3 + 1 + 1 Seater");
      return "3 + 1 + 1 Seater";
   }

   public static String getColor()
   {
      System.out.println("getColor() invoked");
      System.out.println("Dark Grey");
      return "Dark Grey";
   }

   public static int getWarrantyYears()
   {
      System.out.println("getWarrantyYears() invoked");
      System.out.println("5 Years");
      return 5;
   }

   public static String getSpecialFeatures()
   {
      System.out.println("getSpecialFeatures() invoked");
      System.out.println("High Density Foam");
      return "Special Features Displayed";
   }
}