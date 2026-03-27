class VoltageTester {

    static String productName;
    static String brand;
    static String modelNumber;
    static String type;
    static String color;
    static String bodyMaterial;
    static double price;

    public static void main(String[] args) {

        productName = "Taparia Digital Voltage Tester";
        brand = "TAPARIA";
        modelNumber = "MDTN-82 Multipurpose Tester";
        type = "Digital";
        color = "Black";
        bodyMaterial = "Plastic";
        price = 235.0;

        System.out.println("Product Name  : " + productName);
        System.out.println("Brand         : " + brand);
        System.out.println("Model Number  : " + modelNumber);
        System.out.println("Type          : " + type);
        System.out.println("Color         : " + color);
        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Price         : ₹" + price);
    }
}
