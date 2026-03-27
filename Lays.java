class Lays {

    static String brandName = "Lays";

    static String ingredients[] = {
        "Potatoes", "Edible Vegetable Oil", "Salt",
        "Chilli Powder", "Onion Powder",
        "Garlic Powder", "Sugar",
        "Spices and Condiments"
    };

    public static void main(String args[]) {

        System.out.println("Brand name is " + brandName);

        System.out.println("List of ingredients are:");
        getIngredients();
    }

    public static void getIngredients() {
        for(String item : ingredients) {
            System.out.println(item);
        }
    }
}