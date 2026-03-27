class AirPods {

    static String brand = "xyz";
    static String modelName = "abc";
    static String color = "black";
    static String connectivity = "wired";
    static boolean hasActiveNoiseCancellation = false;
    static boolean hasTransparencyMode = false;
    static boolean isWirelessChargingSupported = false;
    static boolean isWaterResistant = false;
    static double price = 0.0;

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

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + AirPods.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + AirPods.modelName);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + AirPods.color);

        System.out.println("Connectivity : " + connectivity);
        System.out.println("Another Connectivity : " + AirPods.connectivity);

        System.out.println("Active Noise Cancellation : " + hasActiveNoiseCancellation);
        System.out.println("Another Active Noise Cancellation : " + AirPods.hasActiveNoiseCancellation);

        System.out.println("Transparency Mode : " + hasTransparencyMode);
        System.out.println("Another Transparency Mode : " + AirPods.hasTransparencyMode);

        System.out.println("Wireless Charging Supported : " + isWirelessChargingSupported);
        System.out.println("Another Wireless Charging Supported : " + AirPods.isWirelessChargingSupported);

        System.out.println("Water Resistant : " + isWaterResistant);
        System.out.println("Another Water Resistant : " + AirPods.isWaterResistant);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + AirPods.price);
    }
}
