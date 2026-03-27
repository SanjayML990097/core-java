class FeverTablets
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Dolo 650");
      return "Dolo 650";
   }

   public static String getMedicineType()
   {
      System.out.println("getMedicineType() invoked");
      System.out.println("Paracetamol Tablet");
      return "Paracetamol Tablet";
   }

   public static int getDosageMg()
   {
      System.out.println("getDosageMg() invoked");
      System.out.println("650 mg");
      return 650;
   }

   public static String getUsedFor()
   {
      System.out.println("getUsedFor() invoked");
      System.out.println("Reduces Fever");
      return "Uses Displayed";
   }

   public static String getSuitableFor()
   {
      System.out.println("getSuitableFor() invoked");
      System.out.println("Adults and Children (as prescribed)");
      return "Adults and Children";
   }

   public static String getStorageInstructions()
   {
      System.out.println("getStorageInstructions() invoked");
      System.out.println("Store in a Cool and Dry Place");
      return "Storage Instructions Displayed";
   }
}