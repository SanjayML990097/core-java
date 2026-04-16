class Ecommerce
{
	Product products[] = new Product[10];
	
	int index;

	public boolean createProduct(Product product)
	{
		products[index] = product;
		index++;
		return true;
	}

	public void getAllProductDetails()
	{
		for(Product product : products)
		{
			System.out.println(product.productId);
			System.out.println(product.productName);
			System.out.println(product.brand);
			System.out.println(product.price);
			System.out.println(product.category);

			for(String feature : product.features)
			{
				System.out.println(feature);
			}
		}
	}
}