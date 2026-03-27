class JuicerMixerGrinder {
    static String brand = "Sansui";
    static String modelId = "Allure Plus";
    static String series = "Plus";
    static String type = "Juicer Mixer Grinder";
    static String color = "Black, Blue";
    static int totalJars = 3;
    static boolean isDryGrinding = true;
    static boolean isWetGrinding = true;
    static boolean isBlending = true;
    static boolean isMincing = true;
    static boolean isGrating = true;
    static boolean isChutneyGrinding = true;
    static boolean isJuicing = true;
    static double price = 1299.0;

    public static void main(String[] args) {

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
