class SmartTV {
    static String brand = "Realme";
    static String modelName = "32HDGQRDDAQ";
    static String operatingSystem = "Google TV";
    static String displayType = "HD QLED";
    static String resolution = "32 Inch";
    static String launchYear = "2025";
    static boolean isSmartTV = true;
    static int usbPorts = 2;
    static String supportedCastingDevices = "Mobile, Laptop";
    static double price = 10299.0;

    public static void main(String[] args) {

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Display Type: " + displayType);
        System.out.println("Screen Size: " + resolution);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Smart TV: " + isSmartTV);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Supported Casting Devices: " + supportedCastingDevices);
        System.out.println("Price: ₹" + price);
    }
}
