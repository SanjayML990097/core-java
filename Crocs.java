class Crocs {

    static String brand;
    static String type;
    static String typeForFlats;
    static String color;
    static String brandColor;
    static String idealFor;
    static String articleNumber;
    static int labelSize;
    static int netQuantity;
    static double price;

    public static void main(String[] args) {

        brand = "LIBERTY";
        type = "Clogs";
        typeForFlats = "Slip-On";
        color = "Grey";
        brandColor = "L.GREY";
        idealFor = "Men";
        articleNumber = "6963001125450";
        labelSize = 10;
        netQuantity = 1;
        price = 409.0;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Type For Flats: " + typeForFlats);
        System.out.println("Color: " + color);
        System.out.println("Brand Color: " + brandColor);
        System.out.println("Ideal For: " + idealFor);
        System.out.println("Article Number: " + articleNumber);
        System.out.println("Label Size: " + labelSize);
        System.out.println("Net Quantity: " + netQuantity);
        System.out.println("Price: ₹" + price);
    }
}
