class WaterPurifier {

    static String productName = "basic purifier";
    static String brand = "unknown";
    static String modelName = "basic model";
    static String color = "white";
    static String purificationTechnology = "RO";
    static String inTheBox = "1 Unit";
    static String purificationFeatures = "basic filtration";
    static double price = 0.0;

    public static void main(String[] args) {

        productName = "KENT Marvel RO Water Purifier";
        brand = "KENT";
        modelName = "Marvel";
        color = "Black";
        purificationTechnology = "RO + UF + TDS Control + UV LED";
        inTheBox = "1 Water Purifier";
        purificationFeatures = "RO + UF + TDS Control + UV In-tank";
        price = 8999.0;

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + WaterPurifier.productName);

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + WaterPurifier.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + WaterPurifier.modelName);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + WaterPurifier.color);

        System.out.println("Purification Technology : " + purificationTechnology);
        System.out.println("Another Purification Technology : " + WaterPurifier.purificationTechnology);

        System.out.println("In The Box : " + inTheBox);
        System.out.println("Another In The Box : " + WaterPurifier.inTheBox);

        System.out.println("Purification Features : " + purificationFeatures);
        System.out.println("Another Purification Features : " + WaterPurifier.purificationFeatures);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + WaterPurifier.price);
    }
}
