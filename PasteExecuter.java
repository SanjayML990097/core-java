class PasteExecuter {
    public static void main(String args[]) {
        Paste p = new Paste();

    boolean added = p.addPaste("Colgate");
        System.out.println(added);
        added = p.addPaste("Pepsodent");
        System.out.println(added);
        added = p.addPaste("Sensodyne");
    System.out.println(added);
        added = p.addPaste("Closeup");
      System.out.println(added);
        added = p.addPaste("Dabur Red");
        System.out.println(added);
       added = p.addPaste("Meswak");
        System.out.println(added);
        added = p.addPaste("Babool");
   System.out.println(added);
        added = p.addPaste("Vicco");
        System.out.println(added);
     added = p.addPaste("Oral-B");
        System.out.println(added);
        added = p.addPaste("Himalaya");
    System.out.println(added);

        boolean found = p.searchPaste("Oral-B");
    System.out.println("Found: " + found);

   boolean updated = p.updatePaste("Colgate", "Colgate Strong Teeth");
        System.out.println("Updated: " + updated);

        boolean deleted = p.deletePaste("Pepsodent");
   System.out.println("Deleted: " + deleted);

        p.getPastes();
    }
}