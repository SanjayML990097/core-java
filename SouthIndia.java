class SouthIndia {
    String airportNames[] = new String[9];
    int index;

    public boolean addAirport(String airport) {
        boolean isAirportAdded = false;
        if (airport != null && !airport.isEmpty()) {
            airportNames[index++] = airport;
            isAirportAdded = true;
        } else {
            System.out.println("airport not added");
        }
        return isAirportAdded;
    }

    public boolean updateAirport(String oldAirport, String newAirport) {
        boolean isUpdated = false;

        if (oldAirport != null && newAirport != null) {
            for (int i = 0; i < airportNames.length; i++) {
                if (airportNames[i] != null && airportNames[i].equals(oldAirport)) {
                    airportNames[i] = newAirport;
                    isUpdated = true;
                    break;
                }
            }
        }

        if (!isUpdated) {
            System.out.println("airport not found for update");
        }

        return isUpdated;
    }

    public boolean deleteAirport(String airport) {
        boolean isDeleted = false;

        if (airport != null) {
            for (int i = 0; i < airportNames.length; i++) {
                if (airportNames[i] != null && airportNames[i].equals(airport)) {
                    airportNames[i] = null;
                    isDeleted = true;
                    break;
                }
            }
        }

        if (!isDeleted) {
            System.out.println("airport not found for delete");
        }

        return isDeleted;
    }

    public void getAirports() {
        System.out.println("the south india airports are :");
        for (String airport : airportNames) {
            System.out.println(airport);
        }
    }
}

