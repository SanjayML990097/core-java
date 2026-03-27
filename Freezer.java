class Freezer {

    static String brand = "xyz";
    static String modelName = "basic model";
    static String type = "normal";
    static String color = "white";
    static String energyRating = "0 Star";
    static String coolingTechnology = "basic cool";
    static boolean hasFastFreeze = false;
    static double price = 0.0;

    public static void main(String[] args) {

        brand = "Whirlpool";
        modelName = "Deep Freezer CF 280";
        type = "Chest Freezer";
        color = "White";
        energyRating = "3 Star";
        coolingTechnology = "Direct Cool";
        hasFastFreeze = true;
        price = 18999.0;

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Freezer.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + Freezer.modelName);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + Freezer.type);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Freezer.color);

        System.out.println("Energy Rating : " + energyRating);
        System.out.println("Another Energy Rating : " + Freezer.energyRating);

        System.out.println("Cooling Technology : " + coolingTechnology);
        System.out.println("Another Cooling Technology : " + Freezer.coolingTechnology);

        System.out.println("Fast Freeze : " + hasFastFreeze);
        System.out.println("Another Fast Freeze : " + Freezer.hasFastFreeze);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Freezer.price);
    }
}
