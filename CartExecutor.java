class CartExecutor
{
    public static void main(String args[])
    {
        System.out.println("Cart Details Fetching...");

        Cart c1 = new Cart(); Order o1 = new Order();
        o1.orderId=1; o1.itemName="Laptop"; o1.price=50000; o1.quantity=1; o1.isDelivered=true;
        c1.cartId=1; c1.userName="Sanju"; c1.totalAmount=50000; c1.location="BTM"; c1.order=o1;

        Cart c2 = new Cart(); Order o2 = new Order();
        o2.orderId=2; o2.itemName="Mobile"; o2.price=20000; o2.quantity=1; o2.isDelivered=false;
        c2.cartId=2; c2.userName="Ravi"; c2.totalAmount=20000; c2.location="HSR"; c2.order=o2;

        Cart c3 = new Cart(); Order o3 = new Order();
        o3.orderId=3; o3.itemName="Headphones"; o3.price=2000; o3.quantity=2; o3.isDelivered=true;
        c3.cartId=3; c3.userName="Amit"; c3.totalAmount=4000; c3.location="Indiranagar"; c3.order=o3;

        Cart c4 = new Cart(); Order o4 = new Order();
        o4.orderId=4; o4.itemName="Keyboard"; o4.price=1500; o4.quantity=1; o4.isDelivered=false;
        c4.cartId=4; c4.userName="Kiran"; c4.totalAmount=1500; c4.location="Whitefield"; c4.order=o4;

        Cart c5 = new Cart(); Order o5 = new Order();
        o5.orderId=5; o5.itemName="Mouse"; o5.price=800; o5.quantity=2; o5.isDelivered=true;
        c5.cartId=5; c5.userName="Sneha"; c5.totalAmount=1600; c5.location="Marathahalli"; c5.order=o5;

        Cart c6 = new Cart(); Order o6 = new Order();
        o6.orderId=6; o6.itemName="Monitor"; o6.price=12000; o6.quantity=1; o6.isDelivered=true;
        c6.cartId=6; c6.userName="Divya"; c6.totalAmount=12000; c6.location="Yelahanka"; c6.order=o6;

        Cart c7 = new Cart(); Order o7 = new Order();
        o7.orderId=7; o7.itemName="Printer"; o7.price=8000; o7.quantity=1; o7.isDelivered=false;
        c7.cartId=7; c7.userName="Arjun"; c7.totalAmount=8000; c7.location="Rajajinagar"; c7.order=o7;

        Cart c8 = new Cart(); Order o8 = new Order();
        o8.orderId=8; o8.itemName="Tablet"; o8.price=15000; o8.quantity=1; o8.isDelivered=true;
        c8.cartId=8; c8.userName="Pooja"; c8.totalAmount=15000; c8.location="Malleshwaram"; c8.order=o8;

        Cart c9 = new Cart(); Order o9 = new Order();
        o9.orderId=9; o9.itemName="Camera"; o9.price=30000; o9.quantity=1; o9.isDelivered=false;
        c9.cartId=9; c9.userName="Rahul"; c9.totalAmount=30000; c9.location="Hebbal"; c9.order=o9;

        Cart c10 = new Cart(); Order o10 = new Order();
        o10.orderId=10; o10.itemName="Speaker"; o10.price=5000; o10.quantity=1; o10.isDelivered=true;
        c10.cartId=10; c10.userName="Megha"; c10.totalAmount=5000; c10.location="KR Puram"; c10.order=o10;

        Cart c11 = new Cart(); Order o11 = new Order();
        o11.orderId=11; o11.itemName="Smart Watch"; o11.price=7000; o11.quantity=1; o11.isDelivered=true;
        c11.cartId=11; c11.userName="Vikram"; c11.totalAmount=7000; c11.location="BTM"; c11.order=o11;

        Cart c12 = new Cart(); Order o12 = new Order();
        o12.orderId=12; o12.itemName="Router"; o12.price=2500; o12.quantity=1; o12.isDelivered=false;
        c12.cartId=12; c12.userName="Nisha"; c12.totalAmount=2500; c12.location="HSR"; c12.order=o12;

        Cart c13 = new Cart(); Order o13 = new Order();
        o13.orderId=13; o13.itemName="SSD"; o13.price=6000; o13.quantity=1; o13.isDelivered=true;
        c13.cartId=13; c13.userName="Ramesh"; c13.totalAmount=6000; c13.location="Indiranagar"; c13.order=o13;

        Cart c14 = new Cart(); Order o14 = new Order();
        o14.orderId=14; o14.itemName="Hard Disk"; o14.price=4000; o14.quantity=1; o14.isDelivered=false;
        c14.cartId=14; c14.userName="Kavya"; c14.totalAmount=4000; c14.location="Whitefield"; c14.order=o14;

        Cart c15 = new Cart(); Order o15 = new Order();
        o15.orderId=15; o15.itemName="Power Bank"; o15.price=1500; o15.quantity=2; o15.isDelivered=true;
        c15.cartId=15; c15.userName="Suresh"; c15.totalAmount=3000; c15.location="Marathahalli"; c15.order=o15;

        Cart c16 = new Cart(); Order o16 = new Order();
        o16.orderId=16; o16.itemName="Charger"; o16.price=800; o16.quantity=2; o16.isDelivered=true;
        c16.cartId=16; c16.userName="Anu"; c16.totalAmount=1600; c16.location="Yelahanka"; c16.order=o16;

        Cart c17 = new Cart(); Order o17 = new Order();
        o17.orderId=17; o17.itemName="Cable"; o17.price=300; o17.quantity=3; o17.isDelivered=false;
        c17.cartId=17; c17.userName="Deepak"; c17.totalAmount=900; c17.location="Rajajinagar"; c17.order=o17;

        Cart c18 = new Cart(); Order o18 = new Order();
        o18.orderId=18; o18.itemName="TV"; o18.price=40000; o18.quantity=1; o18.isDelivered=true;
        c18.cartId=18; c18.userName="Priya"; c18.totalAmount=40000; c18.location="Malleshwaram"; c18.order=o18;

        Cart c19 = new Cart(); Order o19 = new Order();
        o19.orderId=19; o19.itemName="AC"; o19.price=35000; o19.quantity=1; o19.isDelivered=false;
        c19.cartId=19; c19.userName="Manoj"; c19.totalAmount=35000; c19.location="Hebbal"; c19.order=o19;

        Cart c20 = new Cart(); Order o20 = new Order();
        o20.orderId=20; o20.itemName="Fridge"; o20.price=30000; o20.quantity=1; o20.isDelivered=true;
        c20.cartId=20; c20.userName="Neha"; c20.totalAmount=30000; c20.location="KR Puram"; c20.order=o20;

        System.out.println(c1.userName+" - "+c1.order.itemName);
        System.out.println(c2.userName+" - "+c2.order.itemName);
        System.out.println(c3.userName+" - "+c3.order.itemName);
        System.out.println(c4.userName+" - "+c4.order.itemName);
        System.out.println(c5.userName+" - "+c5.order.itemName);
        System.out.println(c6.userName+" - "+c6.order.itemName);
        System.out.println(c7.userName+" - "+c7.order.itemName);
        System.out.println(c8.userName+" - "+c8.order.itemName);
        System.out.println(c9.userName+" - "+c9.order.itemName);
        System.out.println(c10.userName+" - "+c10.order.itemName);
        System.out.println(c11.userName+" - "+c11.order.itemName);
        System.out.println(c12.userName+" - "+c12.order.itemName);
        System.out.println(c13.userName+" - "+c13.order.itemName);
        System.out.println(c14.userName+" - "+c14.order.itemName);
        System.out.println(c15.userName+" - "+c15.order.itemName);
        System.out.println(c16.userName+" - "+c16.order.itemName);
        System.out.println(c17.userName+" - "+c17.order.itemName);
        System.out.println(c18.userName+" - "+c18.order.itemName);
        System.out.println(c19.userName+" - "+c19.order.itemName);
        System.out.println(c20.userName+" - "+c20.order.itemName);
    }
}