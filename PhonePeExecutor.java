class PhonePeExecutor {

    public static void main(String args[]) {

        // 1
        PhonePe ref1 = new PhonePe();
        ref1.phonePeId = 1;
        ref1.userName = "User1";
        ref1.mobileNumber = "9000000001";
        ref1.upiId = "user1@upi";
        ref1.walletBalance = 1000;

        History h1 = new History();
        h1.transactionId = 101;
        h1.transactionType = "Recharge";
        h1.amount = 100;
        h1.date = "01-01-2026";
        h1.status = "Success";

        ref1.history = h1;
        ref1.getPhonePeDetails();

        // 2
        PhonePe ref2 = new PhonePe();
        ref2.phonePeId = 2;
        ref2.userName = "User2";
        ref2.mobileNumber = "9000000002";
        ref2.upiId = "user2@upi";
        ref2.walletBalance = 2000;

        History h2 = new History();
        h2.transactionId = 102;
        h2.transactionType = "Bill";
        h2.amount = 200;
        h2.date = "02-01-2026";
        h2.status = "Success";

        ref2.history = h2;
        ref2.getPhonePeDetails();

        // 3
        PhonePe ref3 = new PhonePe();
        ref3.phonePeId = 3;
        ref3.userName = "User3";
        ref3.mobileNumber = "9000000003";
        ref3.upiId = "user3@upi";
        ref3.walletBalance = 3000;

        History h3 = new History();
        h3.transactionId = 103;
        h3.transactionType = "Transfer";
        h3.amount = 300;
        h3.date = "03-01-2026";
        h3.status = "Failed";

        ref3.history = h3;
        ref3.getPhonePeDetails();

        // 4 to 29 (same pattern with different values)

        PhonePe ref4 = new PhonePe();
        ref4.phonePeId = 4;
        ref4.userName = "User4";
        ref4.mobileNumber = "9000000004";
        ref4.upiId = "user4@upi";
        ref4.walletBalance = 4000;
        History h4 = new History();
        h4.transactionId = 104;
        h4.transactionType = "Recharge";
        h4.amount = 400;
        h4.date = "04-01-2026";
        h4.status = "Success";
        ref4.history = h4;
        ref4.getPhonePeDetails();

        PhonePe ref5 = new PhonePe();
        ref5.phonePeId = 5;
        ref5.userName = "User5";
        ref5.mobileNumber = "9000000005";
        ref5.upiId = "user5@upi";
        ref5.walletBalance = 5000;
        History h5 = new History();
        h5.transactionId = 105;
        h5.transactionType = "Bill";
        h5.amount = 500;
        h5.date = "05-01-2026";
        h5.status = "Success";
        ref5.history = h5;
        ref5.getPhonePeDetails();

        // Continue similarly...

        PhonePe ref29 = new PhonePe();
        ref29.phonePeId = 29;
        ref29.userName = "User29";
        ref29.mobileNumber = "9000000029";
        ref29.upiId = "user29@upi";
        ref29.walletBalance = 29000;
        History h29 = new History();
        h29.transactionId = 129;
        h29.transactionType = "Transfer";
        h29.amount = 2900;
        h29.date = "29-01-2026";
        h29.status = "Success";
        ref29.history = h29;
        ref29.getPhonePeDetails();
    }
}