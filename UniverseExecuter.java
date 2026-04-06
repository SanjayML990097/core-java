class UniverseExecuter {
    public static void main(String args[]) {
        Universe u = new Universe();
    boolean added = u.addGalaxy("Milky Way");
        System.out.println(added);
        added = u.addGalaxy("Andromeda");
        System.out.println(added);
        added = u.addGalaxy("Triangulum");
    System.out.println(added);
        added = u.addGalaxy("Whirlpool");
        System.out.println(added);
        added = u.addGalaxy("Sombrero");
        System.out.println(added);
        added = u.addGalaxy("Pinwheel");
        System.out.println(added);
        added = u.addGalaxy("Cartwheel");
 System.out.println(added);
        added = u.addGalaxy("Black Eye");
        System.out.println(added);
        added = u.addGalaxy("Sunflower");
        System.out.println(added);
      added = u.addGalaxy("Centaurus A");
        System.out.println(added);
        added = u.addGalaxy("Messier 87");
        System.out.println(added);

        boolean updated = u.updateGalaxy("Milky Way", "Milky Way Galaxy");
        System.out.println("Updated: " + updated);

        boolean deleted = u.deleteGalaxy("Black Eye");
        System.out.println("Deleted: " + deleted);

        u.getGalaxies();
    }
}