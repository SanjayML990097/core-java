class RealEstate {
    
    int realEstateId;
    String companyName;
    String location;
    String propertyType;
    double totalValue;
    
    Property property;

    public void getRealEstateDetails() {
        System.out.println("The realEstateId is: " + realEstateId);
        System.out.println("The companyName is: " + companyName);
        System.out.println("The location is: " + location);
        System.out.println("The propertyType is: " + propertyType);
        System.out.println("The totalValue is: " + totalValue);

        property.getPropertyDetails();
        System.out.println("--------------------------------");
    }
}



