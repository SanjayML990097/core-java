class Tablet
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Samsung");
      return "Samsung";
   }

   public static String getModel()
   {
      System.out.println("getModel() invoked");
      System.out.println("Galaxy Tab S9");
      return "Galaxy Tab S9";
   }

   public static String getDisplaySize()
   {
      System.out.println("getDisplaySize() invoked");
      System.out.println("11 Inches");
      return "11 Inches";
   }

   public static String getProcessor()
   {
      System.out.println("getProcessor() invoked");
      System.out.println("Snapdragon 8 Gen 2");
      return "Snapdragon 8 Gen 2";
   }

   public static int getRAM()
   {
      System.out.println("getRAM() invoked");
      System.out.println("8 GB");
      return 8;
   }

   public static int getStorage()
   {
      System.out.println("getStorage() invoked");
      System.out.println("256 GB");
      return 256;
   }

   public static String getBatteryDetails()
   {
      System.out.println("getBatteryDetails() invoked");
      System.out.println("8400mAh Battery");
      return "Battery Details Displayed";
   }
}