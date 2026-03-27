class Jewellery {

    static String brand = "xyz";
    static String productName = "ornament";
    static String type = "accessory";
    static String material = "metal";
    static String color = "silver";
    static String idealFor = "all";
    static String occasion = "casual";
    static String stoneType = "none";
    static boolean isHallmarked = false;
    static double price = 0.0;

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

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Jewellery.brand);

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + Jewellery.productName);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + Jewellery.type);

        System.out.println("Material : " + material);
        System.out.println("Another Material : " + Jewellery.material);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Jewellery.color);

        System.out.println("Ideal For : " + idealFor);
        System.out.println("Another Ideal For : " + Jewellery.idealFor);

        System.out.println("Occasion : " + occasion);
        System.out.println("Another Occasion : " + Jewellery.occasion);

        System.out.println("Stone Type : " + stoneType);
        System.out.println("Another Stone Type : " + Jewellery.stoneType);

        System.out.println("Hallmarked : " + isHallmarked);
        System.out.println("Another Hallmarked : " + Jewellery.isHallmarked);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Jewellery.price);
    }
}
