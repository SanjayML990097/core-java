class DrawingSet {

    static String brandName = "xyz";
    static String productName = "art kit";
    static int totalPieces = 0;
    static String modelName = "basic model";
    static String type = "color set";
    static String colorType = "single color";
    static int salesPackage = 0;
    static int priceINR = 0;

    public static void main(String args[]) {

        brandName = "Shoparam";
        productName = "Children Deluxe Art Drawing Set";
        totalPieces = 150;
        modelName = "150 pcs Children Deluxe Art Drawing Set for Kids";
        type = "Drawing Color Set";
        colorType = "Multicolor";
        salesPackage = 1;
        priceINR = 102;

        System.out.println("Brand Name : " + brandName);
        System.out.println("Another Brand Name : " + DrawingSet.brandName);

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + DrawingSet.productName);

        System.out.println("Total Pieces : " + totalPieces);
        System.out.println("Another Total Pieces : " + DrawingSet.totalPieces);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + DrawingSet.modelName);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + DrawingSet.type);

        System.out.println("Color Type : " + colorType);
        System.out.println("Another Color Type : " + DrawingSet.colorType);

        System.out.println("Sales Package : " + salesPackage);
        System.out.println("Another Sales Package : " + DrawingSet.salesPackage);

        System.out.println("Price : Rs. " + priceINR);
        System.out.println("Another Price : Rs. " + DrawingSet.priceINR);
    }
}
