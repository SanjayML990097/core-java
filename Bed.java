class Bed {
    String bedNames[] = new String[15];
    int index;

    public boolean addBed(String name) {
        boolean isAdded = false;

        if (index < bedNames.length) {
     if (name != null && !name.isEmpty()) {
                bedNames[index++] = name;
        isAdded = true;
     } else {
         System.out.println("Invalid bed name");
            }
        } else {
      System.out.println("Array is full");
        }
    return isAdded;
    }

    public void getBeds() {
        System.out.println("Bed List:");
        for (String bed : bedNames) {
      if (bed != null) {
         System.out.println(bed);
      }
        }
    }

    public boolean searchBed(String name) {
        boolean isFound = false;
        for (String bed : bedNames) {
            if (bed != null && bed.equals(name)) {
       isFound = true;
         break;
       }
        }
     return isFound;
    }

    public boolean updateBed(String oldName, String newName) {
        boolean isUpdated = false;
        for (int i = 0; i < bedNames.length; i++) {
            if (bedNames[i] != null && bedNames[i].equals(oldName)) {
    bedNames[i] = newName;
         isUpdated = true;
            break;
     }
        }
        return isUpdated;
    }

    public boolean deleteBed(String name) {
        boolean isDeleted = false;
        for (int i = 0; i < bedNames.length; i++) {
            if (bedNames[i] != null && bedNames[i].equals(name)) {
     bedNames[i] = null;
                isDeleted = true;
      break;
            }
   }
        return isDeleted;
    }
}