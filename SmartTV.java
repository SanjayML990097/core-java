class SmartTV {

    static String brand;
    static String modelName;
    static String operatingSystem;
    static String displayType;
    static String resolution;
    static String launchYear;
    static boolean isSmartTV;
    static int usbPorts;
    static String supportedCastingDevices;
    static double price;

    public static void main(String[] args) {

        brand = "Realme";
        modelName = "32HDGQRDDAQ";
        operatingSystem = "Google TV";
        displayType = "HD QLED";
        resolution = "32 Inch";
        launchYear = "2025";
        isSmartTV = true;
        usbPorts = 2;
        supportedCastingDevices = "Mobile, Laptop";
        price = 10299.0;

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
