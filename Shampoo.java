class Shampoo {

    static String brandName = "unknown";
    static String productName = "basic shampoo";
    static String variant = "regular";
    static String suitableFor = "all";
    static String hairType = "normal";
    static double rating = 0.0;
    static int priceINR = 0;

    public static void main(String args[]) {

        brandName = "Livon";
        productName = "Hyaluron Shampoo";
        variant = "Intense Hydration";
        suitableFor = "Men & Women";
        hairType = "All Hair Types";
        rating = 4.5;
        priceINR = 262;

        System.out.println("Brand Name : " + brandName);
        System.out.println("Another Brand Name : " + Shampoo.brandName);

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + Shampoo.productName);

        System.out.println("Variant : " + variant);
        System.out.println("Another Variant : " + Shampoo.variant);

        System.out.println("Suitable For : " + suitableFor);
        System.out.println("Another Suitable For : " + Shampoo.suitableFor);

        System.out.println("Hair Type : " + hairType);
        System.out.println("Another Hair Type : " + Shampoo.hairType);

        System.out.println("Rating : " + rating);
        System.out.println("Another Rating : " + Shampoo.rating);

        System.out.println("Price : Rs. " + priceINR);
        System.out.println("Another Price : Rs. " + Shampoo.priceINR);
    }
}
