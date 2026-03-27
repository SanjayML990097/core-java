class WatchDetails {

    static String brand;
    static String series;
    static String idealFor;
    static String displayType;
    static String mechanism;
    static String movement;
    static String occasion;
    static String strapColor;
    static String shockResistance;
    static int packOf;
    static int netQuantity;
    static double price;

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

        System.out.println("Watch Brand      : " + brand);
        System.out.println("Series           : " + series);
        System.out.println("Ideal For        : " + idealFor);
        System.out.println("Display Type     : " + displayType);
        System.out.println("Mechanism        : " + mechanism);
        System.out.println("Movement         : " + movement);
        System.out.println("Occasion         : " + occasion);
        System.out.println("Strap Color      : " + strapColor);
        System.out.println("Shock Resistance : " + shockResistance);
        System.out.println("Pack Of          : " + packOf);
        System.out.println("Net Quantity     : " + netQuantity);
        System.out.println("Price            : ₹" + price);
    }
}
