class Ecommerce {

    Product products[] = new Product[20];
    int index;

    public boolean addProduct(Product product) {
        boolean isProductAdded = false;
        boolean isIdValid = false;
    boolean isNameValid = false;
        boolean isCategoryValid = false;
     boolean isPriceValid = false;
        boolean isQuantityValid = false;
        boolean isBrandValid = false;

    if (product.productId > 0) {
            isIdValid = true;
   } else {
            System.out.println("Product Id is not valid");
        }

       if (product.productName != null && !product.productName.isEmpty()) {
            isNameValid = true;
    } else {
         System.out.println("Product Name is not valid");
        }

    if (product.category != null && !product.category.isEmpty()) {
            isCategoryValid = true;
        } else {
            System.out.println("Category is not valid");
        }
        if (product.price > 0) {
            isPriceValid = true;
     } else {
            System.out.println("Price must be greater than 0");
        }

        if (product.quantity > 0) {
            isQuantityValid = true;
        } else {
            System.out.println("Quantity must be greater than 0");
        }

        if (product.brand != null && !product.brand.isEmpty()) {
            isBrandValid = true;
        } else {
            System.out.println("Brand is not valid");
        }

        if (isIdValid && isNameValid && isCategoryValid
                && isPriceValid && isQuantityValid && isBrandValid) {

            products[index++] = product;
            isProductAdded = true;
        }

        return isProductAdded;
    }

    public void getProducts() {

        for (Product product : products) {

            if (product != null) {

                System.out.println("Product Id: " + product.productId);
                System.out.println("Product Name: " + product.productName);
                System.out.println("Category: " + product.category);
                System.out.println("Price: " + product.price);
                System.out.println("Quantity: " + product.quantity);
                System.out.println("Brand: " + product.brand);

                System.out.println("----------------------");
            }
        }
    }
}