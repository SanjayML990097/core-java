class CameraExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Compatible Mounting: " + Camera.getCompatibleMounting());
     

      System.out.println("Aspect Ratio: " + Camera.getAspectRatio());
      
      System.out.println("Sensor Technology: " + Camera.getSensorTechnology());
      
      System.out.println("Supported File Format: " + Camera.getSupportedFileFormat());
      
      System.out.println("Image Stabilisation: " + Camera.getImageStabilisation());
	  
      System.out.println("Maximum Focal Length: " + Camera.getMaximumFocalLength() + " mm");
      
      System.out.println("Highlights: " + Camera.getHighlights());
      

      System.out.println("main ended");
      return;
   }
}