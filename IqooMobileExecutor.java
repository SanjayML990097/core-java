class IqooMobileExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + IqooMobile.getBrand());
      
      System.out.println("Model: " + IqooMobile.getModel());
      
      System.out.println("Processor: " + IqooMobile.getProcessor());
      
      System.out.println("RAM: " + IqooMobile.getRAM() + " GB");
      
      System.out.println("Storage: " + IqooMobile.getStorage() + " GB");
      
      System.out.println("Camera: " + IqooMobile.getCameraDetails());
      
      System.out.println("Battery: " + IqooMobile.getBatteryDetails());

      System.out.println("main ended");
      return;
   }
}