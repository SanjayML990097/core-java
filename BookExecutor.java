class BookExecutor {

    public static void main(String[] args) {

        Book books[] = new Book[15];

        Book b1 = new Book();
        b1.bookId = 1401;
        b1.title = "Java Basics";
        b1.genre = "Education";
        b1.price = 500;
        b1.publisher = "Pearson";
        books[0] = b1;

        Book b2 = new Book();
        b2.bookId = 1402;
        b2.title = "Python Programming";
        b2.genre = "Education";
        b2.price = 600;
        b2.publisher = "O'Reilly";
        books[1] = b2;

        Book b3 = new Book();
        b3.bookId = 1403;
        b3.title = "Data Structures";
        b3.genre = "Technical";
        b3.price = 700;
        b3.publisher = "McGraw Hill";
        books[2] = b3;

        Book b4 = new Book();
        b4.bookId = 1404;
        b4.title = "Algorithms";
        b4.genre = "Technical";
        b4.price = 800;
        b4.publisher = "Pearson";
        books[3] = b4;

        Book b5 = new Book();
        b5.bookId = 1405;
        b5.title = "C Programming";
        b5.genre = "Education";
        b5.price = 450;
        b5.publisher = "BPB";
        books[4] = b5;

        Book b6 = new Book();
        b6.bookId = 1406;
        b6.title = "Operating System";
        b6.genre = "Technical";
        b6.price = 750;
        b6.publisher = "Wiley";
        books[5] = b6;

        Book b7 = new Book();
        b7.bookId = 1407;
        b7.title = "Database Systems";
        b7.genre = "Technical";
        b7.price = 720;
        b7.publisher = "Pearson";
        books[6] = b7;

        Book b8 = new Book();
        b8.bookId = 1408;
        b8.title = "Computer Networks";
        b8.genre = "Technical";
        b8.price = 680;
        b8.publisher = "McGraw Hill";
        books[7] = b8;

        Book b9 = new Book();
        b9.bookId = 1409;
        b9.title = "Web Development";
        b9.genre = "Education";
        b9.price = 550;
        b9.publisher = "O'Reilly";
        books[8] = b9;

        Book b10 = new Book();
        b10.bookId = 1410;
        b10.title = "Artificial Intelligence";
        b10.genre = "Technical";
        b10.price = 900;
        b10.publisher = "Springer";
        books[9] = b10;

        Book b11 = new Book();
        b11.bookId = 1411;
        b11.title = "Machine Learning";
        b11.genre = "Technical";
        b11.price = 950;
        b11.publisher = "Springer";
        books[10] = b11;

        Book b12 = new Book();
        b12.bookId = 1412;
        b12.title = "Cloud Computing";
        b12.genre = "Technical";
        b12.price = 850;
        b12.publisher = "Wiley";
        books[11] = b12;

        Book b13 = new Book();
        b13.bookId = 1413;
        b13.title = "Cyber Security";
        b13.genre = "Technical";
        b13.price = 800;
        b13.publisher = "McGraw Hill";
        books[12] = b13;

        Book b14 = new Book();
        b14.bookId = 1414;
        b14.title = "Software Engineering";
        b14.genre = "Education";
        b14.price = 700;
        b14.publisher = "Pearson";
        books[13] = b14;

        Book b15 = new Book();
        b15.bookId = 1415;
        b15.title = "Digital Marketing";
        b15.genre = "Business";
        b15.price = 600;
        b15.publisher = "BPB";
        books[14] = b15;


        for (Book book : books) {
            System.out.println(book.bookId);
            System.out.println(book.title);
            System.out.println(book.genre);
            System.out.println(book.price);
            System.out.println(book.publisher);
            System.out.println("----------------------");
        }
    }
}