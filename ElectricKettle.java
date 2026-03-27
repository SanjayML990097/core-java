class ElectricKettle {
    static String brand = "Prestige";
    static String modelName = "PKOSS 1.5L";
    static String color = "Silver - Black";
    static String operatingMode = "Corded";
    static String filterType = "Spout";
    static boolean isAutoSwitchOff = true;
    static boolean isDryBoilProtection = true;
    static boolean isPowerIndicator = true;
    static double price = 649.0;

    public static void main(String[] args) {

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Color: " + color);
        System.out.println("Operating Mode: " + operatingMode);
        System.out.println("Filter Type: " + filterType);
        System.out.println("Auto Switch Off: " + isAutoSwitchOff);
        System.out.println("Dry Boil Protection: " + isDryBoilProtection);
        System.out.println("Power Indicator: " + isPowerIndicator);
        System.out.println("Price: ₹" + price);
    }
}
