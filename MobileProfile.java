class MobileProfile {

    static String brandName = "unknown";
    static String modelName = "basic model";
    static String color = "black";
    static int storageGB = 0;
    static String displaySize = "0 inch";
    static String displayType = "LCD";
    static String resolution = "0 x 0";
    static int refreshRateHz = 0;
    static String operatingSystem = "OS";
    static String processorBrand = "brand";
    static String processorType = "type";
    static String processorCore = "core";
    static double priceINR = 0.0;

    public static void main(String args[]) {

        brandName = "Samsung";
        modelName = "Galaxy S25 Plus 5G";
        color = "Navy";
        storageGB = 256;
        displaySize = "6.7 Inch";
        displayType = "Dynamic AMOLED 2X";
        resolution = "3120 x 1440 Pixels";
        refreshRateHz = 120;
        operatingSystem = "Android 15";
        processorBrand = "Snapdragon";
        processorType = "8 Elite for Galaxy";
        processorCore = "Octa Core";
        priceINR = 74999.0;

        System.out.println("Brand Name : " + brandName);
        System.out.println("Another Brand Name : " + MobileProfile.brandName);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + MobileProfile.modelName);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + MobileProfile.color);

        System.out.println("Storage : " + storageGB + " GB");
        System.out.println("Another Storage : " + MobileProfile.storageGB + " GB");

        System.out.println("Display Size : " + displaySize);
        System.out.println("Another Display Size : " + MobileProfile.displaySize);

        System.out.println("Display Type : " + displayType);
        System.out.println("Another Display Type : " + MobileProfile.displayType);

        System.out.println("Resolution : " + resolution);
        System.out.println("Another Resolution : " + MobileProfile.resolution);

        System.out.println("Refresh Rate : " + refreshRateHz + " Hz");
        System.out.println("Another Refresh Rate : " + MobileProfile.refreshRateHz + " Hz");

        System.out.println("Operating System : " + operatingSystem);
        System.out.println("Another Operating System : " + MobileProfile.operatingSystem);

        System.out.println("Processor Brand : " + processorBrand);
        System.out.println("Another Processor Brand : " + MobileProfile.processorBrand);

        System.out.println("Processor Type : " + processorType);
        System.out.println("Another Processor Type : " + MobileProfile.processorType);

        System.out.println("Processor Core : " + processorCore);
        System.out.println("Another Processor Core : " + MobileProfile.processorCore);

        System.out.println("Price : Rs. " + priceINR);
        System.out.println("Another Price : Rs. " + MobileProfile.priceINR);
    }
}
