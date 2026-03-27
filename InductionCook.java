class InductionCook {
    static String brandName = "Philips";
    static String productName = "Induction Cooktop";
    static String modelNumber = "HD4928/01";
    static int powerWatts = 2100;
    static String bodyMaterial = "Micro Crystal Plate";
    static String controlType = "Push Button";
    static String displayType = "LED";
    static int presetCookingMenus = 6;
    static boolean timerAvailable = true;
    static String maxTimerSetting = "3 Hours";
    static boolean fastHeating = true;
    static String countryOfBrand = "Netherlands";

    public static void main(String args[]) {

        System.out.println("Brand Name : " + brandName);
        System.out.println("Product Name : " + productName);
        System.out.println("Model Number : " + modelNumber);
        System.out.println("Power (Watts) : " + powerWatts);
        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Control Type : " + controlType);
        System.out.println("Display Type : " + displayType);
        System.out.println("Preset Cooking Menus : " + presetCookingMenus);
        System.out.println("Timer Available : " + timerAvailable);
        System.out.println("Maximum Timer Setting : " + maxTimerSetting);
        System.out.println("Fast Heating : " + fastHeating);
        System.out.println("Brand Country : " + countryOfBrand);
    }
}
