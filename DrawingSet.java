class DrawingSet {

    static String brandName;
    static String productName;
    static int totalPieces;
    static String modelName;
    static String type;
    static String colorType;
    static int salesPackage;
    static int priceINR;

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
        System.out.println("Product Name : " + productName);
        System.out.println("Total Pieces : " + totalPieces);
        System.out.println("Model Name : " + modelName);
        System.out.println("Type : " + type);
        System.out.println("Color Type : " + colorType);
        System.out.println("Sales Package : " + salesPackage);
        System.out.println("Price : Rs. " + priceINR);
    }
}
