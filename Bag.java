class Bag {

    static String brand;
    static String modelName;
    static String color;
    static String material;
    static int capacityLitres;
    static int numberOfCompartments;
    static boolean isWaterResistant;
    static double price;

    public static void main(String[] args) {

        brand = "Skybags";
        modelName = "Casual Backpack";
        color = "Blue";
        material = "Polyester";
        capacityLitres = 30;
        numberOfCompartments = 3;
        isWaterResistant = true;
        price = 1299.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacityLitres + " Litres");
        System.out.println("Number Of Compartments: " + numberOfCompartments);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Price: ₹" + price);
    }
}
