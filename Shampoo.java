class Shampoo {

    static String brandName;
    static String productName;
    static String variant;
    static String suitableFor;
    static String hairType;
    static double rating;
    static int priceINR;

    public static void main(String args[]) {

        brandName = "Livon";
        productName = "Hyaluron Shampoo";
        variant = "Intense Hydration";
        suitableFor = "Men & Women";
        hairType = "All Hair Types";
        rating = 4.5;
        priceINR = 262;

        System.out.println("Brand Name : " + brandName);
        System.out.println("Product Name : " + productName);
        System.out.println("Variant : " + variant);
        System.out.println("Suitable For : " + suitableFor);
        System.out.println("Hair Type : " + hairType);
        System.out.println("Rating : " + rating);
        System.out.println("Price : Rs. " + priceINR);
    }
}
