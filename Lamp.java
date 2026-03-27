class Lamp {

    static String brand;
    static String modelName;
    static String color;
    static String material;
    static String lightType;
    static boolean isRechargeable;
    static double price;

    public static void main(String[] args) {

        brand = "Philips";
        modelName = "LED Study Lamp";
        color = "White";
        material = "Plastic";
        lightType = "LED";
        isRechargeable = true;
        price = 799.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Light Type: " + lightType);
        System.out.println("Rechargeable: " + isRechargeable);
        System.out.println("Price: ₹" + price);
    }
}
