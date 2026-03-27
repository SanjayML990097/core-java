class FoodPanda
{
	public static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Idli") return 40.0;
		else if(itemName == "Vada") return 35.0;
		else if(itemName == "Dosa") return 60.0;
		else if(itemName == "Masala Dosa") return 80.0;
		else if(itemName == "Rava Dosa") return 90.0;
		else if(itemName == "Onion Dosa") return 85.0;
		else if(itemName == "Set Dosa") return 70.0;
		else if(itemName == "Pesarattu") return 95.0;
		else if(itemName == "Upma") return 50.0;
		else if(itemName == "Pongal") return 60.0;

		else if(itemName == "Sambar Rice") return 80.0;
		else if(itemName == "Curd Rice") return 70.0;
		else if(itemName == "Lemon Rice") return 75.0;
		else if(itemName == "Tamarind Rice") return 80.0;
		else if(itemName == "Tomato Rice") return 85.0;
		else if(itemName == "Bisibele Bath") return 100.0;
		else if(itemName == "Vangi Bath") return 95.0;
		else if(itemName == "Coconut Rice") return 85.0;
		else if(itemName == "Jeera Rice") return 90.0;
		else if(itemName == "Ghee Rice") return 110.0;

		else if(itemName == "Paneer Butter Masala") return 180.0;
		else if(itemName == "Kadai Paneer") return 170.0;
		else if(itemName == "Palak Paneer") return 160.0;
		else if(itemName == "Dal Tadka") return 120.0;
		else if(itemName == "Dal Fry") return 110.0;
		else if(itemName == "Rajma Masala") return 140.0;
		else if(itemName == "Chole Masala") return 150.0;
		else if(itemName == "Aloo Gobi") return 130.0;
		else if(itemName == "Baingan Bharta") return 135.0;
		else if(itemName == "Mixed Veg Curry") return 140.0;

		else if(itemName == "Chicken Curry") return 200.0;
		else if(itemName == "Chicken Biryani") return 220.0;
		else if(itemName == "Mutton Biryani") return 260.0;
		else if(itemName == "Egg Biryani") return 180.0;
		else if(itemName == "Fish Curry") return 210.0;
		else if(itemName == "Prawn Curry") return 240.0;
		else if(itemName == "Chicken Keema") return 230.0;
		else if(itemName == "Butter Chicken") return 250.0;
		else if(itemName == "Chicken Korma") return 240.0;
		else if(itemName == "Mutton Rogan Josh") return 270.0;

		else if(itemName == "Samosa") return 20.0;
		else if(itemName == "Kachori") return 25.0;
		else if(itemName == "Pakora") return 30.0;
		else if(itemName == "Mirchi Bajji") return 35.0;
		else if(itemName == "Bread Pakora") return 40.0;
		else if(itemName == "Aloo Bonda") return 30.0;
		else if(itemName == "Pav Bhaji") return 120.0;
		else if(itemName == "Misal Pav") return 110.0;
		else if(itemName == "Vada Pav") return 25.0;
		else if(itemName == "Dabeli") return 30.0;

		else if(itemName == "Falooda") return 100.0;
		else if(itemName == "Kulfi") return 80.0;
		else if(itemName == "Rasgulla") return 90.0;
		else if(itemName == "Gulab Jamun") return 85.0;
		else if(itemName == "Jalebi") return 70.0;
		else if(itemName == "Rabri") return 110.0;
		else if(itemName == "Kheer") return 95.0;
		else if(itemName == "Badam Milk") return 90.0;
		else if(itemName == "Lassi") return 80.0;

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