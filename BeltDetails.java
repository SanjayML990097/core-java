class BeltDetails {

    static String brand;
    static String type;
    static String leatherType;
    static String tanningProcess;
    static String material;
    static String patternedBelt;
    static String color;
    static String occasion;
    static int size;
    static String netQuantity;
    static double price;

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

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Leather Type: " + leatherType);
        System.out.println("Tanning Process: " + tanningProcess);
        System.out.println("Material: " + material);
        System.out.println("Pattern: " + patternedBelt);
        System.out.println("Color: " + color);
        System.out.println("Occasion: " + occasion);
        System.out.println("Size: " + size);
        System.out.println("Net Quantity: " + netQuantity);
        System.out.println("Price: ₹" + price);
    }
}
