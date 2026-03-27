class Ladder {

    static String brand;
    static String modelName;
    static String material;
    static String color;
    static int numberOfSteps;
    static boolean isFoldable;
    static boolean hasAntiSkidFeet;
    static double price;

    public static void main(String[] args) {

        brand = "Bathla";
        modelName = "Advance 5-Step Ladder";
        material = "Aluminium";
        color = "Silver";
        numberOfSteps = 5;
        isFoldable = true;
        hasAntiSkidFeet = true;
        price = 3499.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Number Of Steps: " + numberOfSteps);
        System.out.println("Foldable: " + isFoldable);
        System.out.println("Anti-Skid Feet: " + hasAntiSkidFeet);
        System.out.println("Price: ₹" + price);
    }
}
