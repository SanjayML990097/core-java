class ShowRoom {
    String managerNames[] = new String[8];
    int index;

    public boolean addManager(String manager) {
        boolean isManagerAdded = false;
        if (manager != null && !manager.isEmpty()) {
            managerNames[index++] = manager;
            isManagerAdded = true;
        } else {
            System.out.println("manager not added");
        }
        return isManagerAdded;
    }

    public boolean updateManager(String oldManager, String newManager) {
        boolean isUpdated = false;

        if (oldManager != null && newManager != null) {
            for (int i = 0; i < managerNames.length; i++) {
                if (managerNames[i] != null && managerNames[i].equals(oldManager)) {
                    managerNames[i] = newManager;
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            System.out.println("manager not found for update");
        }

        return isUpdated;
    }

    public boolean deleteManager(String manager) {
        boolean isDeleted = false;

        if (manager != null) {
            for (int i = 0; i < managerNames.length; i++) {
                if (managerNames[i] != null && managerNames[i].equals(manager)) {
                    managerNames[i] = null;
                    isDeleted = true;
                    break;
                }
            }
        }

        if (!isDeleted) {
            System.out.println("manager not found for delete");
        }

        return isDeleted;
    }

    public void getManagers() {
        System.out.println("the showroom managers are :");
        for (String manager : managerNames) {
            System.out.println(manager);
        }
    }
}

