class Steel {
    String steelNames[] = new String[15];
    int index;

    public boolean addSteel(String name) {
        boolean isAdded = false;

        if (index < steelNames.length) {
     if (name != null && !name.isEmpty()) {
                steelNames[index++] = name;
     isAdded = true;
            } else {
            System.out.println("Invalid steel name");
       }
        } else {
            System.out.println("Array is full");
        }
        return isAdded;
    }

    public void getSteels() {
        System.out.println("Steel List:");
        for (String steel : steelNames) {
            if (steel != null) {
         System.out.println(steel);
         }
        }
    }

    public boolean searchSteel(String name) {
        boolean isFound = false;
        for (String steel : steelNames) {
            if (steel != null && steel.equals(name)) {
      isFound = true;
                break;
        }
        }

        return isFound;
    }

    public boolean updateSteel(String oldName, String newName) {
        boolean isUpdated = false;
        for (int i = 0; i < steelNames.length; i++) {
      if (steelNames[i] != null && steelNames[i].equals(oldName)) {
                steelNames[i] = newName;
       isUpdated = true;
                break;
       }
        }

        return isUpdated;
    }

    public boolean deleteSteel(String name) {
        boolean isDeleted = false;
        for (int i = 0; i < steelNames.length; i++) {
       if (steelNames[i] != null && steelNames[i].equals(name)) {
                steelNames[i] = null;
      isDeleted = true;
                break;
       }
        }
        return isDeleted;
    }
}