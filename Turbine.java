class Turbine {
    String turbineNames[] = new String[15];
    int index;

    public boolean addTurbine(String name) {
        boolean isAdded = false;

        if (index < turbineNames.length) {
            if (name != null && !name.isEmpty()) {
       turbineNames[index++] = name;
                isAdded = true;
       } else {
                System.out.println("Invalid turbine name");
       }
        } else {
    System.out.println("Array is full");
        }
        return isAdded;
    }

    public void getTurbines() {
        System.out.println("Turbine List:");
        for (String turbine : turbineNames) {
      if (turbine != null) {
              System.out.println(turbine);
            }
        }
    }

    public boolean searchTurbine(String name) {
        boolean isFound = false;
        for (String turbine : turbineNames) {
   if (turbine != null && turbine.equals(name)) {
      isFound = true;
                break;
    }
        }

        return isFound;
    }

    public boolean updateTurbine(String oldName, String newName) {
        boolean isUpdated = false;
        for (int i = 0; i < turbineNames.length; i++) {
            if (turbineNames[i] != null && turbineNames[i].equals(oldName)) {
      turbineNames[i] = newName;
                isUpdated = true;
        break;
            }
        }

        return isUpdated;
    }

    public boolean deleteTurbine(String name) {
        boolean isDeleted = false;
        for (int i = 0; i < turbineNames.length; i++) {
   if (turbineNames[i] != null && turbineNames[i].equals(name)) {
                turbineNames[i] = null;
     isDeleted = true;
                break;
       }
        }

        return isDeleted;
    }
}