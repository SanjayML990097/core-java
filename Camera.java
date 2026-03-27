class Camera
{
   public static String getCompatibleMounting()
   {
      System.out.println("getCompatibleMounting() invoked");
      System.out.println("Sony E");
      return "Sony E";
   }

   public static String getAspectRatio()
   {
      System.out.println("getAspectRatio() invoked");
      System.out.println("3:2");
      return "3:2";
   }

   public static String getSensorTechnology()
   {
      System.out.println("getSensorTechnology() invoked");
      System.out.println("CMOS");
      return "CMOS";
   }

   public static String getSupportedFileFormat()
   {
      System.out.println("getSupportedFileFormat() invoked");
      System.out.println("JPEG");
      return "JPEG";
   }

   public static String getImageStabilisation()
   {
      System.out.println("getImageStabilisation() invoked");
      System.out.println("Optical");
      return "Optical";
   }

   public static int getMaximumFocalLength()
   {
      System.out.println("getMaximumFocalLength() invoked");
      System.out.println("50 Millimeters");
      return 50;
   }

   public static String getHighlights()
   {
      System.out.println("getHighlights() invoked");
      System.out.println("24.2MP APS-C Exmor CMOS Sensor");
      return "Camera Highlights Displayed";
   }
}