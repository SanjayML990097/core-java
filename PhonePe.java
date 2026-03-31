class PhonePe {
    
    int phonePeId;
    String userName;
    String mobileNumber;
    String upiId;
    double walletBalance;
    
    History history;

    public void getPhonePeDetails() {
        System.out.println("The phonePeId is: " + phonePeId);
        System.out.println("The userName is: " + userName);
        System.out.println("The mobileNumber is: " + mobileNumber);
        System.out.println("The upiId is: " + upiId);
        System.out.println("The walletBalance is: " + walletBalance);

        history.getHistoryDetails();
        System.out.println("--------------------------------");
    }
}



