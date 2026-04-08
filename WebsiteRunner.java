class WebsiteRunner {

    public static void main(String[] args) {

        Website website = new Website();

        UserAccount userOne = new UserAccount();

        userOne.userId = 1;
        userOne.userName = "Darshan";
        userOne.email = "darshan@gmail.com";
        userOne.password = "darshan123";
        userOne.phoneNumber = "9876543210";
        userOne.country = "India";
        userOne.age = 22;
        userOne.isActive = true;

        boolean isUserAdded = website.addUser(userOne);
        System.out.println(isUserAdded);


        UserAccount userTwo = new UserAccount();

        userTwo.userId = 2;
        userTwo.userName = "Ravi";
        userTwo.email = "ravi@gmail.com";
        userTwo.password = "ravi123";
        userTwo.phoneNumber = "9123456789";
        userTwo.country = "India";
        userTwo.age = 25;
        userTwo.isActive = true;

        isUserAdded = website.addUser(userTwo);
        System.out.println(isUserAdded);


        UserAccount userThree = new UserAccount();

        userThree.userId = 3;
        userThree.userName = "Anita";
        userThree.email = "anita@gmail.com";
        userThree.password = "anita123";
        userThree.phoneNumber = "9988776655";
        userThree.country = "India";
        userThree.age = 20;
        userThree.isActive = false;

        isUserAdded = website.addUser(userThree);
        System.out.println(isUserAdded);


        UserAccount userFour = new UserAccount();

        userFour.userId = 4;
        userFour.userName = "Kiran";
        userFour.email = "kiran@gmail.com";
        userFour.password = "kiran123";
        userFour.phoneNumber = "9001122334";
        userFour.country = "India";
        userFour.age = 28;
        userFour.isActive = true;

        isUserAdded = website.addUser(userFour);
        System.out.println(isUserAdded);


        UserAccount userFive = new UserAccount();

        userFive.userId = 5;
        userFive.userName = "Sneha";
        userFive.email = "sneha@gmail.com";
        userFive.password = "sneha123";
        userFive.phoneNumber = "9556677889";
        userFive.country = "India";
        userFive.age = 23;
        userFive.isActive = true;

        isUserAdded = website.addUser(userFive);
        System.out.println(isUserAdded);


        UserAccount userSix = new UserAccount();

        userSix.userId = 6;
        userSix.userName = "Arjun";
        userSix.email = "arjun@gmail.com";
        userSix.password = "arjun123";
        userSix.phoneNumber = "9887766554";
        userSix.country = "India";
        userSix.age = 26;
        userSix.isActive = false;

        isUserAdded = website.addUser(userSix);
        System.out.println(isUserAdded);


        UserAccount userSeven = new UserAccount();

        userSeven.userId = 7;
        userSeven.userName = "Meena";
        userSeven.email = "meena@gmail.com";
        userSeven.password = "meena123";
        userSeven.phoneNumber = "9776655443";
        userSeven.country = "India";
        userSeven.age = 21;
        userSeven.isActive = true;

        isUserAdded = website.addUser(userSeven);
        System.out.println(isUserAdded);


        UserAccount userEight = new UserAccount();

        userEight.userId = 8;
        userEight.userName = "Rahul";
        userEight.email = "rahul@gmail.com";
        userEight.password = "rahul123";
        userEight.phoneNumber = "9665544332";
        userEight.country = "India";
        userEight.age = 24;
        userEight.isActive = true;

        isUserAdded = website.addUser(userEight);
        System.out.println(isUserAdded);


        website.getUsers();

    }
}