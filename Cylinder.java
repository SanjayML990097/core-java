class Cylinder {
    String cylinderNames[] = new String[10];
    int index;

    public boolean addCylinder(String cylinder) {
        boolean isCylinderAdded = false;
        if (cylinder != null && !cylinder.isEmpty()) {
            cylinderNames[index++] = cylinder;
   isCylinderAdded = true;
        } else {
       System.out.println("cylinder not added");
        }
        return isCylinderAdded;
    }

    public boolean searchCylinder(String cylinder) {
        boolean isFound = false;
        if (cylinder != null) {
            for (int i = 0; i < cylinderNames.length; i++) {
          if (cylinderNames[i] != null && cylinderNames[i].equals(cylinder)) {
           System.out.println("cylinder found at index: " + i);
                    isFound = true;
           break;
          }
            }
        }

        if (!isFound) {
            System.out.println("cylinder not found");
        }

        return isFound;
    }

    public boolean updateCylinder(String oldCylinder, String newCylinder) {
        boolean isUpdated = false;
        if (oldCylinder != null && newCylinder != null) {
            for (int i = 0; i < cylinderNames.length; i++) {
      if (cylinderNames[i] != null && cylinderNames[i].equals(oldCylinder)) {
              cylinderNames[i] = newCylinder;
       isUpdated = true;
                    break;
          }
            }
        }

        if (!isUpdated) {
            System.out.println("cylinder not found for update");
        }

        return isUpdated;
    }

    public boolean deleteCylinder(String cylinder) {
        boolean isDeleted = false;
        if (cylinder != null) {
            for (int i = 0; i < cylinderNames.length; i++) {
        if (cylinderNames[i] != null && cylinderNames[i].equals(cylinder)) {
          cylinderNames[i] = null;
                    isDeleted = true;
              break;
          }
            }
        }

        if (!isDeleted) {
            System.out.println("cylinder not found for delete");
        }

        return isDeleted;
    }

    public void getCylinders() {
        System.out.println("the cylinders are :");
        for (String cylinder : cylinderNames) {
            if (cylinder != null) {
        System.out.println(cylinder);
      }
        }
    }
}
