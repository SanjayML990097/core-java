class Crocs {

    static String brand = "xyz";
    static String type = "footwear";
    static String typeForFlats = "normal";
    static String color = "black";
    static String brandColor = "B.BLACK";
    static String idealFor = "all";
    static String articleNumber = "000000";
    static int labelSize = 0;
    static int netQuantity = 0;
    static double price = 0.0;

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

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Crocs.brand);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + Crocs.type);

        System.out.println("Type For Flats : " + typeForFlats);
        System.out.println("Another Type For Flats : " + Crocs.typeForFlats);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Crocs.color);

        System.out.println("Brand Color : " + brandColor);
        System.out.println("Another Brand Color : " + Crocs.brandColor);

        System.out.println("Ideal For : " + idealFor);
        System.out.println("Another Ideal For : " + Crocs.idealFor);

        System.out.println("Article Number : " + articleNumber);
        System.out.println("Another Article Number : " + Crocs.articleNumber);

        System.out.println("Label Size : " + labelSize);
        System.out.println("Another Label Size : " + Crocs.labelSize);

        System.out.println("Net Quantity : " + netQuantity);
        System.out.println("Another Net Quantity : " + Crocs.netQuantity);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Crocs.price);
    }
}
