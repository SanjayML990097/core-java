class WorldCup {

    public static void main(String args[]) {

        String a1="india";
        String a2="usa";
        String a3="pakistan";
        String a4="netherland";
        String a5="namibia";

        String groupA[]={a1,a2,a3,a4,a5};


        String b1="srilanka";
        String b2="zimbabwe";
        String b3="ireland";
        String b4="australia";
        String b5="oman";

        String groupB[]={b1,b2,b3,b4,b5};


        String c1="westindies";
        String c2="england";
        String c3="scotland";
        String c4="ireland";
        String c5="nepal";

        String groupC[]={c1,c2,c3,c4,c5};


        String d1="southafrica";
        String d2="newzealand";
        String d3="afghanistan";
        String d4="uae";
        String d5="canada";

        String groupD[]={d1,d2,d3,d4,d5};



        System.out.println("Group A:");
        for(String team : groupA){
            System.out.println(team);
        }

        System.out.println("\nGroup B:");
        for(String team : groupB){
            System.out.println(team);
        }

        System.out.println("\nGroup C:");
        for(String team : groupC){
            System.out.println(team);
        }

        System.out.println("\nGroup D:");
        for(String team : groupD){
            System.out.println(team);
        }

    }
}
