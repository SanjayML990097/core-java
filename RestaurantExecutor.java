class RestaurantExecutor {

    public static void main(String args[]) {

        Restaurant ref = new Restaurant();
        ref.restaurantId = 1;
        ref.restaurantName = "Spice Hub";
        ref.location = "Bangalore";
        ref.cuisineType = "Indian";
        ref.rating = 5;

        Chef c = new Chef();
        c.chefId = 101;
        c.chefName = "Arjun";
        c.experience = 10;
        c.specialty = "Biryani";
        c.shift = "Evening";

        ref.chef = c;

        ref.getRestaurantDetails();
		// 1
Restaurant ref1 = new Restaurant();
ref1.restaurantId = 1;
ref1.restaurantName = "Restaurant1";
ref1.location = "City1";
ref1.cuisineType = "Indian";
ref1.rating = 5;

Chef c1 = new Chef();
c1.chefId = 101;
c1.chefName = "Chef1";
c1.experience = 5;
c1.specialty = "Biryani";
c1.shift = "Morning";

ref1.chef = c1;
ref1.getRestaurantDetails();

// 2
Restaurant ref2 = new Restaurant();
ref2.restaurantId = 2;
ref2.restaurantName = "Restaurant2";
ref2.location = "City2";
ref2.cuisineType = "Chinese";
ref2.rating = 4;

Chef c2 = new Chef();
c2.chefId = 102;
c2.chefName = "Chef2";
c2.experience = 6;
c2.specialty = "Noodles";
c2.shift = "Evening";

ref2.chef = c2;
ref2.getRestaurantDetails();

// 3
Restaurant ref3 = new Restaurant();
ref3.restaurantId = 3;
ref3.restaurantName = "Restaurant3";
ref3.location = "City3";
ref3.cuisineType = "Italian";
ref3.rating = 5;

Chef c3 = new Chef();
c3.chefId = 103;
c3.chefName = "Chef3";
c3.experience = 7;
c3.specialty = "Pizza";
c3.shift = "Morning";

ref3.chef = c3;
ref3.getRestaurantDetails();

// 4
Restaurant ref4 = new Restaurant();
ref4.restaurantId = 4;
ref4.restaurantName = "Restaurant4";
ref4.location = "City4";
ref4.cuisineType = "Mexican";
ref4.rating = 4;

Chef c4 = new Chef();
c4.chefId = 104;
c4.chefName = "Chef4";
c4.experience = 8;
c4.specialty = "Tacos";
c4.shift = "Evening";

ref4.chef = c4;
ref4.getRestaurantDetails();

// 5
Restaurant ref5 = new Restaurant();
ref5.restaurantId = 5;
ref5.restaurantName = "Restaurant5";
ref5.location = "City5";
ref5.cuisineType = "Indian";
ref5.rating = 5;

Chef c5 = new Chef();
c5.chefId = 105;
c5.chefName = "Chef5";
c5.experience = 9;
c5.specialty = "Curry";
c5.shift = "Morning";

ref5.chef = c5;
ref5.getRestaurantDetails();

// continue same pattern till 29
    }
}