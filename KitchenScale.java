class KitchenScale {

    static String brandName = "xyz";
    static String modelName = "basic model";
    static String color = "black";
    static String type = "weighing scale";
    static String material = "plastic";
    static String displayType = "normal display";
    static String powerSource = "manual";
    static String batteryType = "none";
    static int priceINR = 0;

    public static void main(String args[]) {

        brandName = "MCP Healthcare";
        modelName = "Kitchen Scale Digital Delux Multi Purpose Weighing Scale TS 500 Electronic";
        color = "White";
        type = "Kitchen Scale";
        material = "Plastic";
        displayType = "LCD Display";
        powerSource = "Battery";
        batteryType = "AAA";
        priceINR = 623;

        System.out.println("Brand Name : " + brandName);
        System.out.println("Another Brand Name : " + KitchenScale.brandName);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + KitchenScale.modelName);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + KitchenScale.color);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + KitchenScale.type);

        System.out.println("Material : " + material);
        System.out.println("Another Material : " + KitchenScale.material);

        System.out.println("Display Type : " + displayType);
        System.out.println("Another Display Type : " + KitchenScale.displayType);

        System.out.println("Power Source : " + powerSource);
        System.out.println("Another Power Source : " + KitchenScale.powerSource);

        System.out.println("Battery Type : " + batteryType);
        System.out.println("Another Battery Type : " + KitchenScale.batteryType);

        System.out.println("Price : Rs. " + priceINR);
        System.out.println("Another Price : Rs. " + KitchenScale.priceINR);
    }
}
