class Property {

    int propertyId;
    String propertyName;
    int area;
    double price;
    String status;

    public void getPropertyDetails() {

        System.out.println("The propertyId is: " + propertyId);
        System.out.println("The propertyName is: " + propertyName);
        System.out.println("The area is: " + area);
        System.out.println("The price is: " + price);
        System.out.println("The status is: " + status);
    }
}