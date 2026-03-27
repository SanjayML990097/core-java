class MobileProfile {
    static String brandName = "Samsung";
    static String modelName = "Galaxy S25 Plus 5G";
    static String color = "Navy";
    static int storageGB = 256;
    static String displaySize = "6.7 Inch";
    static String displayType = "Dynamic AMOLED 2X";
    static String resolution = "3120 x 1440 Pixels";
    static int refreshRateHz = 120;
    static String operatingSystem = "Android 15";
    static String processorBrand = "Snapdragon";
    static String processorType = "8 Elite for Galaxy";
    static String processorCore = "Octa Core";
    static double priceINR = 74999;

    public static void main(String args[]) {

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
