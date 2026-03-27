class UberEats
{
	public static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Idli") return 40.0;
		else if(itemName == "Dosa") return 60.0;
		else if(itemName == "Masala Dosa") return 80.0;
		else if(itemName == "Vada") return 30.0;
		else if(itemName == "Upma") return 50.0;
		else if(itemName == "Pongal") return 70.0;
		else if(itemName == "Poori") return 60.0;
		else if(itemName == "Chapati") return 40.0;
		else if(itemName == "Paratha") return 70.0;
		else if(itemName == "Aloo Paratha") return 90.0;

		else if(itemName == "Veg Biryani") return 120.0;
		else if(itemName == "Chicken Biryani") return 180.0;
		else if(itemName == "Mutton Biryani") return 220.0;
		else if(itemName == "Paneer Biryani") return 160.0;
		else if(itemName == "Egg Biryani") return 150.0;
		else if(itemName == "Fried Rice") return 110.0;
		else if(itemName == "Jeera Rice") return 90.0;
		else if(itemName == "Curd Rice") return 80.0;
		else if(itemName == "Lemon Rice") return 85.0;
		else if(itemName == "Tamarind Rice") return 90.0;

		else if(itemName == "Sambar") return 60.0;
		else if(itemName == "Rasam") return 50.0;
		else if(itemName == "Dal Fry") return 100.0;
		else if(itemName == "Paneer Butter Masala") return 180.0;
		else if(itemName == "Kadai Paneer") return 170.0;
		else if(itemName == "Veg Kurma") return 140.0;
		else if(itemName == "Chicken Curry") return 200.0;
		else if(itemName == "Mutton Curry") return 250.0;
		else if(itemName == "Fish Curry") return 220.0;
		else if(itemName == "Egg Curry") return 150.0;

		else if(itemName == "Gulab Jamun") return 60.0;
		else if(itemName == "Rasgulla") return 70.0;
		else if(itemName == "Kheer") return 80.0;
		else if(itemName == "Halwa") return 90.0;
		else if(itemName == "Ladoo") return 50.0;
		else if(itemName == "Jalebi") return 60.0;
		else if(itemName == "Barfi") return 70.0;
		else if(itemName == "Ice Halwa") return 120.0;
		else if(itemName == "Kulfi") return 80.0;
		else if(itemName == "Falooda") return 100.0;

		else if(itemName == "Masala Tea") return 20.0;
		else if(itemName == "Green Tea") return 25.0;
		else if(itemName == "Cold Coffee") return 90.0;
		else if(itemName == "Hot Chocolate") return 110.0;
		else if(itemName == "Buttermilk") return 30.0;
		else if(itemName == "Lassi") return 60.0;
		else if(itemName == "Sweet Lassi") return 70.0;
		else if(itemName == "Salted Lassi") return 60.0;
		else if(itemName == "Tender Coconut Water") return 50.0;
		else if(itemName == "Sugarcane Juice") return 40.0;

		else if(itemName == "Veg Sandwich") return 80.0;
		else if(itemName == "Grilled Sandwich") return 100.0;
		else if(itemName == "Club Sandwich") return 120.0;
		else if(itemName == "Paneer Sandwich") return 110.0;
		else if(itemName == "Chicken Sandwich") return 130.0;
		else if(itemName == "French Fries") return 90.0;
		else if(itemName == "Peri Peri Fries") return 110.0;
		else if(itemName == "Onion Rings") return 100.0;
		else if(itemName == "Spring Rolls") return 120.0;

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