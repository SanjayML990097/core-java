class VoltageTester {

    static String productName = "basic tester";
    static String brand = "unknown";
    static String modelNumber = "0000";
    static String type = "analog";
    static String color = "black";
    static String bodyMaterial = "plastic";
    static double price = 0.0;

    public static void main(String[] args) {

        productName = "Taparia Digital Voltage Tester";
        brand = "TAPARIA";
        modelNumber = "MDTN-82 Multipurpose Tester";
        type = "Digital";
        color = "Black";
        bodyMaterial = "Plastic";
        price = 235.0;

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + VoltageTester.productName);

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + VoltageTester.brand);

        System.out.println("Model Number : " + modelNumber);
        System.out.println("Another Model Number : " + VoltageTester.modelNumber);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + VoltageTester.type);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + VoltageTester.color);

        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Another Body Material : " + VoltageTester.bodyMaterial);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + VoltageTester.price);
    }
}
