class MovieExecutor {
    public static void main(String[] args) {

        MovieTicketSystem system = new MovieTicketSystem();

        system.bookSeat(10);
        system.bookSeat(20);
        system.bookSeat(30);

        system.displaySeats();

        system.updateSeat(20, 25);
        system.displaySeats();

        system.searchSeat(25);

        system.cancelSeat(10);
        system.displaySeats();
    }
}