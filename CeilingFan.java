class CeilingFan {

    static String brandName;
    static String modelName;
    static String color;
    static int numberOfBlades;
    static String bodyMaterial;
    static int priceINR;

    public static void main(String args[]) {

        brandName = "KUHL";
        modelName = "Prima A2 BLDC Ceiling Fan";
        color = "Brown";
        numberOfBlades = 3;
        bodyMaterial = "Aluminium";
        priceINR = 2149;

        System.out.println("Brand Name : " + brandName);
        System.out.println("Model Name : " + modelName);
        System.out.println("Color : " + color);
        System.out.println("Number Of Blades : " + numberOfBlades);
        System.out.println("Body Material : " + bodyMaterial);
        System.out.println("Price : Rs. " + priceINR);
    }
}
