class Bag {

    static String brand = "xyz";
    static String modelName = "abc";
    static String color = "black";
    static String material = "plastic";
    static int capacityLitres = 0;
    static int numberOfCompartments = 0;
    static boolean isWaterResistant = false;
    static double price = 0.0;

    public static void main(String[] args) {

        brand = "Skybags";
        modelName = "Casual Backpack";
        color = "Blue";
        material = "Polyester";
        capacityLitres = 30;
        numberOfCompartments = 3;
        isWaterResistant = true;
        price = 1299.0;

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Bag.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + Bag.modelName);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Bag.color);

        System.out.println("Material : " + material);
        System.out.println("Another Material : " + Bag.material);

        System.out.println("Capacity : " + capacityLitres + " Litres");
        System.out.println("Another Capacity : " + Bag.capacityLitres + " Litres");

        System.out.println("Number Of Compartments : " + numberOfCompartments);
        System.out.println("Another Number Of Compartments : " + Bag.numberOfCompartments);

        System.out.println("Water Resistant : " + isWaterResistant);
        System.out.println("Another Water Resistant : " + Bag.isWaterResistant);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Bag.price);
    }
}
