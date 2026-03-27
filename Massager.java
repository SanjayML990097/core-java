class Massager {

    static String productName;
    static String brand;
    static String modelName;
    static String type;
    static String color;
    static double price;

    public static void main(String[] args) {

        productName = "Cult Volt Pro Massager";
        brand = "Cult";
        modelName = "Volt Pro";
        type = "Full Body (Hammer, Tapping)";
        color = "Black";
        price = 1499.0;

        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
    }
}
