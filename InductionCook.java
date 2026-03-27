class InductionCook {

    static String brandName = "xyz";
    static String productName = "cooktop";
    static String modelNumber = "0000";
    static int powerWatts = 0;
    static String bodyMaterial = "basic plate";
    static String controlType = "manual";
    static String displayType = "none";
    static int presetCookingMenus = 0;
    static boolean timerAvailable = false;
    static String maxTimerSetting = "0 Hour";
    static boolean fastHeating = false;
    static String countryOfBrand = "unknown";

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
        System.out.println("Another Brand Name : " + InductionCook.brandName);

        System.out.println("Product Name : " + productName);
        System.out.println("Another Product Name : " + InductionCook.productName);

        System.out.println("Model Number : " + modelNumber);
        System.out.println("Another Model Number : " + InductionCook.modelNumber);

        System.out.println("Power (Watts) : " + powerWatts);
        System.out.println("Another Power (Watts) : " + InductionCook.powerWatts);

        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Another Body Material : " + InductionCook.bodyMaterial);

        System.out.println("Control Type : " + controlType);
        System.out.println("Another Control Type : " + InductionCook.controlType);

        System.out.println("Display Type : " + displayType);
        System.out.println("Another Display Type : " + InductionCook.displayType);

        System.out.println("Preset Cooking Menus : " + presetCookingMenus);
        System.out.println("Another Preset Cooking Menus : " + InductionCook.presetCookingMenus);

        System.out.println("Timer Available : " + timerAvailable);
        System.out.println("Another Timer Available : " + InductionCook.timerAvailable);

        System.out.println("Maximum Timer Setting : " + maxTimerSetting);
        System.out.println("Another Maximum Timer Setting : " + InductionCook.maxTimerSetting);

        System.out.println("Fast Heating : " + fastHeating);
        System.out.println("Another Fast Heating : " + InductionCook.fastHeating);

        System.out.println("Brand Country : " + countryOfBrand);
        System.out.println("Another Brand Country : " + InductionCook.countryOfBrand);
    }
}
