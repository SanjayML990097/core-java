class Paste {
    String pasteNames[] = new String[15];
    int index;

    public boolean addPaste(String name) {
        boolean isAdded = false;

        if (index < pasteNames.length) {
            if (name != null && !name.isEmpty()) {
                pasteNames[index++] = name;
       isAdded = true;
       } else {
           System.out.println("Invalid paste name");
      }
  } else {
            System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getPastes() {
        System.out.println("Paste List:");
        for (String paste : pasteNames) {
      if (paste != null) {
             System.out.println(paste);
        }
        }
    }

    public boolean searchPaste(String name) {
        boolean isFound = false;
        for (String paste : pasteNames) {
            if (paste != null && paste.equals(name)) {
         isFound = true;
                break;
         }
        }

        return isFound;
    }

    public boolean updatePaste(String oldName, String newName) {
        boolean isUpdated = false;
        for (int i = 0; i < pasteNames.length; i++) {
     if (pasteNames[i] != null && pasteNames[i].equals(oldName)) {
                pasteNames[i] = newName;
     isUpdated = true;
                break;
       }
        }

        return isUpdated;
    }

    public boolean deletePaste(String name) {
        boolean isDeleted = false;
        for (int i = 0; i < pasteNames.length; i++) {
            if (pasteNames[i] != null && pasteNames[i].equals(name)) {
                pasteNames[i] = null;
        isDeleted = true;
                break;
        }
        }

        return isDeleted;
    }
}