class Restaurant {
    
    int restaurantId;
    String restaurantName;
    String location;
    String cuisineType;
    int rating;
    
    Chef chef;

    public void getRestaurantDetails() {
        System.out.println("The restaurantId is: " + restaurantId);
        System.out.println("The restaurantName is: " + restaurantName);
        System.out.println("The location is: " + location);
        System.out.println("The cuisineType is: " + cuisineType);
        System.out.println("The rating is: " + rating);

        chef.getChefDetails();
    }
}


