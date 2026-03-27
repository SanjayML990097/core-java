class WatchDetails {

    static String brand = "unknown";
    static String series = "basic series";
    static String idealFor = "men";
    static String displayType = "digital";
    static String mechanism = "automatic";
    static String movement = "automatic";
    static String occasion = "daily";
    static String strapColor = "black";
    static String shockResistance = "No";
    static int packOf = 0;
    static int netQuantity = 0;
    static double price = 0.0;

    public static void main(String[] args) {

        brand = "LOIS CARON";
        series = "Elegant Series Square Quartz For Boys Wrist";
        idealFor = "Men";
        displayType = "Analog";
        mechanism = "Quartz";
        movement = "Quartz";
        occasion = "Casual, Formal";
        strapColor = "Black";
        shockResistance = "Yes";
        packOf = 1;
        netQuantity = 1;
        price = 348;

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + WatchDetails.brand);

        System.out.println("Series : " + series);
        System.out.println("Another Series : " + WatchDetails.series);

        System.out.println("Ideal For : " + idealFor);
        System.out.println("Another Ideal For : " + WatchDetails.idealFor);

        System.out.println("Display Type : " + displayType);
        System.out.println("Another Display Type : " + WatchDetails.displayType);

        System.out.println("Mechanism : " + mechanism);
        System.out.println("Another Mechanism : " + WatchDetails.mechanism);

        System.out.println("Movement : " + movement);
        System.out.println("Another Movement : " + WatchDetails.movement);

        System.out.println("Occasion : " + occasion);
        System.out.println("Another Occasion : " + WatchDetails.occasion);

        System.out.println("Strap Color : " + strapColor);
        System.out.println("Another Strap Color : " + WatchDetails.strapColor);

        System.out.println("Shock Resistance : " + shockResistance);
        System.out.println("Another Shock Resistance : " + WatchDetails.shockResistance);

        System.out.println("Pack Of : " + packOf);
        System.out.println("Another Pack Of : " + WatchDetails.packOf);

        System.out.println("Net Quantity : " + netQuantity);
        System.out.println("Another Net Quantity : " + WatchDetails.netQuantity);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + WatchDetails.price);
    }
}
