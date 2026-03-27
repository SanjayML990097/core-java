class Lamp {

    static String brand = "xyz";
    static String modelName = "basic model";
    static String material = "plastic";
    static String color = "white";
    static int wattage = 0;
    static boolean isFoldable = false;
    static boolean isRechargeable = false;
    static double price = 0.0;

    public static void main(String[] args) {

        brand = "Philips";
        modelName = "LED Study Lamp";
        material = "Plastic";
        color = "White";
        wattage = 9;
        isFoldable = true;
        isRechargeable = true;
        price = 799.0;

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Lamp.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + Lamp.modelName);

        System.out.println("Material : " + material);
        System.out.println("Another Material : " + Lamp.material);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + Lamp.color);

        System.out.println("Wattage : " + wattage);
        System.out.println("Another Wattage : " + Lamp.wattage);

        System.out.println("Foldable : " + isFoldable);
        System.out.println("Another Foldable : " + Lamp.isFoldable);

        System.out.println("Rechargeable : " + isRechargeable);
        System.out.println("Another Rechargeable : " + Lamp.isRechargeable);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Lamp.price);
    }
}
