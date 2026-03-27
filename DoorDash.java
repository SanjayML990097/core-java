class DoorDash
{
	public static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Apple Pie") return 120.0;
		else if(itemName == "Banana Shake") return 80.0;
		else if(itemName == "Strawberry Shake") return 90.0;
		else if(itemName == "Chocolate Shake") return 100.0;
		else if(itemName == "Vanilla Shake") return 85.0;
		else if(itemName == "Blueberry Muffin") return 70.0;
		else if(itemName == "Choco Chip Cookie") return 60.0;
		else if(itemName == "Oreo Cake") return 150.0;
		else if(itemName == "Black Forest Cake") return 160.0;
		else if(itemName == "White Forest Cake") return 170.0;

		else if(itemName == "Cheese Pizza") return 200.0;
		else if(itemName == "Veggie Pizza") return 220.0;
		else if(itemName == "Pepperoni Pizza") return 250.0;
		else if(itemName == "BBQ Chicken Pizza") return 280.0;
		else if(itemName == "Farmhouse Pizza") return 260.0;
		else if(itemName == "Cheese Burst Pizza") return 300.0;
		else if(itemName == "Garlic Pizza Bread") return 140.0;
		else if(itemName == "Stuffed Crust Pizza") return 320.0;
		else if(itemName == "Mini Pizza") return 120.0;
		else if(itemName == "Pizza Slice") return 90.0;

		else if(itemName == "Taco Veg") return 110.0;
		else if(itemName == "Taco Chicken") return 130.0;
		else if(itemName == "Burrito Veg") return 150.0;
		else if(itemName == "Burrito Chicken") return 180.0;
		else if(itemName == "Nachos") return 140.0;
		else if(itemName == "Loaded Nachos") return 180.0;
		else if(itemName == "Quesadilla Veg") return 160.0;
		else if(itemName == "Quesadilla Chicken") return 190.0;
		else if(itemName == "Mexican Rice") return 150.0;
		else if(itemName == "Churros") return 100.0;

		else if(itemName == "Caesar Salad") return 130.0;
		else if(itemName == "Greek Salad") return 140.0;
		else if(itemName == "Chicken Salad") return 160.0;
		else if(itemName == "Fruit Bowl") return 120.0;
		else if(itemName == "Veg Wrap") return 110.0;
		else if(itemName == "Chicken Wrap") return 140.0;
		else if(itemName == "Paneer Wrap") return 130.0;
		else if(itemName == "Falafel Wrap") return 150.0;
		else if(itemName == "Hummus Plate") return 160.0;
		else if(itemName == "Pita Bread") return 80.0;

		else if(itemName == "Espresso") return 60.0;
		else if(itemName == "Cappuccino") return 90.0;
		else if(itemName == "Latte") return 100.0;
		else if(itemName == "Mocha") return 110.0;
		else if(itemName == "Americano") return 80.0;
		else if(itemName == "Iced Latte") return 120.0;
		else if(itemName == "Iced Tea") return 70.0;
		else if(itemName == "Lemonade") return 60.0;
		else if(itemName == "Mint Mojito") return 90.0;
		else if(itemName == "Orange Juice") return 80.0;

		else if(itemName == "Watermelon Juice") return 75.0;
		else if(itemName == "Pineapple Juice") return 85.0;
		else if(itemName == "Mango Juice") return 95.0;
		else if(itemName == "Energy Drink") return 120.0;
		else if(itemName == "Protein Shake") return 150.0;
		else if(itemName == "Granola Bar") return 50.0;
		else if(itemName == "Peanut Butter Sandwich") return 90.0;
		else if(itemName == "Avocado Toast") return 140.0;
		else if(itemName == "Egg Sandwich") return 100.0;

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