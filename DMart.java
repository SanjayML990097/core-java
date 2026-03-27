class DMart
{
    static String items[] = {
        "Rice",
        "Wheat Flour",
        "Cooking Oil",
        "Sugar",
        "Milk",
        "Soap",
        "Shampoo",
        "Toothpaste",
        "Detergent Powder"
    };

    public static void getItems()
    {   
        System.out.println("get items invoked : ");
        for(String item : items){
            System.out.println(item);
        }
        System.out.println("end of the items");
    }
}