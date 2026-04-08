class EcommerceRunner {

    public static void main(String[] args) {

        Ecommerce ecommerce = new Ecommerce();

        Product productOne = new Product();
        productOne.productId = 1;
        productOne.productName = "Laptop";
        productOne.category = "Electronics";
        productOne.price = 55000;
        productOne.quantity = 5;
        productOne.brand = "Dell";

        boolean isProductAdded = ecommerce.addProduct(productOne);
        System.out.println(isProductAdded);


        Product productTwo = new Product();
        productTwo.productId = 2;
        productTwo.productName = "Mobile";
        productTwo.category = "Electronics";
        productTwo.price = 20000;
        productTwo.quantity = 10;
        productTwo.brand = "Samsung";

        isProductAdded = ecommerce.addProduct(productTwo);
        System.out.println(isProductAdded);


        Product productThree = new Product();
        productThree.productId = 3;
        productThree.productName = "Headphones";
        productThree.category = "Accessories";
        productThree.price = 1500;
        productThree.quantity = 20;
        productThree.brand = "Boat";

        isProductAdded = ecommerce.addProduct(productThree);
        System.out.println(isProductAdded);


        Product productFour = new Product();
        productFour.productId = 4;
        productFour.productName = "Keyboard";
        productFour.category = "Accessories";
        productFour.price = 800;
        productFour.quantity = 15;
        productFour.brand = "Logitech";

        isProductAdded = ecommerce.addProduct(productFour);
        System.out.println(isProductAdded);


        Product productFive = new Product();
        productFive.productId = 5;
        productFive.productName = "Mouse";
        productFive.category = "Accessories";
        productFive.price = 500;
        productFive.quantity = 25;
        productFive.brand = "HP";

        isProductAdded = ecommerce.addProduct(productFive);
        System.out.println(isProductAdded);


        Product productSix = new Product();
        productSix.productId = 6;
        productSix.productName = "Monitor";
        productSix.category = "Electronics";
        productSix.price = 12000;
        productSix.quantity = 7;
        productSix.brand = "LG";

        isProductAdded = ecommerce.addProduct(productSix);
        System.out.println(isProductAdded);


        Product productSeven = new Product();
        productSeven.productId = 7;
        productSeven.productName = "Tablet";
        productSeven.category = "Electronics";
        productSeven.price = 18000;
        productSeven.quantity = 6;
        productSeven.brand = "Lenovo";

        isProductAdded = ecommerce.addProduct(productSeven);
        System.out.println(isProductAdded);


        Product productEight = new Product();
        productEight.productId = 8;
        productEight.productName = "Printer";
        productEight.category = "Electronics";
        productEight.price = 9000;
        productEight.quantity = 4;
        productEight.brand = "Canon";

        isProductAdded = ecommerce.addProduct(productEight);
        System.out.println(isProductAdded);


        Product productNine = new Product();
        productNine.productId = 9;
        productNine.productName = "Speaker";
        productNine.category = "Audio";
        productNine.price = 3000;
        productNine.quantity = 12;
        productNine.brand = "Sony";

        isProductAdded = ecommerce.addProduct(productNine);
        System.out.println(isProductAdded);


        Product productTen = new Product();
        productTen.productId = 10;
        productTen.productName = "Smart Watch";
        productTen.category = "Wearable";
        productTen.price = 7000;
        productTen.quantity = 8;
        productTen.brand = "Noise";

        isProductAdded = ecommerce.addProduct(productTen);
        System.out.println(isProductAdded);


        Product productEleven = new Product();
        productEleven.productId = 11;
        productEleven.productName = "Camera";
        productEleven.category = "Electronics";
        productEleven.price = 25000;
        productEleven.quantity = 3;
        productEleven.brand = "Nikon";

        isProductAdded = ecommerce.addProduct(productEleven);
        System.out.println(isProductAdded);


        Product productTwelve = new Product();
        productTwelve.productId = 12;
        productTwelve.productName = "Power Bank";
        productTwelve.category = "Accessories";
        productTwelve.price = 1200;
        productTwelve.quantity = 18;
        productTwelve.brand = "Mi";

        isProductAdded = ecommerce.addProduct(productTwelve);
        System.out.println(isProductAdded);


        Product productThirteen = new Product();
        productThirteen.productId = 13;
        productThirteen.productName = "Router";
        productThirteen.category = "Networking";
        productThirteen.price = 2200;
        productThirteen.quantity = 9;
        productThirteen.brand = "TP-Link";

        isProductAdded = ecommerce.addProduct(productThirteen);
        System.out.println(isProductAdded);


        Product productFourteen = new Product();
        productFourteen.productId = 14;
        productFourteen.productName = "SSD";
        productFourteen.category = "Storage";
        productFourteen.price = 4500;
        productFourteen.quantity = 11;
        productFourteen.brand = "Samsung";

        isProductAdded = ecommerce.addProduct(productFourteen);
        System.out.println(isProductAdded);


        Product productFifteen = new Product();
        productFifteen.productId = 15;
        productFifteen.productName = "Hard Disk";
        productFifteen.category = "Storage";
        productFifteen.price = 5200;
        productFifteen.quantity = 10;
        productFifteen.brand = "Seagate";

        isProductAdded = ecommerce.addProduct(productFifteen);
        System.out.println(isProductAdded);


        ecommerce.getProducts();

    }
}