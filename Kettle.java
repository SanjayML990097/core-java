class Kettle {
    String kettleNames[] = new String[15];
    int index;

    public boolean addKettle(String name) {
        boolean isAdded = false;

        if (index < kettleNames.length) {
            if (name != null && !name.isEmpty()) {
      kettleNames[index++] = name;
                isAdded = true;
      } else {
                System.out.println("Invalid kettle name");
        }
        } else {
            System.out.println("Array is full");
        }
     return isAdded;
    }

    public void getKettles() {
        System.out.println("Kettle List:");

        for (String kettle : kettleNames) {
            if (kettle != null) {
      System.out.println(kettle);
       }
        }
    }

    public boolean searchKettle(String name) {
        boolean isFound = false;

     for (String kettle : kettleNames) {
            if (kettle != null && kettle.equals(name)) {
      isFound = true;
                break;
      }
     }
return isFound;
    }

    public boolean updateKettle(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < kettleNames.length; i++) {
     if (kettleNames[i] != null && kettleNames[i].equals(oldName)) {
                kettleNames[i] = newName;
    isUpdated = true;
                break;
            }
        }
 return isUpdated;
    }

    public boolean deleteKettle(String name) {
        boolean isDeleted = false;
        for (int i = 0; i < kettleNames.length; i++) {
     if (kettleNames[i] != null && kettleNames[i].equals(name)) {
                kettleNames[i] = null;
      isDeleted = true;
                break;
            }
        }
  return isDeleted;
    }
}