class Swiggy
{
	public static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Idli") return 30.0;
		else if(itemName == "Dosa") return 50.0;
		else if(itemName == "Masala Dosa") return 70.0;
		else if(itemName == "Vada") return 25.0;
		else if(itemName == "Pongal") return 60.0;
		else if(itemName == "Upma") return 40.0;
		else if(itemName == "Poori") return 50.0;
		else if(itemName == "Chapati") return 40.0;
		else if(itemName == "Paratha") return 60.0;
		else if(itemName == "Veg Biryani") return 120.0;

		else if(itemName == "Chicken Biryani") return 180.0;
		else if(itemName == "Mutton Biryani") return 220.0;
		else if(itemName == "Fried Rice") return 100.0;
		else if(itemName == "Noodles") return 90.0;
		else if(itemName == "Manchurian") return 110.0;
		else if(itemName == "Paneer Butter Masala") return 150.0;
		else if(itemName == "Kadai Paneer") return 160.0;
		else if(itemName == "Dal Fry") return 90.0;
		else if(itemName == "Jeera Rice") return 80.0;
		else if(itemName == "Curd Rice") return 60.0;

		else if(itemName == "Sambar Rice") return 70.0;
		else if(itemName == "Rasam Rice") return 65.0;
		else if(itemName == "Fish Curry") return 170.0;
		else if(itemName == "Chicken Curry") return 160.0;
		else if(itemName == "Butter Chicken") return 190.0;
		else if(itemName == "Tandoori Chicken") return 200.0;
		else if(itemName == "Chicken 65") return 140.0;
		else if(itemName == "Gobi 65") return 110.0;
		else if(itemName == "Spring Roll") return 90.0;
		else if(itemName == "Veg Roll") return 80.0;

		else if(itemName == "Chicken Roll") return 100.0;
		else if(itemName == "Burger Meal") return 150.0;
		else if(itemName == "Pizza Combo") return 250.0;
		else if(itemName == "French Fries") return 90.0;
		else if(itemName == "Garlic Bread") return 120.0;
		else if(itemName == "Pasta White Sauce") return 180.0;
		else if(itemName == "Pasta Red Sauce") return 170.0;
		else if(itemName == "Momos Veg") return 80.0;
		else if(itemName == "Momos Chicken") return 100.0;
		else if(itemName == "Hot Dog") return 120.0;

		else if(itemName == "Sandwich Veg") return 90.0;
		else if(itemName == "Sandwich Chicken") return 120.0;
		else if(itemName == "Milk Tea") return 20.0;
		else if(itemName == "Black Tea") return 15.0;
		else if(itemName == "Coffee Hot") return 30.0;
		else if(itemName == "Cold Coffee") return 80.0;
		else if(itemName == "Lassi Sweet") return 60.0;
		else if(itemName == "Lassi Salt") return 50.0;
		else if(itemName == "Falooda") return 90.0;
		else if(itemName == "Brownie") return 100.0;

		else if(itemName == "Cupcake") return 70.0;
		else if(itemName == "Donut") return 80.0;
		else if(itemName == "Waffle") return 120.0;
		else if(itemName == "Pancake") return 110.0;
		else if(itemName == "Ice Cream Sundae") return 150.0;
		else if(itemName == "Kulfi") return 60.0;
		else if(itemName == "Fruit Salad") return 90.0;
		else if(itemName == "Chicken Wings") return 160.0;
		else if(itemName == "Grilled Sandwich") return 130.0;

		else
		{
			System.out.println(itemName + " not found");
		}

		return price;
	}

	public static double search(String itemName, int quantity)
	{
		double price = search(itemName);
		if(price > 0)
		{
			return price * quantity;
		}
		else
		{
			System.out.println(itemName + " not found");
		}
		return 0.0;
	}
}