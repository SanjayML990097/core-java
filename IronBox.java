class IronBox {

    static String productName;
    static String brand;
    static String model;
    static String type;
    static String color;
    static String soleplate;
    static String features;
    static double price;

    public static void main(String[] args) {

        productName = "Orient Electric Fabripress DIFP10BP Dry Iron";
        brand = "Orient Electric";
        model = "Fabripress DIFP10BP";
        type = "Dry Iron";
        color = "Turquoise, Black";
        soleplate = "Non-stick Soleplate";
        features = "Adjustable Temperature, Overheat Protection, Power Indicator Light";
        price = 510.0;

        System.out.println("Product Name: " + productName);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Soleplate Type: " + soleplate);
        System.out.println("Features: " + features);
        System.out.println("Price: ₹" + price);
    }
}
