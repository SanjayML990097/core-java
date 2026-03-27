class TrainingShoes {

    static String brand = "unknown";
    static String brandColor = "black";
    static String color = "white";
    static String suitableFor = "casual";
    static String innerMaterial = "synthetic";
    static String outerMaterial = "synthetic";
    static String modelName = "basic shoes";
    static String idealFor = "men";
    static String occasion = "daily";
    static String typeForSports = "walking";
    static String heelPattern = "solid";
    static int netQuantity = 0;
    static double price = 0.0;

    public static void main(String[] args) {

        brand = "HOTSTYLE";
        brandColor = "Green";
        color = "Multicolor";
        suitableFor = "Sports";
        innerMaterial = "Mesh";
        outerMaterial = "Mesh";
        modelName = "Training & Gym Shoes, Walking Shoes, Sneakers";
        idealFor = "Men";
        occasion = "Sports";
        typeForSports = "Running Shoes";
        heelPattern = "Solid";
        netQuantity = 1;
        price = 377.0;

        System.out.println("Brand : " + brand);
        System.out.println("Another Brand : " + TrainingShoes.brand);

        System.out.println("Brand Color : " + brandColor);
        System.out.println("Another Brand Color : " + TrainingShoes.brandColor);

        System.out.println("Color : " + color);
        System.out.println("Another Color : " + TrainingShoes.color);

        System.out.println("Suitable For : " + suitableFor);
        System.out.println("Another Suitable For : " + TrainingShoes.suitableFor);

        System.out.println("Inner Material : " + innerMaterial);
        System.out.println("Another Inner Material : " + TrainingShoes.innerMaterial);

        System.out.println("Outer Material : " + outerMaterial);
        System.out.println("Another Outer Material : " + TrainingShoes.outerMaterial);

        System.out.println("Model Name : " + modelName);
        System.out.println("Another Model Name : " + TrainingShoes.modelName);

        System.out.println("Ideal For : " + idealFor);
        System.out.println("Another Ideal For : " + TrainingShoes.idealFor);

        System.out.println("Occasion : " + occasion);
        System.out.println("Another Occasion : " + TrainingShoes.occasion);

        System.out.println("Type For Sports : " + typeForSports);
        System.out.println("Another Type For Sports : " + TrainingShoes.typeForSports);

        System.out.println("Heel Pattern : " + heelPattern);
        System.out.println("Another Heel Pattern : " + TrainingShoes.heelPattern);

        System.out.println("Net Quantity : " + netQuantity);
        System.out.println("Another Net Quantity : " + TrainingShoes.netQuantity);

        System.out.println("Price : ₹" + price);
        System.out.println("Another Price : ₹" + TrainingShoes.price);
    }
}
