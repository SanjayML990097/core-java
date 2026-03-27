class Cafe {
    public static void main(String args[]) {
		        String cafeName = "Sanjucafe";
				System.out.println("cafe name is " + cafeName);
				System.out.println("List of teas are:");
		
		
       String ginger = "ginger tea";
        String black = "black tea";
        String aurat = "aurat tea";
        String green = "green tea";
        String masala = "masala tea";
        String teaNames[] = { ginger, black, aurat, green, masala };
		
		for (String teaName : teaNames) {
            System.out.println(teaName);
        }

      
        String blackCoffee = "black coffee";
        String greenCoffee = "green coffee";
        String strongCoffee = "strong coffee";
        String cappuccino = "cappuccino coffee";
        String espresso = "espresso coffee";
        String americano = "americano coffee";
        String latte = "latte coffee";
        String mocha = "mocha coffee";
        String cortado = "cortado coffee";

        String coffeeNames[] = { blackCoffee, greenCoffee, strongCoffee,
                cappuccino, espresso, americano,
                latte, mocha, cortado };
				
		for (String coffeeName : coffeeNames) {
            System.out.println(coffeeName);
        }
		

        String maska = "maska bun";
        String bun = "bun";
        String chocolate = "chocolate bun";
        String rusk = "rusk";
        String biscuits = "biscuits";
        String samosa = "samosa";
        String burger = "burger";

        String snacks[] = { maska, bun, chocolate,
                rusk, biscuits, samosa, burger };


		
		for (String snck : snacks) {
            System.out.println(snck);
        }
    }
}
