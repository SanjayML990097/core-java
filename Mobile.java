class Mobile {
    
    int mobileId;
    String brand;
    String model;
    int price;
    String color;
    
    Sim sim;

    public void getMobileDetails() {
        System.out.println("The mobileId is: " + mobileId);
        System.out.println("The brand is: " + brand);
        System.out.println("The model is: " + model);
        System.out.println("The price is: " + price);
        System.out.println("The color is: " + color);

        sim.getSimDetails();
    }
}



