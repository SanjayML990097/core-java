class Printer {

    static String brand = "unknown";
    static String modelName = "basic model";
    static String type = "printer";
    static String color = "black";
    static String connectivity = "USB";
    static boolean isWireless = false;
    static boolean supportsColorPrinting = false;
    static String compatibleOS = "OS";
    static double price = 0.0;

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

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Printer.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + Printer.modelName);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + Printer.type);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Printer.color);

        System.out.println("Connectivity : " + connectivity);
        System.out.println("Another Connectivity : " + Printer.connectivity);

        System.out.println("Wireless : " + isWireless);
        System.out.println("Another Wireless : " + Printer.isWireless);

        System.out.println("Color Printing Supported : " + supportsColorPrinting);
        System.out.println("Another Color Printing Supported : " + Printer.supportsColorPrinting);

        System.out.println("Compatible OS : " + compatibleOS);
        System.out.println("Another Compatible OS : " + Printer.compatibleOS);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Printer.price);
    }
}
