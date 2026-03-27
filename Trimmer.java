class Trimmer {

    static String brandName;
    static String modelNumber;
    static String productName;
    static String trimmerType;
    static String bodyMaterial;
    static String bladeMaterial;
    static String color;
    static boolean waterResistant;
    static String chargingTime;
    static int priceINR;

    public static void main(String args[]) {

        brandName = "Philips";
        modelNumber = "BT3101/15";
        productName = "Lift & Trim Tech Effortless Even Trim Trimmer";
        trimmerType = "Cordless";
        bodyMaterial = "Stainless Steel, Plastic";
        bladeMaterial = "Stainless Steel";
        color = "White";
        waterResistant = true;
        chargingTime = "10 Hours";
        priceINR = 919;

        System.out.println("Brand Name      : " + brandName);
        System.out.println("Model Number    : " + modelNumber);
        System.out.println("Product Name    : " + productName);
        System.out.println("Trimmer Type    : " + trimmerType);
        System.out.println("Body Material   : " + bodyMaterial);
        System.out.println("Blade Material  : " + bladeMaterial);
        System.out.println("Color           : " + color);
        System.out.println("Water Resistant : " + waterResistant);
        System.out.println("Charging Time   : " + chargingTime);
        System.out.println("Price           : Rs. " + priceINR);
    }
}
