class FeverTabletsExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + FeverTablets.getBrand());
      
      System.out.println("Medicine Type: " + FeverTablets.getMedicineType());
      
      System.out.println("Dosage: " + FeverTablets.getDosageMg() + " mg");
      
      System.out.println("Used For: " + FeverTablets.getUsedFor());
      
      System.out.println("Suitable For: " + FeverTablets.getSuitableFor());
      
      System.out.println("Storage: " + FeverTablets.getStorageInstructions());

      System.out.println("main ended");
      return;
   }
}