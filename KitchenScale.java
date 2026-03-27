class KitchenScale {

    static String brandName;
    static String modelName;
    static String color;
    static String type;
    static String material;
    static String displayType;
    static String powerSource;
    static String batteryType;
    static int priceINR;

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
        System.out.println("Model Name : " + modelName);
        System.out.println("Color : " + color);
        System.out.println("Type : " + type);
        System.out.println("Material : " + material);
        System.out.println("Display Type : " + displayType);
        System.out.println("Power Source : " + powerSource);
        System.out.println("Battery Type : " + batteryType);
        System.out.println("Price : Rs. " + priceINR);
    }
}
