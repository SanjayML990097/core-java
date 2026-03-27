class WaterPurifier {

    static String productName;
    static String brand;
    static String modelName;
    static String color;
    static String purificationTechnology;
    static String inTheBox;
    static String purificationFeatures;
    static double price;

    public static void main(String[] args) {

        productName = "KENT Marvel RO Water Purifier";
        brand = "KENT";
        modelName = "Marvel";
        color = "Black";
        purificationTechnology = "RO + UF + TDS Control + UV LED";
        inTheBox = "1 Water Purifier";
        purificationFeatures = "RO + UF + TDS Control + UV In-tank";
        price = 8999.0;

        System.out.println("Product Name   : " + productName);
        System.out.println("Brand          : " + brand);
        System.out.println("Model Name       : " + modelName);
        System.out.println("Color   : " + color);
        System.out.println("Purification Technology : " + purificationTechnology);
        System.out.println("In The Box       : " + inTheBox);
        System.out.println("Purification Features   : " + purificationFeatures);
        System.out.println("Price    : ₹" + price);
    }
}
