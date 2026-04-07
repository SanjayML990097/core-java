class Singer {
    String singerNames[] = new String[15];
    int index;

    public boolean addSinger(String name) {
        boolean isAdded = false;

        if (index < singerNames.length) {
            if (name != null && !name.isEmpty()) {
            singerNames[index++] = name;
        isAdded = true;
            } else {
         System.out.println("Invalid singer name");
            }
        } else {
      System.out.println("Array is full");
        }

        return isAdded;
    }

    public void getSingers() {
        System.out.println("Singer List:");

        for (String singer : singerNames) {
    if (singer != null) {
                System.out.println(singer);
     }
        }
    }

    public boolean searchSinger(String name) {
        boolean isFound = false;

        for (String singer : singerNames) {
            if (singer != null && singer.equals(name)) {
       isFound = true;
                break;
      }
        }

        return isFound;
    }

    public boolean updateSinger(String oldName, String newName) {
        boolean isUpdated = false;

        for (int i = 0; i < singerNames.length; i++) {
            if (singerNames[i] != null && singerNames[i].equals(oldName)) {
                singerNames[i] = newName;
    isUpdated = true;
                break;
        }
        }

        return isUpdated;
    }

    public boolean deleteSinger(String name) {
        boolean isDeleted = false;

        for (int i = 0; i < singerNames.length; i++) {
            if (singerNames[i] != null && singerNames[i].equals(name)) {
                singerNames[i] = null;
      isDeleted = true;
                break;
     }
        }

        return isDeleted;
    }
}