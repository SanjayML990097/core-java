class Tree {
    String treeNames[] = new String[15];
    int index;

    public boolean addTree(String name) {
        boolean isAdded = false;
        if (index < treeNames.length) {
            if (name != null && !name.isEmpty()) {
                treeNames[index++] = name;
        isAdded = true;
            } else {
      System.out.println("Invalid tree name");
            }
        } else {
            System.out.println("Array is full");
        }
        return isAdded;
    }

    public void getTrees() {
        System.out.println("Tree List:");
        for (String tree : treeNames) {
            if (tree != null) {
System.out.println(tree);
        }
        }
    }

    public boolean searchTree(String name) {
        boolean isFound = false;
        for (String tree : treeNames) {
          if (tree != null && tree.equals(name)) {
     isFound = true;
              break;
       }
        }
        return isFound;
    }

    public boolean updateTree(String oldName, String newName) {
        boolean isUpdated = false;
        for (int i = 0; i < treeNames.length; i++) {
            if (treeNames[i] != null && treeNames[i].equals(oldName)) {
          treeNames[i] = newName;
        isUpdated = true;
                break;
       }
        }
        return isUpdated;
    }
    public boolean deleteTree(String name) {
   boolean isDeleted = false;
        for (int i = 0; i < treeNames.length; i++) {
     if (treeNames[i] != null && treeNames[i].equals(name)) {
            treeNames[i] = null;
        isDeleted = true;
      break;
     }
      }
        return isDeleted;
    }
}