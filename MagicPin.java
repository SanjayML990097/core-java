class MagicPin
{
	public static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "French Fries") return 90.0;
		else if(itemName == "Peri Peri Fries") return 110.0;
		else if(itemName == "Cheese Fries") return 120.0;
		else if(itemName == "Loaded Fries") return 150.0;
		else if(itemName == "Nacho Chips") return 130.0;
		else if(itemName == "Cheese Nachos") return 160.0;
		else if(itemName == "Chicken Nuggets") return 180.0;
		else if(itemName == "Veg Nuggets") return 140.0;
		else if(itemName == "Onion Rings") return 120.0;
		else if(itemName == "Mozzarella Sticks") return 170.0;

		else if(itemName == "Hot Dog") return 150.0;
		else if(itemName == "Chicken Hot Dog") return 180.0;
		else if(itemName == "Veg Hot Dog") return 140.0;
		else if(itemName == "Grilled Sandwich") return 130.0;
		else if(itemName == "Club Sandwich") return 160.0;
		else if(itemName == "Cheese Sandwich") return 120.0;
		else if(itemName == "Veg Wrap Roll") return 140.0;
		else if(itemName == "Chicken Wrap Roll") return 170.0;
		else if(itemName == "Paneer Roll") return 150.0;
		else if(itemName == "Egg Roll") return 130.0;

		else if(itemName == "Cold Coffee") return 110.0;
		else if(itemName == "Cold Coffee Ice Cream") return 140.0;
		else if(itemName == "Iced Mocha") return 130.0;
		else if(itemName == "Caramel Frappe") return 150.0;
		else if(itemName == "Vanilla Frappe") return 140.0;
		else if(itemName == "Chocolate Frappe") return 150.0;
		else if(itemName == "Strawberry Smoothie") return 140.0;
		else if(itemName == "Mango Smoothie") return 130.0;
		else if(itemName == "Banana Smoothie") return 120.0;
		else if(itemName == "Oreo Shake") return 150.0;

		else if(itemName == "KitKat Shake") return 150.0;
		else if(itemName == "Butterscotch Shake") return 140.0;
		else if(itemName == "Black Currant Shake") return 150.0;
		else if(itemName == "Choco Chip Shake") return 150.0;
		else if(itemName == "Dry Fruit Shake") return 160.0;
		else if(itemName == "Pineapple Shake") return 130.0;
		else if(itemName == "Watermelon Shake") return 120.0;
		else if(itemName == "Cold Boost") return 110.0;
		else if(itemName == "Rose Milk") return 100.0;
		else if(itemName == "Soda Lemon") return 90.0;

		else if(itemName == "Chocolate Ice Cream") return 90.0;
		else if(itemName == "Vanilla Ice Cream") return 80.0;
		else if(itemName == "Strawberry Ice Cream") return 85.0;
		else if(itemName == "Butterscotch Ice Cream") return 95.0;
		else if(itemName == "Black Forest Ice Cream") return 100.0;
		else if(itemName == "Chocolate Sundae") return 120.0;
		else if(itemName == "Fruit Sundae") return 130.0;
		else if(itemName == "Brownie Sundae") return 150.0;
		else if(itemName == "Ice Cream Sandwich") return 110.0;
		else if(itemName == "Choco Bar") return 70.0;

		else if(itemName == "Energy Cola") return 90.0;
		else if(itemName == "Sparkling Water") return 80.0;
		else if(itemName == "Mint Cooler") return 100.0;
		else if(itemName == "Peach Iced Tea") return 110.0;
		else if(itemName == "Blue Lagoon") return 120.0;
		else if(itemName == "Green Apple Soda") return 110.0;
		else if(itemName == "Berry Blast") return 130.0;
		else if(itemName == "Chocolate Donut") return 90.0;
		else if(itemName == "Sugar Donut") return 80.0;

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