class PetShop {
    String accessories[] = new String[16];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAccessoryAdded = false;
        if (accessory != null && !accessory.isEmpty()) {
            accessories[index++] = accessory;
            isAccessoryAdded = true;
        } else {
            System.out.println("accessory not added");
        }
        return isAccessoryAdded;
    }

    public boolean updateAccessory(String oldAccessory, String newAccessory) {
        boolean isUpdated = false;

        if (oldAccessory != null && newAccessory != null) {
            for (int i = 0; i < accessories.length; i++) {
                if (accessories[i] != null && accessories[i].equals(oldAccessory)) {
                    accessories[i] = newAccessory;
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            System.out.println("accessory not found for update");
        }

        return isUpdated;
    }

    public boolean deleteAccessory(String accessory) {
        boolean isDeleted = false;

        if (accessory != null) {
            for (int i = 0; i < accessories.length; i++) {
                if (accessories[i] != null && accessories[i].equals(accessory)) {
                    accessories[i] = null;
                    isDeleted = true;
                    break;
                }
            }
        }

        if (!isDeleted) {
            System.out.println("accessory not found for delete");
        }

        return isDeleted;
    }

    public void getAccessories() {
        System.out.println("the pet accessories are :");
        for (String accessory : accessories) {
            System.out.println(accessory);
        }
    }
}

