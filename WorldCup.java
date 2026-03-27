class WorldCup {

    static String groupA[] = {"india", "usa", "pakistan", "netherland", "namibia"};
    static String groupB[] = {"srilanka", "zimbabwe", "ireland", "australia", "oman"};
    static String groupC[] = {"westindies", "england", "scotland", "ireland", "nepal"};
    static String groupD[] = {"southafrica", "newzealand", "afghanistan", "uae", "canada"};

    public static void main(String args[]) {

        System.out.println("The list of teams are:");

        System.out.println("The list of teams in Group A are:");
        getGroupA();

        System.out.println("The list of teams in Group B are:");
        getGroupB();

        System.out.println("The list of teams in Group C are:");
        getGroupC();

        System.out.println("The list of teams in Group D are:");
        getGroupD();
    }

    public static void getGroupA() {
        for(String team : groupA) {
            System.out.println(team);
        }
    }

    public static void getGroupB() {
        for(String team : groupB) {
            System.out.println(team);
        }
    }

    public static void getGroupC() {
        for(String team : groupC) {
            System.out.println(team);
        }
    }

    public static void getGroupD() {
        for(String team : groupD) {
            System.out.println(team);
        }
    }
}