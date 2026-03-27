class Mobile {

    static long contacts[] = {
        9900972761L, 9980220795L, 9972994129L, 9108887053L,
        9108343664L, 9980220759L, 9972994192L, 9900972716L,
        8088686853L, 4387906279L, 9987467878L, 7890535336L,
        7363537837L, 9865746746L, 7864954632L, 9098634286L,
        8954820963L, 8940734526L, 8899765469L, 7788534267L
    };

    public static void main(String args[]) {

        System.out.println("List of Contacts:");
        getContacts();
    }

    public static void getContacts() {
        for(long number : contacts) {
            System.out.println(number);
        }
    }
}