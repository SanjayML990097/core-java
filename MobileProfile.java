class MobileProfile {

    static String brandName;
    static String modelName;
    static String color;
    static int storageGB;
    static String displaySize;
    static String displayType;
    static String resolution;
    static int refreshRateHz;
    static String operatingSystem;
    static String processorBrand;
    static String processorType;
    static String processorCore;
    static double priceINR;

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
        System.out.println("Model Name : " + modelName);
        System.out.println("Color : " + color);
        System.out.println("Storage : " + storageGB + " GB");
        System.out.println("Display Size : " + displaySize);
        System.out.println("Display Type : " + displayType);
        System.out.println("Resolution : " + resolution);
        System.out.println("Refresh Rate : " + refreshRateHz + " Hz");
        System.out.println("Operating System : " + operatingSystem);
        System.out.println("Processor Brand : " + processorBrand);
        System.out.println("Processor Type : " + processorType);
        System.out.println("Processor Core : " + processorCore);
        System.out.println("Price : Rs. " + priceINR);
    }
}
