class KeyboardsExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + Keyboards.getBrand());
      
      System.out.println("Model: " + Keyboards.getModel());
      
      System.out.println("Number of Keys: " + Keyboards.getNumberOfKeys());
      
      System.out.println("Sound Engine: " + Keyboards.getSoundEngine());
      
      System.out.println("Power Source: " + Keyboards.getPowerSource());
      
      System.out.println("Special Features: " + Keyboards.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}