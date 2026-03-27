class Massager {

    static String productName = "xyz";
    static String brand = "unknown";
    static String modelName = "basic model";
    static String type = "standard";
    static String color = "black";
    static double price = 0.0;

    public static void main(String[] args) {

        productName = "Cult Volt Pro Massager";
        brand = "Cult";
        modelName = "Volt Pro";
        type = "Full Body (Hammer, Tapping)";
        color = "Black";
        price = 1499.0;

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + Massager.productName);

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Massager.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + Massager.modelName);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + Massager.type);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Massager.color);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Massager.price);
    }
}
