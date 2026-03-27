class SmartTV {

    static String brand = "unknown";
    static String modelName = "basic model";
    static String operatingSystem = "OS";
    static String displayType = "LED";
    static String resolution = "0 Inch";
    static String launchYear = "0000";
    static boolean isSmartTV = false;
    static int usbPorts = 0;
    static String supportedCastingDevices = "none";
    static double price = 0.0;

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

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + SmartTV.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + SmartTV.modelName);

        System.out.println("Operating System : " + operatingSystem);
        System.out.println("Another Operating System : " + SmartTV.operatingSystem);

        System.out.println("Display Type : " + displayType);
        System.out.println("Another Display Type : " + SmartTV.displayType);

        System.out.println("Resolution : " + resolution);
        System.out.println("Another Resolution : " + SmartTV.resolution);

        System.out.println("Launch Year : " + launchYear);
        System.out.println("Another Launch Year : " + SmartTV.launchYear);

        System.out.println("Smart TV : " + isSmartTV);
        System.out.println("Another Smart TV : " + SmartTV.isSmartTV);

        System.out.println("USB Ports : " + usbPorts);
        System.out.println("Another USB Ports : " + SmartTV.usbPorts);

        System.out.println("Supported Casting Devices : " + supportedCastingDevices);
        System.out.println("Another Supported Casting Devices : " + SmartTV.supportedCastingDevices);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + SmartTV.price);
    }
}
