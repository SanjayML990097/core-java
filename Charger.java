class Charger {

    static String brandName;
    static String modelNumber;
    static String productName;
    static String chargerType;
    static String bodyMaterial;
    static String compatibleDevices;
    static String color;
    static boolean fastCharging;
    static String powerOutput;
    static int priceINR;

    public static void main(String args[]) {

        brandName = "Samsung";
        modelNumber = "EP-TA800";
        productName = "25W Super Fast Charging USB-C Charger";
        chargerType = "Wall Charger";
        bodyMaterial = "Polycarbonate Plastic";
        compatibleDevices = "Smartphones, Tablets";
        color = "Black";
        fastCharging = true;
        powerOutput = "25 Watts";
        priceINR = 1299;

        System.out.println("Brand Name : " + brandName);
        System.out.println("Model Number : " + modelNumber);
        System.out.println("Product Name : " + productName);
        System.out.println("Charger Type : " + chargerType);
        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Compatible Devices : " + compatibleDevices);
        System.out.println("Color : " + color);
        System.out.println("Fast Charging : " + fastCharging);
        System.out.println("Power Output : " + powerOutput);
        System.out.println("Price : Rs. " + priceINR);
    }
}
