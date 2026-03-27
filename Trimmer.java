class Trimmer {

    static String brandName = "unknown";
    static String modelNumber = "0000";
    static String productName = "basic trimmer";
    static String trimmerType = "corded";
    static String bodyMaterial = "plastic";
    static String bladeMaterial = "steel";
    static String color = "black";
    static boolean waterResistant = false;
    static String chargingTime = "0 Hours";
    static int priceINR = 0;

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

        System.out.println("Brand Name : " + brandName);
        System.out.println("Another Brand Name : " + Trimmer.brandName);

        System.out.println("Model Number : " + modelNumber);
        System.out.println("Another Model Number : " + Trimmer.modelNumber);

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + Trimmer.productName);

        System.out.println("Trimmer Type : " + trimmerType);
        System.out.println("Another Trimmer Type : " + Trimmer.trimmerType);

        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Another Body Material : " + Trimmer.bodyMaterial);

        System.out.println("Blade Material : " + bladeMaterial);
        System.out.println("Another Blade Material : " + Trimmer.bladeMaterial);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Trimmer.color);

        System.out.println("Water Resistant : " + waterResistant);
        System.out.println("Another Water Resistant : " + Trimmer.waterResistant);

        System.out.println("Charging Time : " + chargingTime);
        System.out.println("Another Charging Time : " + Trimmer.chargingTime);

        System.out.println("Price : Rs. " + priceINR);
        System.out.println("Another Price : Rs. " + Trimmer.priceINR);
    }
}
