class TreeExecuter {
    public static void main(String args[]) {
        Tree t = new Tree();

     boolean added = t.addTree("Neem");
        System.out.println(added);
  added = t.addTree("Mango");
        System.out.println(added);
        added = t.addTree("Banyan");
        System.out.println(added);
  added = t.addTree("Peepal");
        System.out.println(added);
        added = t.addTree("Coconut");
        System.out.println(added);
        added = t.addTree("Teak");
        System.out.println(added);
   added = t.addTree("Eucalyptus");
        System.out.println(added);
        added = t.addTree("Pine");
        System.out.println(added);
  added = t.addTree("Oak");
        System.out.println(added);
        added = t.addTree("Maple");
  System.out.println(added);

        boolean found = t.searchTree("Mango");
        System.out.println("Found: " + found);

   boolean updated = t.updateTree("Neem", "Neem Tree");
        System.out.println("Updated: " + updated);

        boolean deleted = t.deleteTree("Pine");
   System.out.println("Deleted: " + deleted);

        t.getTrees();
    }
}