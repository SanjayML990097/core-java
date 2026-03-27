class TabletExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + Tablet.getBrand());
      
      System.out.println("Model: " + Tablet.getModel());
      
      System.out.println("Display Size: " + Tablet.getDisplaySize());
      
      System.out.println("Processor: " + Tablet.getProcessor());
      
      System.out.println("RAM: " + Tablet.getRAM() + " GB");
      
      System.out.println("Storage: " + Tablet.getStorage() + " GB");
      
      System.out.println("Battery: " + Tablet.getBatteryDetails());

      System.out.println("main ended");
      return;
   }
}