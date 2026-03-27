class class IqooMobile
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("iQOO");
      return "iQOO";
   }

   public static String getModel()
   {
      System.out.println("getModel() invoked");
      System.out.println("iQOO Neo 7");
      return "iQOO Neo 7";
   }

   public static String getProcessor()
   {
      System.out.println("getProcessor() invoked");
      System.out.println("MediaTek Dimensity 8200");
      return "MediaTek Dimensity 8200";
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
      System.out.println("128 GB");
      return 128;
   }

   public static String getCameraDetails()
   {
      System.out.println("getCameraDetails() invoked");
      System.out.println("64MP Primary Camera");
      return "Camera Details Displayed";
   }

   public static String getBatteryDetails()
   {
      System.out.println("getBatteryDetails() invoked");
      System.out.println("5000mAh Battery");
      return "Battery Details Displayed";
   }
}
