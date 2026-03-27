class Dishwasher {

    static String brand;
    static String modelName;
    static String type;
    static String color;
    static int capacityPlaceSettings;
    static String energyRating;
    static int numberOfWashPrograms;
    static boolean hasQuickWash;
    static double price;

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

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Capacity (Place Settings): " + capacityPlaceSettings);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Number Of Wash Programs: " + numberOfWashPrograms);
        System.out.println("Quick Wash Available: " + hasQuickWash);
        System.out.println("Price: ₹" + price);
    }
}
