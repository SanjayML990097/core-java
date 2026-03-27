class InductionCook {

    static String brandName;
    static String productName;
    static String modelNumber;
    static int powerWatts;
    static String bodyMaterial;
    static String controlType;
    static String displayType;
    static int presetCookingMenus;
    static boolean timerAvailable;
    static String maxTimerSetting;
    static boolean fastHeating;
    static String countryOfBrand;

    public static void main(String args[]) {

        brandName = "Philips";
        productName = "Induction Cooktop";
        modelNumber = "HD4928/01";
        powerWatts = 2100;
        bodyMaterial = "Micro Crystal Plate";
        controlType = "Push Button";
        displayType = "LED";
        presetCookingMenus = 6;
        timerAvailable = true;
        maxTimerSetting = "3 Hours";
        fastHeating = true;
        countryOfBrand = "Netherlands";

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
