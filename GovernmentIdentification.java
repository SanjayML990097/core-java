class GovernmentIdentification {

    int idNumber;
    String idType;
    String issuedBy;
    String issueDate;
    String expiryDate;

    public void getGovernmentIdDetails() {

        System.out.println("The idNumber is: " + idNumber);
        System.out.println("The idType is: " + idType);
        System.out.println("The issuedBy is: " + issuedBy);
        System.out.println("The issueDate is: " + issueDate);
        System.out.println("The expiryDate is: " + expiryDate);

    }
}