class AirPods {

    static String brand;
    static String modelName ;
    static String color;
    static String connectivity;
    static boolean hasActiveNoiseCancellation;
    static boolean hasTransparencyMode;
    static boolean isWirelessChargingSupported ;
    static boolean isWaterResistant ;
    static double price;

    public static void main(String[] args) {
		brand = "Apple";
		modelName = "AirPods Pro (2nd Generation)";
		color = "White";
		connectivity = "Bluetooth 5.3";
		hasActiveNoiseCancellation = true;
		hasTransparencyMode = true;
		isWirelessChargingSupported = true;
		isWaterResistant = true;
		price = 24999.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Color: " + color);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Active Noise Cancellation: " + hasActiveNoiseCancellation);
        System.out.println("Transparency Mode: " + hasTransparencyMode);
        System.out.println("Wireless Charging Supported: " + isWirelessChargingSupported);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Price: ₹" + price);
    }
}
