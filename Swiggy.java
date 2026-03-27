class Swiggy {

    public static double search(String foodName) {
        double price = 0.0;

        if (foodName == "burger") 
		{
			price = 99.0;
			return price;
		}else if (foodName == "pizza") { 
			price = 120.0;
			return price;
		}else if (foodName == "pasta") {
			price = 150.0;
			return price;
		}else if (foodName == "sandwich") {
				price = 80.0;
				return price; 
				}
        else if (foodName == "fries") {
			price = 70.0;
			return price; 
			}
        else if (foodName == "noodles") 
		{ 
			price = 110.0;
			return price; 
		}
        else if (foodName == "friedRice") {
			price = 130.0; 
			return price; 
			}
        else if (foodName == "biryani") { 
		price = 180.0;
		return price; 
		}
        else if (foodName == "shawarma") { 
		price = 140.0;
		return price;
		}
        else if (foodName == "momos") {
				price = 90.0;
				return price; 
				}
        else if (foodName == "paneerTikka") {
			price = 170.0;
			return price; 
			}
        else if (foodName == "vegRoll") {
			price = 85.0;
			return price; 
			}
        else if (foodName == "chickenRoll") {
			price = 120.0;
			return price; 
			}
        else if (foodName == "dosa") { 
			price = 60.0; 
			return price; 
			}
        else if (foodName == "masalaDosa") { price = 80.0; return price; }
        else if (foodName == "idli") { price = 40.0; return price; }
        else if (foodName == "vada") { price = 35.0; return price; }
        else if (foodName == "poha") { price = 45.0; return price; }
        else if (foodName == "upma") { price = 50.0; return price; }
        else if (foodName == "pavBhaji") { price = 100.0; return price; }
        else if (foodName == "choleBhature") { price = 120.0; return price; }
        else if (foodName == "rajmaRice") { price = 130.0; return price; }
        else if (foodName == "dalRice") { price = 110.0; return price; }
        else if (foodName == "vegThali") { price = 200.0; return price; }
        else if (foodName == "nonVegThali") { price = 250.0; return price; }
        else if (foodName == "chickenCurry") { price = 220.0; return price; }
        else if (foodName == "butterChicken") { price = 260.0; return price; }
        else if (foodName == "tandooriChicken") { price = 280.0; return price; }
        else if (foodName == "fishFry") { price = 240.0; return price; }
        else if (foodName == "eggCurry") { price = 150.0; return price; }
        else if (foodName == "omelette") { price = 50.0; return price; }
        else if (foodName == "boiledEgg") { price = 30.0; return price; }
        else if (foodName == "chickenBurger") { price = 140.0; return price; }
        else if (foodName == "vegBurger") { price = 100.0; return price; }
        else if (foodName == "doubleBurger") { price = 180.0; return price; }
        else if (foodName == "cheesePizza") { price = 220.0; return price; }
        else if (foodName == "vegPizza") { price = 200.0; return price; }
        else if (foodName == "chickenPizza") { price = 240.0; return price; }
        else if (foodName == "coldCoffee") { price = 90.0; return price; }
        else if (foodName == "milkshake") { price = 110.0; return price; }
        else if (foodName == "tea") { price = 20.0; return price; }
        else if (foodName == "coffee") { price = 30.0; return price; }
        else if (foodName == "greenTea") { price = 40.0; return price; }
        else if (foodName == "juice") { price = 70.0; return price; }
        else if (foodName == "orangeJuice") { price = 80.0; return price; }
        else if (foodName == "appleJuice") { price = 90.0; return price; }
        else if (foodName == "iceCream") { price = 60.0; return price; }
        else if (foodName == "brownie") { price = 120.0; return price; }
        else if (foodName == "cake") { price = 150.0; return price; }
        else if (foodName == "donut") { price = 70.0; return price; }

        else {
            System.out.println("Food not found");
        }

        return 0.0;
    }

    public static double search(String foodName, double quantity) {
        double price = search(foodName);
        return price * quantity;
    }
}