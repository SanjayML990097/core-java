class Person {
    
    int personId;
    String name;
    int age;
    String gender;
    String address;
    
    GovernmentIdentification governmentIdentification;

    public void getPersonDetails() {
        System.out.println("The personId is: " + personId);
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The gender is: " + gender);
        System.out.println("The address is: " + address);

        governmentIdentification.getGovernmentIdDetails();
    }
}



