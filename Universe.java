class Universe {
    String galaxies[] = new String[11];
    int index;

    public boolean addGalaxy(String galaxy) {
        boolean isGalaxyAdded = false;
  if (galaxy != null && !galaxy.isEmpty()) {
            galaxies[index++] = galaxy;
       isGalaxyAdded = true;
        } else {
      System.out.println("galaxy not added");
        }
    return isGalaxyAdded;
    }

    public boolean updateGalaxy(String oldGalaxy, String newGalaxy) {
        boolean isUpdated = false;

   if (oldGalaxy != null && newGalaxy != null) {
    for (int i = 0; i < galaxies.length; i++) {
  if (galaxies[i] != null && galaxies[i].equals(oldGalaxy)) {
                    galaxies[i] = newGalaxy;
        isUpdated = true;
                    break;
                }
            }
        }

   if (!isUpdated) {
          System.out.println("galaxy not found for update");
        }

        return isUpdated;
    }

    public boolean deleteGalaxy(String galaxy) {
        boolean isDeleted = false;

        if (galaxy != null) {
            for (int i = 0; i < galaxies.length; i++) {
                if (galaxies[i] != null && galaxies[i].equals(galaxy)) {
           galaxies[i] = null;
                    isDeleted = true;
           break;
                }
            }
        }

        if (!isDeleted) {
            System.out.println("galaxy not found for delete");
        }

        return isDeleted;
    }

    public void getGalaxies() {
        System.out.println("the galaxies in universe are :");
        for (String galaxy : galaxies) {
            System.out.println(galaxy);
        }
    }
}

