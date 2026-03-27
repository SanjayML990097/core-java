class BeltDetails {

    static String brand = "xyz";
    static String type = "accessory";
    static String leatherType = "normal";
    static String tanningProcess = "basic";
    static String material = "synthetic";
    static String patternedBelt = "plain";
    static String color = "black";
    static String occasion = "casual";
    static int size = 0;
    static String netQuantity = "1";
    static double price = 0.0;

    public static void main(String[] args) {

        brand = "KAEZRI";
        type = "Belt";
        leatherType = "Top Grain";
        tanningProcess = "Chrome";
        material = "Genuine Leather";
        patternedBelt = "Solid";
        color = "Brown";
        occasion = "Evening, Party, Formal, Casual";
        size = 38;
        netQuantity = "Pack of 1";
        price = 257.0;

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + BeltDetails.brand);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + BeltDetails.type);

        System.out.println("Leather Type : " + leatherType);
        System.out.println("Another Leather Type : " + BeltDetails.leatherType);

        System.out.println("Tanning Process : " + tanningProcess);
        System.out.println("Another Tanning Process : " + BeltDetails.tanningProcess);

        System.out.println("Material : " + material);
        System.out.println("Another Material : " + BeltDetails.material);

        System.out.println("Pattern : " + patternedBelt);
        System.out.println("Another Pattern : " + BeltDetails.patternedBelt);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + BeltDetails.color);

        System.out.println("Occasion : " + occasion);
        System.out.println("Another Occasion : " + BeltDetails.occasion);

        System.out.println("Size : " + size);
        System.out.println("Another Size : " + BeltDetails.size);

        System.out.println("Net Quantity : " + netQuantity);
        System.out.println("Another Net Quantity : " + BeltDetails.netQuantity);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + BeltDetails.price);
    }
}
