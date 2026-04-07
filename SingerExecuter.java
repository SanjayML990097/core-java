class SingerExecuter {
    public static void main(String args[]) {
        Singer s = new Singer();

        boolean added = s.addSinger("Arijit Singh");
     System.out.println(added);
        added = s.addSinger("Shreya Ghoshal");
   System.out.println(added);
        added = s.addSinger("Sonu Nigam");
   System.out.println(added);
   added = s.addSinger("Neha Kakkar");
        System.out.println(added);
        added = s.addSinger("Atif Aslam");
        System.out.println(added);
        added = s.addSinger("KK");
        System.out.println(added);
        added = s.addSinger("Lata Mangeshkar");
        System.out.println(added);
   added = s.addSinger("A.R. Rahman");
        System.out.println(added);
        added = s.addSinger("Jubin Nautiyal");
     System.out.println(added);
        added = s.addSinger("Sunidhi Chauhan");
        System.out.println(added);

   boolean found = s.searchSinger("Arijit Singh");
        System.out.println("Found: " + found);

        boolean updated = s.updateSinger("Neha Kakkar", "Neha Kakkar Updated");
        System.out.println("Updated: " + updated);

  boolean deleted = s.deleteSinger("KK");
        System.out.println("Deleted: " + deleted);

        s.getSingers();
    }
}