class EatSure
{
	public static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Butter Naan") return 40.0;
		else if(itemName == "Garlic Naan") return 50.0;
		else if(itemName == "Tandoori Roti") return 30.0;
		else if(itemName == "Rumali Roti") return 35.0;
		else if(itemName == "Missi Roti") return 45.0;
		else if(itemName == "Lachha Paratha") return 60.0;
		else if(itemName == "Stuffed Kulcha") return 70.0;
		else if(itemName == "Amritsari Kulcha") return 90.0;
		else if(itemName == "Plain Rice") return 60.0;
		else if(itemName == "Veg Pulao") return 110.0;

		else if(itemName == "Peas Pulao") return 120.0;
		else if(itemName == "Veg Khichdi") return 100.0;
		else if(itemName == "Masala Khichdi") return 120.0;
		else if(itemName == "Curd Pulao") return 110.0;
		else if(itemName == "Paneer Pulao") return 150.0;
		else if(itemName == "Kashmiri Pulao") return 160.0;
		else if(itemName == "Veg Fried Noodles") return 130.0;
		else if(itemName == "Hakka Noodles") return 140.0;
		else if(itemName == "Schezwan Noodles") return 150.0;
		else if(itemName == "Singapore Noodles") return 160.0;

		else if(itemName == "Veg Manchurian") return 140.0;
		else if(itemName == "Gobi Manchurian") return 130.0;
		else if(itemName == "Paneer Manchurian") return 170.0;
		else if(itemName == "Chilli Paneer") return 180.0;
		else if(itemName == "Chilli Chicken") return 200.0;
		else if(itemName == "Veg Spring Roll") return 120.0;
		else if(itemName == "Cheese Balls") return 150.0;
		else if(itemName == "Corn Nuggets") return 140.0;
		else if(itemName == "Veg Cutlet") return 100.0;
		else if(itemName == "Paneer Tikka") return 220.0;

		else if(itemName == "Chicken Tikka") return 240.0;
		else if(itemName == "Tandoori Chicken") return 260.0;
		else if(itemName == "Chicken Wings") return 230.0;
		else if(itemName == "Fish Fry") return 250.0;
		else if(itemName == "Prawn Fry") return 270.0;
		else if(itemName == "Veg Burger") return 90.0;
		else if(itemName == "Chicken Burger") return 120.0;
		else if(itemName == "Paneer Burger") return 110.0;
		else if(itemName == "Double Cheese Burger") return 150.0;
		else if(itemName == "Veg Pizza") return 200.0;

		else if(itemName == "Chicken Pizza") return 240.0;
		else if(itemName == "Paneer Pizza") return 220.0;
		else if(itemName == "Margherita Pizza") return 180.0;
		else if(itemName == "Farmhouse Pizza") return 260.0;
		else if(itemName == "Cheese Pasta") return 150.0;
		else if(itemName == "White Sauce Pasta") return 160.0;
		else if(itemName == "Red Sauce Pasta") return 150.0;
		else if(itemName == "Mix Sauce Pasta") return 170.0;
		else if(itemName == "Mac and Cheese") return 180.0;
		else if(itemName == "Lasagna") return 200.0;

		else if(itemName == "Chocolate Brownie") return 120.0;
		else if(itemName == "Vanilla Cupcake") return 80.0;
		else if(itemName == "Strawberry Cupcake") return 90.0;
		else if(itemName == "Choco Lava Cake") return 110.0;
		else if(itemName == "Donut") return 70.0;
		else if(itemName == "Waffle") return 140.0;
		else if(itemName == "Pancake") return 130.0;
		else if(itemName == "Crepe") return 150.0;
		else if(itemName == "Milkshake Chocolate") return 120.0;

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