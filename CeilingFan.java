class CeilingFan {

    static String brandName = "xyz";
    static String modelName = "abc";
    static String color = "white";
    static int numberOfBlades = 0;
    static String bodyMaterial = "plastic";
    static int priceINR = 0;

    public static void main(String args[]) {

        brandName = "KUHL";
        modelName = "Prima A2 BLDC Ceiling Fan";
        color = "Brown";
        numberOfBlades = 3;
        bodyMaterial = "Aluminium";
        priceINR = 2149;

        System.out.println("Brand Name : " + brandName);
        System.out.println("Another Brand Name : " + CeilingFan.brandName);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + CeilingFan.modelName);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + CeilingFan.color);

        System.out.println("Number Of Blades : " + numberOfBlades);
        System.out.println("Another Number Of Blades : " + CeilingFan.numberOfBlades);

        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Another Body Material : " + CeilingFan.bodyMaterial);

        System.out.println("Price : Rs. " + priceINR);
        System.out.println("Another Price : Rs. " + CeilingFan.priceINR);
    }
}
