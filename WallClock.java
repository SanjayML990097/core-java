class WallClock {

    static String brand = "unknown";
    static String modelName = "basic model";
    static String color = "black";
    static String displayType = "digital";
    static String shape = "square";
    static String material = "plastic";
    static boolean isBatteryOperated = false;
    static String batteryType = "AAA";
    static double price = 0.0;

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

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + WallClock.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + WallClock.modelName);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + WallClock.color);

        System.out.println("Display Type : " + displayType);
        System.out.println("Another Display Type : " + WallClock.displayType);

        System.out.println("Shape : " + shape);
        System.out.println("Another Shape : " + WallClock.shape);

        System.out.println("Material : " + material);
        System.out.println("Another Material : " + WallClock.material);

        System.out.println("Battery Operated : " + isBatteryOperated);
        System.out.println("Another Battery Operated : " + WallClock.isBatteryOperated);

        System.out.println("Battery Type : " + batteryType);
        System.out.println("Another Battery Type : " + WallClock.batteryType);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + WallClock.price);
    }
}
