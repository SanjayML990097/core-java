class MovieTicketSystem {
    int seats[] = new int[10];
    int index = 0;

    public boolean bookSeat(int seatNo) {
        if (index >= seats.length) {
      System.out.println("House Full");
            return false;
    }

        for (int i = 0; i < index; i++) {
        if (seats[i] == seatNo) {
                System.out.println("Seat already booked");
          return false;
       }
        }

        seats[index] = seatNo;
     index++;
        return true;
    }

    public void displaySeats() {
        if (index == 0) {
       System.out.println("No seats booked");
            return;
     }

        for (int i = 0; i < index; i++) {
     System.out.print(seats[i] + " ");
        }
        System.out.println();
    }

    public boolean updateSeat(int oldSeat, int newSeat) {

        for (int i = 0; i < index; i++) {
      if (seats[i] == oldSeat) {

                for (int j = 0; j < index; j++) {
           if (seats[j] == newSeat) {
                        System.out.println("New seat already booked");
           return false;
                    }
         }

        seats[i] = newSeat;
                return true;
            }
        }

        System.out.println("Old seat not found");
        return false;
    }

    public boolean cancelSeat(int seatNo) {

        for (int i = 0; i < index; i++) {
            if (seats[i] == seatNo) {

      for (int j = i; j < index - 1; j++) {
            seats[j] = seats[j + 1];
                }

        index--;
          return true;
            }
        }

        System.out.println("Seat not found");
        return false;
    }

    public void searchSeat(int seatNo) {
        for (int i = 0; i < index; i++) {
       if (seats[i] == seatNo) {
        System.out.println("Seat Found");
                return;
      }
        }
    System.out.println("Seat Not Found");
    }
}