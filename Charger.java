class Charger {
    static String brandName = "Samsung";
    static String modelNumber = "EP-TA800";
    static String productName = "25W Super Fast Charging USB-C Charger";
    static String chargerType = "Wall Charger";
    static String bodyMaterial = "Polycarbonate Plastic";
    static String compatibleDevices = "Smartphones, Tablets";
    static String color = "Black";
    static boolean fastCharging = true;
    static String powerOutput = "25 Watts";
    static int priceINR = 1299;

    public static void main(String args[]) {

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
