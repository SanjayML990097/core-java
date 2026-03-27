class Eyewear {

    static String brand;
    static String modelName;
    static String type;
    static String frameMaterial;
    static String lensType;
    static String frameColor;
    static String lensColor;
    static String idealFor;
    static boolean isPolarized;
    static double price;

    public static void main(String[] args) {

        brand = "Ray-Ban";
        modelName = "Aviator Classic";
        type = "Sunglasses";
        frameMaterial = "Metal";
        lensType = "UV Protection";
        frameColor = "Gold";
        lensColor = "Green";
        idealFor = "Men & Women";
        isPolarized = true;
        price = 7499.0;

        System.out.println("Brand: " + brand);
        System.out.println("Model Name: " + modelName);
        System.out.println("Type: " + type);
        System.out.println("Frame Material: " + frameMaterial);
        System.out.println("Lens Type: " + lensType);
        System.out.println("Frame Color: " + frameColor);
        System.out.println("Lens Color: " + lensColor);
        System.out.println("Ideal For: " + idealFor);
        System.out.println("Polarized: " + isPolarized);
        System.out.println("Price: ₹" + price);
    }
}
