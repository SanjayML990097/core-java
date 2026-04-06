class SuperMarketExecuter {
    public static void main(String args[]) {
        SuperMarket s = new SuperMarket();

        boolean added = s.addProduct("Rice");
        System.out.println(added);
        added = s.addProduct("Wheat");
        System.out.println(added);
        added = s.addProduct("Milk");
        System.out.println(added);
        added = s.addProduct("Sugar");
        System.out.println(added);
        added = s.addProduct("Salt");
        System.out.println(added);
        added = s.addProduct("Oil");
        System.out.println(added);
        added = s.addProduct("Soap");
        System.out.println(added);
        added = s.addProduct("Shampoo");
        System.out.println(added);
      
	  boolean updated = s.updateProduct("Milk", "Organic Milk");
        System.out.println("Updated: " + updated);

       boolean deleted = s.deleteProduct("Soap");
   System.out.println("Deleted: " + deleted);

        s.getProducts();
    }
}