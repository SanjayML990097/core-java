class Jewellery {

    static String brand;
    static String productName;
    static String type;
    static String material;
    static String color;
    static String idealFor;
    static String occasion;
    static String stoneType;
    static boolean isHallmarked;
    static double price;

    public static void main(String[] args) {

        brand = "Tanishq";
        productName = "Gold Plated Necklace Set";
        type = "Necklace";
        material = "Gold Plated";
        color = "Gold";
        idealFor = "Women";
        occasion = "Wedding, Party";
        stoneType = "American Diamond";
        isHallmarked = true;
        price = 5999.0;

        System.out.println("Brand: " + brand);
        System.out.println("Product Name: " + productName);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Ideal For: " + idealFor);
        System.out.println("Occasion: " + occasion);
        System.out.println("Stone Type: " + stoneType);
        System.out.println("Hallmarked: " + isHallmarked);
        System.out.println("Price: ₹" + price);
    }
}
