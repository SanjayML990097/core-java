class LaptopExecutor {

    public static void main(String[] args) {

        Laptop laptops[] = new Laptop[15];

        Laptop l1 = new Laptop();
        l1.laptopId = 901;
        l1.brand = "Dell";
        l1.model = "Inspiron 15";
        l1.price = 55000;
        l1.color = "Black";
        laptops[0] = l1;

        Laptop l2 = new Laptop();
        l2.laptopId = 902;
        l2.brand = "HP";
        l2.model = "Pavilion";
        l2.price = 60000;
        l2.color = "Silver";
        laptops[1] = l2;

        Laptop l3 = new Laptop();
        l3.laptopId = 903;
        l3.brand = "Lenovo";
        l3.model = "ThinkPad";
        l3.price = 75000;
        l3.color = "Black";
        laptops[2] = l3;

        Laptop l4 = new Laptop();
        l4.laptopId = 904;
        l4.brand = "Apple";
        l4.model = "MacBook Air";
        l4.price = 95000;
        l4.color = "Grey";
        laptops[3] = l4;

        Laptop l5 = new Laptop();
        l5.laptopId = 905;
        l5.brand = "Asus";
        l5.model = "ROG Strix";
        l5.price = 85000;
        l5.color = "Black";
        laptops[4] = l5;

        Laptop l6 = new Laptop();
        l6.laptopId = 906;
        l6.brand = "Acer";
        l6.model = "Aspire 7";
        l6.price = 50000;
        l6.color = "Black";
        laptops[5] = l6;

        Laptop l7 = new Laptop();
        l7.laptopId = 907;
        l7.brand = "MSI";
        l7.model = "GF63";
        l7.price = 70000;
        l7.color = "Black";
        laptops[6] = l7;

        Laptop l8 = new Laptop();
        l8.laptopId = 908;
        l8.brand = "Samsung";
        l8.model = "Galaxy Book";
        l8.price = 65000;
        l8.color = "Silver";
        laptops[7] = l8;

        Laptop l9 = new Laptop();
        l9.laptopId = 909;
        l9.brand = "LG";
        l9.model = "Gram";
        l9.price = 90000;
        l9.color = "White";
        laptops[8] = l9;

        Laptop l10 = new Laptop();
        l10.laptopId = 910;
        l10.brand = "Microsoft";
        l10.model = "Surface Laptop";
        l10.price = 100000;
        l10.color = "Grey";
        laptops[9] = l10;

        Laptop l11 = new Laptop();
        l11.laptopId = 911;
        l11.brand = "Dell";
        l11.model = "XPS 13";
        l11.price = 110000;
        l11.color = "Silver";
        laptops[10] = l11;

        Laptop l12 = new Laptop();
        l12.laptopId = 912;
        l12.brand = "HP";
        l12.model = "Envy";
        l12.price = 80000;
        l12.color = "Gold";
        laptops[11] = l12;

        Laptop l13 = new Laptop();
        l13.laptopId = 913;
        l13.brand = "Lenovo";
        l13.model = "IdeaPad";
        l13.price = 45000;
        l13.color = "Blue";
        laptops[12] = l13;

        Laptop l14 = new Laptop();
        l14.laptopId = 914;
        l14.brand = "Asus";
        l14.model = "VivoBook";
        l14.price = 55000;
        l14.color = "Black";
        laptops[13] = l14;

        Laptop l15 = new Laptop();
        l15.laptopId = 915;
        l15.brand = "Acer";
        l15.model = "Nitro 5";
        l15.price = 78000;
        l15.color = "Red";
        laptops[14] = l15;

        for (Laptop laptop : laptops) {
            System.out.println(laptop.laptopId);
            System.out.println(laptop.brand);
            System.out.println(laptop.model);
            System.out.println(laptop.price);
            System.out.println(laptop.color);
            System.out.println("----------------------");
        }
    }
}