class Eyewear {

    static String brand = "xyz";
    static String modelName = "basic model";
    static String type = "glasses";
    static String frameMaterial = "plastic";
    static String lensType = "normal";
    static String frameColor = "black";
    static String lensColor = "black";
    static String idealFor = "all";
    static boolean isPolarized = false;
    static double price = 0.0;

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

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + Eyewear.brand);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + Eyewear.modelName);

        System.out.println("Type : " + type);
        System.out.println("Another Type : " + Eyewear.type);

        System.out.println("Frame Material : " + frameMaterial);
        System.out.println("Another Frame Material : " + Eyewear.frameMaterial);

        System.out.println("Lens Type : " + lensType);
        System.out.println("Another Lens Type : " + Eyewear.lensType);

        System.out.println("Frame Color : " + frameColor);
        System.out.println("Another Frame Color : " + Eyewear.frameColor);

        System.out.println("Lens Color : " + lensColor);
        System.out.println("Another Lens Color : " + Eyewear.lensColor);

        System.out.println("Ideal For : " + idealFor);
        System.out.println("Another Ideal For : " + Eyewear.idealFor);

        System.out.println("Polarized : " + isPolarized);
        System.out.println("Another Polarized : " + Eyewear.isPolarized);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + Eyewear.price);
    }
}
