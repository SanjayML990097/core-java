class Website {

    UserAccount users[] = new UserAccount[8];
    int index;

    public boolean addUser(UserAccount user) {

        boolean isUserAdded = false;

        boolean isIdValid = false;
        boolean isUserNameValid = false;
        boolean isEmailValid = false;
        boolean isPasswordValid = false;
        boolean isPhoneValid = false;
        boolean isCountryValid = false;
        boolean isAgeValid = false;

        if (user.userId > 0) {
            isIdValid = true;
        } else {
            System.out.println("User Id is not valid");
        }

        if (user.userName != null && !user.userName.isEmpty()) {
            isUserNameValid = true;
        } else {
            System.out.println("User Name is not valid");
        }

        if (user.email != null && user.email.contains("@")) {
            isEmailValid = true;
        } else {
            System.out.println("Email is not valid");
        }

        if (user.password != null && user.password.length() >= 6) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 6 characters");
        }

        if (user.phoneNumber != null && user.phoneNumber.length() == 10) {
            isPhoneValid = true;
        } else {
            System.out.println("Phone Number is not valid");
        }

        if (user.country != null && !user.country.isEmpty()) {
            isCountryValid = true;
        } else {
            System.out.println("Country is not valid");
        }

        if (user.age >= 18) {
            isAgeValid = true;
        } else {
            System.out.println("User must be 18+");
        }

        if (isIdValid && isUserNameValid && isEmailValid
                && isPasswordValid && isPhoneValid
                && isCountryValid && isAgeValid) {

            users[index++] = user;
            isUserAdded = true;
        }

        return isUserAdded;
    }

    public void getUsers() {

        for (UserAccount user : users) {

            if (user != null) {

                System.out.println("User Id: " + user.userId);
                System.out.println("User Name: " + user.userName);
                System.out.println("Email: " + user.email);
                System.out.println("Password: " + user.password);
                System.out.println("Phone: " + user.phoneNumber);
                System.out.println("Country: " + user.country);
                System.out.println("Age: " + user.age);
                System.out.println("Active: " + user.isActive);

            }
        }
    }
}