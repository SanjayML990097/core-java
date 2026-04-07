class Petroleum {
    String petroleumNames[] = new String[15];
    int index;

    public boolean addPetroleum(String name) {
        boolean isAdded = false;

        if (index < petroleumNames.length) {
            if (name != null && !name.isEmpty()) {
                petroleumNames[index++] = name;
    isAdded = true;
         } else {
      System.out.println("Invalid petroleum name");
            }
        } else {
     System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getPetroleums() {
        System.out.println("Petroleum List:");
        for (String petroleum : petroleumNames) {
      if (petroleum != null) {
       System.out.println(petroleum);
       }
        }
    }

    public boolean searchPetroleum(String name) {
        boolean isFound = false;
        for (String petroleum : petroleumNames) {
            if (petroleum != null && petroleum.equals(name)) {
        isFound = true;
                break;
       }
        }

        return isFound;
    }

    public boolean updatePetroleum(String oldName, String newName) {
        boolean isUpdated = false;
        for (int i = 0; i < petroleumNames.length; i++) {
        if (petroleumNames[i] != null && petroleumNames[i].equals(oldName)) {
                petroleumNames[i] = newName;
      isUpdated = true;
                break;
      }
        }

        return isUpdated;
    }

    public boolean deletePetroleum(String name) {
        boolean isDeleted = false;
        for (int i = 0; i < petroleumNames.length; i++) {
      if (petroleumNames[i] != null && petroleumNames[i].equals(name)) {
                petroleumNames[i] = null;
      isDeleted = true;
                break;
     }
        }

        return isDeleted;
    }
}