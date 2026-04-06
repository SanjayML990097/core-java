class WeatherStation {
    double temparatureReadings[] = new double[17];
    int index;

    public boolean addTemperature(double temp) {
        boolean isTemperatureAdded = false;
        if (index < temparatureReadings.length) {
            temparatureReadings[index++] = temp;
            isTemperatureAdded = true;
        } else {
            System.out.println("temperature not added");
        }
        return isTemperatureAdded;
    }

    public boolean updateTemperature(double oldTemp, double newTemp) {
        boolean isUpdated = false;

        for (int i = 0; i < temparatureReadings.length; i++) {
            if (temparatureReadings[i] == oldTemp) {
                temparatureReadings[i] = newTemp;
                isUpdated = true;
                break;
            }
        }

        if (!isUpdated) {
            System.out.println("temperature not found for update");
        }

        return isUpdated;
    }

    public boolean deleteTemperature(double temp) {
        boolean isDeleted = false;

        for (int i = 0; i < temparatureReadings.length; i++) {
            if (temparatureReadings[i] == temp) {
                temparatureReadings[i] = 0.0; 
                isDeleted = true;
                break;
            }
        }

        if (!isDeleted) {
            System.out.println("temperature not found for delete");
        }

        return isDeleted;
    }

    public void getTemperatures() {
        System.out.println("the temperature readings are :");
        for (double temp : temparatureReadings) {
            System.out.println(temp);
        }
    }
}

