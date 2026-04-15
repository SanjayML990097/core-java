class ProductRunner {

    public static void main(String[] args) {

        Product products[] = new Product[15];

        Product p1 = new Product();
        p1.productId = 2001;
        p1.name = "Laptop";
        p1.price = 60000;
        p1.category = "Electronics";
        p1.brand = "Dell";
        products[0] = p1;

        Product p2 = new Product();
        p2.productId = 2002;
        p2.name = "Mobile";
        p2.price = 30000;
        p2.category = "Electronics";
        p2.brand = "Samsung";
        products[1] = p2;

        Product p3 = new Product();
        p3.productId = 2003;
        p3.name = "Headphones";
        p3.price = 2000;
        p3.category = "Accessories";
        p3.brand = "Sony";
        products[2] = p3;

        Product p4 = new Product();
        p4.productId = 2004;
        p4.name = "Watch";
        p4.price = 5000;
        p4.category = "Accessories";
        p4.brand = "Titan";
        products[3] = p4;

        Product p5 = new Product();
        p5.productId = 2005;
        p5.name = "Tablet";
        p5.price = 25000;
        p5.category = "Electronics";
        p5.brand = "Apple";
        products[4] = p5;

        Product p6 = new Product();
        p6.productId = 2006;
        p6.name = "Camera";
        p6.price = 45000;
        p6.category = "Electronics";
        p6.brand = "Canon";
        products[5] = p6;

        Product p7 = new Product();
        p7.productId = 2007;
        p7.name = "Keyboard";
        p7.price = 1500;
        p7.category = "Accessories";
        p7.brand = "Logitech";
        products[6] = p7;

        Product p8 = new Product();
        p8.productId = 2008;
        p8.name = "Mouse";
        p8.price = 800;
        p8.category = "Accessories";
        p8.brand = "HP";
        products[7] = p8;

        Product p9 = new Product();
        p9.productId = 2009;
        p9.name = "Monitor";
        p9.price = 12000;
        p9.category = "Electronics";
        p9.brand = "LG";
        products[8] = p9;

        Product p10 = new Product();
        p10.productId = 2010;
        p10.name = "Printer";
        p10.price = 10000;
        p10.category = "Electronics";
        p10.brand = "Epson";
        products[9] = p10;

        Product p11 = new Product();
        p11.productId = 2011;
        p11.name = "Speaker";
        p11.price = 3000;
        p11.category = "Audio";
        p11.brand = "JBL";
        products[10] = p11;

        Product p12 = new Product();
        p12.productId = 2012;
        p12.name = "Power Bank";
        p12.price = 2000;
        p12.category = "Accessories";
        p12.brand = "Mi";
        products[11] = p12;

        Product p13 = new Product();
        p13.productId = 2013;
        p13.name = "Smart TV";
        p13.price = 50000;
        p13.category = "Electronics";
        p13.brand = "Sony";
        products[12] = p13;

        Product p14 = new Product();
        p14.productId = 2014;
        p14.name = "Router";
        p14.price = 2500;
        p14.category = "Networking";
        p14.brand = "TP-Link";
        products[13] = p14;

        Product p15 = new Product();
        p15.productId = 2015;
        p15.name = "External Hard Disk";
        p15.price = 6000;
        p15.category = "Storage";
        p15.brand = "Seagate";
        products[14] = p15;

        for (Product p : products) {
            System.out.println(p.productId);
            System.out.println(p.name);
            System.out.println(p.price);
            System.out.println(p.category);
            System.out.println(p.brand);
            System.out.println("----------------------");
        }
    }
}