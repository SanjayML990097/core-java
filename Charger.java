class Charger {

    static String brandName = "xyz";
    static String modelNumber = "000";
    static String productName = "charger";
    static String chargerType = "normal";
    static String bodyMaterial = "plastic";
    static String compatibleDevices = "none";
    static String color = "white";
    static boolean fastCharging = false;
    static String powerOutput = "0W";
    static int priceINR = 0;

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
        System.out.println("Another Brand Name : " + Charger.brandName);

        System.out.println("Model Number : " + modelNumber);
        System.out.println("Another Model Number : " + Charger.modelNumber);

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + Charger.productName);

        System.out.println("Charger Type : " + chargerType);
        System.out.println("Another Charger Type : " + Charger.chargerType);

        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Another Body Material : " + Charger.bodyMaterial);

        System.out.println("Compatible Devices : " + compatibleDevices);
        System.out.println("Another Compatible Devices : " + Charger.compatibleDevices);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Charger.color);

        System.out.println("Fast Charging : " + fastCharging);
        System.out.println("Another Fast Charging : " + Charger.fastCharging);

        System.out.println("Power Output : " + powerOutput);
        System.out.println("Another Power Output : " + Charger.powerOutput);

        System.out.println("Price : Rs. " + priceINR);
        System.out.println("Another Price : Rs. " + Charger.priceINR);
    }
}
