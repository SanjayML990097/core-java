class PrinterCopies {

    static int copies = 0;

    static int getCopies() {
        return copies;
    }

    static void printCopies(int value) {
        copies += value;
        System.out.println("Printing copies: " + copies);
    }
}
