class ElectricKettle {

    static String brand;
    static String modelName;
    static String color;
    static String operatingMode;
    static String filterType;
    static boolean isAutoSwitchOff;
    static boolean isDryBoilProtection;
    static boolean isPowerIndicator;
    static double price;

    public static void main(String[] args) {

        brand = "Prestige";
        modelName = "PKOSS 1.5L";
        color = "Silver - Black";
        operatingMode = "Corded";
        filterType = "Spout";
        isAutoSwitchOff = true;
        isDryBoilProtection = true;
        isPowerIndicator = true;
        price = 649.0;

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
