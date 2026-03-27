class WallClock {

    static String brand;
    static String modelName;
    static String color;
    static String displayType;
    static String shape;
    static String material;
    static boolean isBatteryOperated;
    static String batteryType;
    static double price;

    public static void main(String[] args) {

        brand = "Ajanta";
        modelName = "Classic Round Wall Clock";
        color = "Brown";
        displayType = "Analog";
        shape = "Round";
        material = "Plastic";
        isBatteryOperated = true;
        batteryType = "AA";
        price = 499.0;

        System.out.println("Brand             : " + brand);
        System.out.println("Model Name        : " + modelName);
        System.out.println("Color             : " + color);
        System.out.println("Display Type      : " + displayType);
        System.out.println("Shape             : " + shape);
        System.out.println("Material          : " + material);
        System.out.println("Battery Operated  : " + isBatteryOperated);
        System.out.println("Battery Type      : " + batteryType);
        System.out.println("Price             : ₹" + price);
    }
}
