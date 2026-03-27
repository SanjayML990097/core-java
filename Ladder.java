lass Ladder {

    static String brand = "xyz";
    static String modelName = "basic model";
    static String material = "steel";
    static String color = "black";
    static int numberOfSteps = 0;
    static boolean isFoldable = false;
    static boolean hasAntiSkidFeet = false;
    static double price = 0.0;

    public static void main(String[] args) {

        brand = "Bathla";
        modelName = "Advance 5-Step Ladder";
        material = "Aluminium";
        color = "Silver";
        numberOfSteps = 5;
        isFoldable = true;
        hasAntiSkidFeet = true;
        price = 3499.0;

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Ladder.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + Ladder.modelName);

        System.out.println("Material : " + material);
        System.out.println("Another Material : " + Ladder.material);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Ladder.color);

        System.out.println("Number Of Steps : " + numberOfSteps);
        System.out.println("Another Number Of Steps : " + Ladder.numberOfSteps);

        System.out.println("Foldable : " + isFoldable);
        System.out.println("Another Foldable : " + Ladder.isFoldable);

        System.out.println("Anti-Skid Feet : " + hasAntiSkidFeet);
        System.out.println("Another Anti-Skid Feet : " + Ladder.hasAntiSkidFeet);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Ladder.price);
    }
}
