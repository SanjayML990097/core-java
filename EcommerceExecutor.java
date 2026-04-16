class EcommerceExecutor
{
	public static void main(String[] ee)
	{
		String product1Features[] = {"Lightweight","Waterproof"};
		String product2Features[] = {"Fast Charging","Long Battery"};
		String product3Features[] = {"HD Display","Slim Design"};
		String product4Features[] = {"Noise Cancellation","Wireless"};
		String product5Features[] = {"Eco Friendly","Durable"};

		Ecommerce ecommerce = new Ecommerce();

		Product product1 = new Product();
		product1.productId = 1;
		product1.productName = "slipper";
		product1.brand = "Nike";
		product1.price = 2000;
		product1.category = "Footwear";
		product1.features = product1Features;

		System.out.println(ecommerce.createProduct(product1));

		Product product2 = new Product();
		product2.productId = 2;
		product2.productName = "washing machine";
		product2.brand = "Samsung";
		product2.price = 15000;
		product2.category = "Electronics";
		product2.features = product2Features;

		System.out.println(ecommerce.createProduct(product2));

		Product product3 = new Product();
		product3.productId = 3;
		product3.productName = "tab";
		product3.brand = "Dell";
		product3.price = 50000;
		product3.category = "Electronics";
		product3.features = product3Features;

		System.out.println(ecommerce.createProduct(product3));

		Product product4 = new Product();
		product4.productId = 4;
		product4.productName = "Headphones";
		product4.brand = "Sony";
		product4.price = 3000;
		product4.category = "Accessories";
		product4.features = product4Features;

		System.out.println(ecommerce.createProduct(product4));

		Product product5 = new Product();
		product5.productId = 5;
		product5.productName = "Bottle";
		product5.brand = "Milton";
		product5.price = 500;
		product5.category = "Home";
		product5.features = product5Features;

		System.out.println(ecommerce.createProduct(product5));

		ecommerce.getAllProductDetails();
	}
}