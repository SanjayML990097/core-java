class JuicerMixerGrinder {
    public static void main(String[] args) {

        String brand = "Sansui";
        String modelId = "Allure Plus";
        String series = "Plus";
        String type = "Juicer Mixer Grinder";
        String color = "Black, Blue";

        int totalJars = 3;

        boolean isDryGrinding = true;
        boolean isWetGrinding = true;
        boolean isBlending = true;
        boolean isMincing = true;
        boolean isGrating = true;
        boolean isChutneyGrinding = true;
        boolean isJuicing = true;

        double price = 1299.0;

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
