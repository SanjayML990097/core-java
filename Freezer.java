class Freezer {

    static String brand;
    static String modelName;
    static String type;
    static String color;
    static String energyRating;
    static String coolingTechnology;
    static boolean hasFastFreeze;
    static double price;

    public static void main(String[] args) {

        brand = "Whirlpool";
        modelName = "Deep Freezer CF 280";
        type = "Chest Freezer";
        color = "White";
        energyRating = "3 Star";
        coolingTechnology = "Direct Cool";
        hasFastFreeze = true;
        price = 18999.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Cooling Technology: " + coolingTechnology);
        System.out.println("Fast Freeze: " + hasFastFreeze);
        System.out.println("Price: ₹" + price);
    }
}
