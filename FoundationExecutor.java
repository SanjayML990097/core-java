class FoundationExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + Foundation.getBrand());
      
      System.out.println("Shade: " + Foundation.getShade());
      
      System.out.println("Skin Type: " + Foundation.getSkinType());
      
      System.out.println("Coverage Type: " + Foundation.getCoverageType());
      
      System.out.println("Quantity: " + Foundation.getQuantity() + " ml");
      
      System.out.println("Features: " + Foundation.getFeatures());

      System.out.println("main ended");
      return;
   }
}