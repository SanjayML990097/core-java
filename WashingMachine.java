class WashingMachine
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("LG");
      return "LG";
   }

   public static String getCapacity()
   {
      System.out.println("getCapacity() invoked");
      System.out.println("7 Kg");
      return "7 Kg";
   }

   public static String getType()
   {
      System.out.println("getType() invoked");
      System.out.println("Front Load");
      return "Front Load";
   }

   public static String getEnergyRating()
   {
      System.out.println("getEnergyRating() invoked");
      System.out.println("5 Star");
      return "5 Star";
   }

   public static String getWashPrograms()
   {
      System.out.println("getWashPrograms() invoked");
      System.out.println("Cotton, Wool, Quick Wash, Delicate");
      return "Multiple Wash Programs";
   }

   public static int getMaximumSpinSpeed()
   {
      System.out.println("getMaximumSpinSpeed() invoked");
      System.out.println("1200 RPM");
      return 1200;
   }

   public static String getSpecialFeatures()
   {
      System.out.println("getSpecialFeatures() invoked");
      System.out.println("Inverter Direct Drive Motor");
      return "Special Features Displayed";
   }
}