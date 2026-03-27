class JuicerMixerGrinder {

    static String brand = "xyz";
    static String modelId = "000";
    static String series = "basic";
    static String type = "mixer";
    static String color = "white";
    static int totalJars = 0;
    static boolean isDryGrinding = false;
    static boolean isWetGrinding = false;
    static boolean isBlending = false;
    static boolean isMincing = false;
    static boolean isGrating = false;
    static boolean isChutneyGrinding = false;
    static boolean isJuicing = false;
    static double price = 0.0;

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

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + JuicerMixerGrinder.brand);

        System.out.println("Model ID : " + modelId);
        System.out.println("Another Model ID : " + JuicerMixerGrinder.modelId);

        System.out.println("Series : " + series);
        System.out.println("Another Series : " + JuicerMixerGrinder.series);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + JuicerMixerGrinder.type);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + JuicerMixerGrinder.color);

        System.out.println("Total Jars : " + totalJars);
        System.out.println("Another Total Jars : " + JuicerMixerGrinder.totalJars);

        System.out.println("Dry Grinding : " + isDryGrinding);
        System.out.println("Another Dry Grinding : " + JuicerMixerGrinder.isDryGrinding);

        System.out.println("Wet Grinding : " + isWetGrinding);
        System.out.println("Another Wet Grinding : " + JuicerMixerGrinder.isWetGrinding);

        System.out.println("Blending : " + isBlending);
        System.out.println("Another Blending : " + JuicerMixerGrinder.isBlending);

        System.out.println("Mincing : " + isMincing);
        System.out.println("Another Mincing : " + JuicerMixerGrinder.isMincing);

        System.out.println("Grating : " + isGrating);
        System.out.println("Another Grating : " + JuicerMixerGrinder.isGrating);

        System.out.println("Chutney Grinding : " + isChutneyGrinding);
        System.out.println("Another Chutney Grinding : " + JuicerMixerGrinder.isChutneyGrinding);

        System.out.println("Juicing : " + isJuicing);
        System.out.println("Another Juicing : " + JuicerMixerGrinder.isJuicing);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + JuicerMixerGrinder.price);
    }
}
