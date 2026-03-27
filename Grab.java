class Grab
{
	public static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Sushi") return 200.0;
		else if(itemName == "Ramen") return 180.0;
		else if(itemName == "Udon") return 170.0;
		else if(itemName == "Tempura") return 220.0;
		else if(itemName == "Takoyaki") return 150.0;
		else if(itemName == "Miso Soup") return 90.0;
		else if(itemName == "Onigiri") return 80.0;
		else if(itemName == "Bento Box") return 250.0;
		else if(itemName == "Teriyaki Chicken") return 210.0;
		else if(itemName == "Yakitori") return 190.0;

		else if(itemName == "Pad Thai") return 160.0;
		else if(itemName == "Green Curry") return 180.0;
		else if(itemName == "Red Curry") return 185.0;
		else if(itemName == "Tom Yum Soup") return 170.0;
		else if(itemName == "Papaya Salad") return 140.0;
		else if(itemName == "Thai Fried Rice") return 150.0;
		else if(itemName == "Spring Salad") return 130.0;
		else if(itemName == "Glass Noodles") return 160.0;
		else if(itemName == "Satay Chicken") return 175.0;
		else if(itemName == "Coconut Rice") return 120.0;

		else if(itemName == "Kimchi") return 110.0;
		else if(itemName == "Bibimbap") return 200.0;
		else if(itemName == "Bulgogi") return 230.0;
		else if(itemName == "Tteokbokki") return 150.0;
		else if(itemName == "Japchae") return 180.0;
		else if(itemName == "Korean Fried Chicken") return 240.0;
		else if(itemName == "Seaweed Soup") return 130.0;
		else if(itemName == "Kimchi Rice") return 150.0;
		else if(itemName == "Hot Pot") return 260.0;
		else if(itemName == "Steamed Dumplings") return 170.0;

		else if(itemName == "Dim Sum") return 180.0;
		else if(itemName == "Wonton Soup") return 140.0;
		else if(itemName == "Peking Duck") return 300.0;
		else if(itemName == "Chow Mein") return 160.0;
		else if(itemName == "Sweet Sour Pork") return 200.0;
		else if(itemName == "Kung Pao Chicken") return 210.0;
		else if(itemName == "Mapo Tofu") return 170.0;
		else if(itemName == "Fried Dumplings") return 160.0;
		else if(itemName == "Egg Tart") return 120.0;
		else if(itemName == "Mooncake") return 130.0;

		else if(itemName == "Bubble Tea") return 120.0;
		else if(itemName == "Thai Iced Tea") return 110.0;
		else if(itemName == "Matcha Latte") return 150.0;
		else if(itemName == "Iced Americano") return 100.0;
		else if(itemName == "Milk Tea") return 130.0;
		else if(itemName == "Lychee Juice") return 140.0;
		else if(itemName == "Dragon Fruit Juice") return 150.0;
		else if(itemName == "Passion Fruit Juice") return 140.0;
		else if(itemName == "Mango Sticky Rice") return 180.0;
		else if(itemName == "Coconut Ice Cream") return 160.0;

		else if(itemName == "Rice Paper Rolls") return 140.0;
		else if(itemName == "Pho") return 170.0;
		else if(itemName == "Banh Mi") return 150.0;
		else if(itemName == "Vietnamese Coffee") return 120.0;
		else if(itemName == "Grilled Pork Skewers") return 180.0;
		else if(itemName == "Shrimp Crackers") return 130.0;
		else if(itemName == "Lotus Salad") return 150.0;
		else if(itemName == "Sticky Rice") return 120.0;
		else if(itemName == "Fried Tofu") return 140.0;

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