class PetShopExecuter {
    public static void main(String args[]) {
        PetShop p = new PetShop();

        boolean added = p.addAccessory("Dog Food");
        System.out.println(added);
        added = p.addAccessory("Cat Food");
        System.out.println(added);
        added = p.addAccessory("Bird Cage");
        System.out.println(added);
        added = p.addAccessory("Fish Tank");
        System.out.println(added);
        added = p.addAccessory("Pet Shampoo");
        System.out.println(added);
        added = p.addAccessory("Leash");
        System.out.println(added);
        added = p.addAccessory("Collar");
        System.out.println(added);
        added = p.addAccessory("Pet Bed");
        System.out.println(added);
        added = p.addAccessory("Food Bowl");
        System.out.println(added);
        added = p.addAccessory("Water Dispenser");
        System.out.println(added);
        added = p.addAccessory("Chew Toy");
        System.out.println(added);
        added = p.addAccessory("Scratching Post");
        System.out.println(added);
        added = p.addAccessory("Litter Box");
        System.out.println(added);
        added = p.addAccessory("Grooming Brush");
        System.out.println(added);
        added = p.addAccessory("Nail Cutter");
        System.out.println(added);
        added = p.addAccessory("Pet Carrier");
        System.out.println(added);

        boolean updated = p.updateAccessory("Dog Food", "Premium Dog Food");
        System.out.println("Updated: " + updated);

        boolean deleted = p.deleteAccessory("Cat Food");
        System.out.println("Deleted: " + deleted);

        p.getAccessories();
    }
}