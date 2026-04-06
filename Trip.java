class Trip {
    String places[] = new String[13];
    int index;

    public boolean addPlace(String place) {
        boolean isPlaceAdded = false;
        if (place != null && !place.isEmpty()) {
            places[index++] = place;
            isPlaceAdded = true;
        } else {
            System.out.println("place not added");
        }
        return isPlaceAdded;
    }

    public boolean updatePlace(String oldPlace, String newPlace) {
        boolean isUpdated = false;

        if (oldPlace != null && newPlace != null) {
            for (int i = 0; i < places.length; i++) {
                if (places[i] != null && places[i].equals(oldPlace)) {
        places[i] = newPlace;
                    isUpdated = true;
                    break;
       }
            }
        }

        if (!isUpdated) {
            System.out.println("place not found for update");
        }

        return isUpdated;
    }

    public boolean deletePlace(String place) {
        boolean isDeleted = false;

        if (place != null) {
            for (int i = 0; i < places.length; i++) {
          if (places[i] != null && places[i].equals(place)) {
                    places[i] = null;
          isDeleted = true;
                    break;
          }
            }
      }

   if (!isDeleted) {
         System.out.println("place not found for delete");
        }

        return isDeleted;
    }
    public void getPlaces() {
        System.out.println("the trip places are :");
   for (String place : places) {
            System.out.println(place);
        }
    }
}

