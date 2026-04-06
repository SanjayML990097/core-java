class Salon {
    String services[] = new String[7];
    int index;

    public boolean addService(String service) {
        boolean isServiceAdded = false;
        if (service != null && !service.isEmpty()) {
            services[index++] = service;
            isServiceAdded = true;
        } else {
            System.out.println("service not added");
        }
        return isServiceAdded;
    }

    public boolean updateService(String oldService, String newService) {
        boolean isUpdated = false;

        if (oldService != null && newService != null) {
            for (int i = 0; i < services.length; i++) {
                if (services[i] != null && services[i].equals(oldService)) {
                    services[i] = newService;
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            System.out.println("service not found for update");
        }

        return isUpdated;
    }

    public boolean deleteService(String service) {
        boolean isDeleted = false;

        if (service != null) {
            for (int i = 0; i < services.length; i++) {
                if (services[i] != null && services[i].equals(service)) {
                    services[i] = null;
                    isDeleted = true;
                    break;
                }
            }
        }

        if (!isDeleted) {
            System.out.println("service not found for delete");
        }

        return isDeleted;
    }

    public void getServices() {
        System.out.println("the salon services are :");
        for (String service : services) {
            System.out.println(service);
        }
    }
}

