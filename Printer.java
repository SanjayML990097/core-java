class Printer {

    static String brand;
    static String modelName;
    static String type;
    static String color;
    static String connectivity;
    static boolean isWireless;
    static boolean supportsColorPrinting;
    static String compatibleOS;
    static double price;

    public static void main(String[] args) {

        brand = "HP";
        modelName = "DeskJet 2331";
        type = "Inkjet Printer";
        color = "White";
        connectivity = "USB";
        isWireless = false;
        supportsColorPrinting = true;
        compatibleOS = "Windows, macOS";
        price = 3999.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Wireless: " + isWireless);
        System.out.println("Color Printing Supported: " + supportsColorPrinting);
        System.out.println("Compatible OS: " + compatibleOS);
        System.out.println("Price: ₹" + price);
    }
}
