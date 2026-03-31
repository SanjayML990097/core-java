class Tv {
    
    int tvId;
    String brand;
    String model;
    int price;
    String screenType;
    
    Remote remote;

    public void getTvDetails() {
        System.out.println("The tvId is: " + tvId);
        System.out.println("The brand is: " + brand);
        System.out.println("The model is: " + model);
        System.out.println("The price is: " + price);
        System.out.println("The screenType is: " + screenType);

        remote.getRemoteDetails();
    }
}



