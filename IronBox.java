class IronBox {

    static String productName = "iron";
    static String brand = "xyz";
    static String model = "basic model";
    static String type = "normal";
    static String color = "white";
    static String soleplate = "standard";
    static String features = "basic features";
    static double price = 0.0;

    public static void main(String[] args) {

        productName = "Orient Electric Fabripress DIFP10BP Dry Iron";
        brand = "Orient Electric";
        model = "Fabripress DIFP10BP";
        type = "Dry Iron";
        color = "Turquoise, Black";
        soleplate = "Non-stick Soleplate";
        features = "Adjustable Temperature, Overheat Protection, Power Indicator Light";
        price = 510.0;

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + IronBox.productName);

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + IronBox.brand);

        System.out.println("Model : " + model);
        System.out.println("Another Model : " + IronBox.model);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + IronBox.type);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + IronBox.color);

        System.out.println("Soleplate Type : " + soleplate);
        System.out.println("Another Soleplate Type : " + IronBox.soleplate);

        System.out.println("Features : " + features);
        System.out.println("Another Features : " + IronBox.features);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + IronBox.price);
    }
}
