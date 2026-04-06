class SuperMarket {
    String productNames[] = new String[8];
    int index;

    public boolean addProduct(String product) {
        boolean isProductAdded = false;
        if (product != null && !product.isEmpty()) {
       productNames[index++] = product;
            isProductAdded = true;
        } else {
            System.out.println("product not added");
        }
        return isProductAdded;
    }
    public boolean updateProduct(String oldProduct, String newProduct) {
        boolean isUpdated = false;

        if (oldProduct != null && newProduct != null) {
            for (int i = 0; i < productNames.length; i++) {
                if (productNames[i] != null && productNames[i].equals(oldProduct)) {
                    productNames[i] = newProduct;
       isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            System.out.println("product not found for update");
        }

        return isUpdated;
    }

    public boolean deleteProduct(String product) {
        boolean isDeleted = false;

        if (product != null) {
            for (int i = 0; i < productNames.length; i++) {
                if (productNames[i] != null && productNames[i].equals(product)) {
                    productNames[i] = null;
                    isDeleted = true;
                    break;
                }
            }
        }

        if (!isDeleted) {
            System.out.println("product not found for delete");
        }

        return isDeleted;
    }

    public void getProducts() {
        System.out.println("the supermarket products are :");
        for (String product : productNames) {
            System.out.println(product);
        }
    }
}

