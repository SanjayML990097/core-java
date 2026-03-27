class Dishwasher {

    static String brand = "xyz";
    static String modelName = "abc";
    static String type = "normal";
    static String color = "white";
    static int capacityPlaceSettings = 0;
    static String energyRating = "0 Star";
    static int numberOfWashPrograms = 0;
    static boolean hasQuickWash = false;
    static double price = 0.0;

    public static void main(String[] args) {

        brand = "Bosch";
        modelName = "SMS66GI01I";
        type = "Freestanding Dishwasher";
        color = "Silver";
        capacityPlaceSettings = 13;
        energyRating = "5 Star";
        numberOfWashPrograms = 6;
        hasQuickWash = true;
        price = 42999.0;

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Dishwasher.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + Dishwasher.modelName);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + Dishwasher.type);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Dishwasher.color);

        System.out.println("Capacity (Place Settings) : " + capacityPlaceSettings);
        System.out.println("Another Capacity (Place Settings) : " + Dishwasher.capacityPlaceSettings);

        System.out.println("Energy Rating : " + energyRating);
        System.out.println("Another Energy Rating : " + Dishwasher.energyRating);

        System.out.println("Number Of Wash Programs : " + numberOfWashPrograms);
        System.out.println("Another Number Of Wash Programs : " + Dishwasher.numberOfWashPrograms);

        System.out.println("Quick Wash Available : " + hasQuickWash);
        System.out.println("Another Quick Wash Available : " + Dishwasher.hasQuickWash);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Dishwasher.price);
    }
}
