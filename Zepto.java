class Zepto
{
	public static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Kurkure") return 18.0;
		else if(itemName == "Juice") return 20.0;
		else if(itemName == "Lays") return 10.0;
		else if(itemName == "Maggie") return 15.0;
		else if(itemName == "Milk Shake") return 45.0;
		else if(itemName == "Sandwich Ice Cream") return 30.0;
		else if(itemName == "Perfume") return 199.0;
		else if(itemName == "Nivea Moistueizer") return 79.0;
		else if(itemName == "Chocolate Cake") return 150.0;

		else if(itemName == "Biscuits") return 25.0;
		else if(itemName == "Bread") return 40.0;
		else if(itemName == "Butter") return 55.0;
		else if(itemName == "Cheese") return 120.0;
		else if(itemName == "Paneer") return 90.0;
		else if(itemName == "Eggs") return 70.0;
		else if(itemName == "Rice") return 60.0;
		else if(itemName == "Wheat Flour") return 50.0;
		else if(itemName == "Sugar") return 45.0;
		else if(itemName == "Salt") return 20.0;

		else if(itemName == "Tea Powder") return 110.0;
		else if(itemName == "Coffee") return 150.0;
		else if(itemName == "Soft Drink") return 40.0;
		else if(itemName == "Water Bottle") return 20.0;
		else if(itemName == "Apple") return 120.0;
		else if(itemName == "Banana") return 50.0;
		else if(itemName == "Orange") return 80.0;
		else if(itemName == "Grapes") return 90.0;
		else if(itemName == "Mango") return 150.0;
		else if(itemName == "Tomato") return 30.0;

		else if(itemName == "Potato") return 25.0;
		else if(itemName == "Onion") return 35.0;
		else if(itemName == "Carrot") return 40.0;
		else if(itemName == "Cabbage") return 30.0;
		else if(itemName == "Cauliflower") return 45.0;
		else if(itemName == "Spinach") return 20.0;
		else if(itemName == "Chips") return 30.0;
		else if(itemName == "Popcorn") return 60.0;
		else if(itemName == "Ice Cream") return 100.0;
		else if(itemName == "Chocolate") return 80.0;

		else if(itemName == "Toothpaste") return 90.0;
		else if(itemName == "Toothbrush") return 40.0;
		else if(itemName == "Shampoo") return 120.0;
		else if(itemName == "Soap") return 35.0;
		else if(itemName == "Face Wash") return 150.0;
		else if(itemName == "Hand Wash") return 70.0;
		else if(itemName == "Detergent") return 200.0;
		else if(itemName == "Floor Cleaner") return 180.0;
		else if(itemName == "Dish Wash") return 90.0;
		else if(itemName == "Notebook") return 50.0;

		else if(itemName == "Pen") return 10.0;
		else if(itemName == "Pencil") return 5.0;
		else if(itemName == "Eraser") return 3.0;
		else if(itemName == "Sharpener") return 5.0;
		else if(itemName == "Bag") return 500.0;
		else if(itemName == "T-shirt") return 300.0;
		else if(itemName == "Jeans") return 800.0;
		else if(itemName == "Shoes") return 1200.0;
		else if(itemName == "Watch") return 1500.0;
		else if(itemName == "Sunglasses") return 600.0;

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