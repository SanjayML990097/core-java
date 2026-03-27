class JuicerMixerGrinder {

    static String brand;
    static String modelId;
    static String series;
    static String type;
    static String color;
    static int totalJars;
    static boolean isDryGrinding;
    static boolean isWetGrinding;
    static boolean isBlending;
    static boolean isMincing;
    static boolean isGrating;
    static boolean isChutneyGrinding;
    static boolean isJuicing;
    static double price;

    public static void main(String[] args) {

        brand = "Sansui";
        modelId = "Allure Plus";
        series = "Plus";
        type = "Juicer Mixer Grinder";
        color = "Black, Blue";
        totalJars = 3;
        isDryGrinding = true;
        isWetGrinding = true;
        isBlending = true;
        isMincing = true;
        isGrating = true;
        isChutneyGrinding = true;
        isJuicing = true;
        price = 1299.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model ID: " + modelId);
        System.out.println("Series: " + series);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Total Jars: " + totalJars);
        System.out.println("Dry Grinding: " + isDryGrinding);
        System.out.println("Wet Grinding: " + isWetGrinding);
        System.out.println("Blending: " + isBlending);
        System.out.println("Mincing: " + isMincing);
        System.out.println("Grating: " + isGrating);
        System.out.println("Chutney Grinding: " + isChutneyGrinding);
        System.out.println("Juicing: " + isJuicing);
        System.out.println("Price: ₹" + price);
    }
}
