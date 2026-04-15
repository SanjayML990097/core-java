class AuthorRunner {

    public static void main(String[] args) {

        Author authors[] = new Author[15];

        Author a1 = new Author();
        a1.authorId = 1601;
        a1.name = "Ravi Kumar";
        a1.email = "ravi@gmail.com";
        a1.gender = "Male";
        a1.country = "India";
        authors[0] = a1;

        Author a2 = new Author();
        a2.authorId = 1602;
        a2.name = "Sneha Reddy";
        a2.email = "sneha@gmail.com";
        a2.gender = "Female";
        a2.country = "India";
        authors[1] = a2;

        Author a3 = new Author();
        a3.authorId = 1603;
        a3.name = "John Smith";
        a3.email = "john@gmail.com";
        a3.gender = "Male";
        a3.country = "USA";
        authors[2] = a3;

        Author a4 = new Author();
        a4.authorId = 1604;
        a4.name = "Emily Davis";
        a4.email = "emily@gmail.com";
        a4.gender = "Female";
        a4.country = "UK";
        authors[3] = a4;

        Author a5 = new Author();
        a5.authorId = 1605;
        a5.name = "Arjun Singh";
        a5.email = "arjun@gmail.com";
        a5.gender = "Male";
        a5.country = "India";
        authors[4] = a5;

        Author a6 = new Author();
        a6.authorId = 1606;
        a6.name = "Priya Sharma";
        a6.email = "priya@gmail.com";
        a6.gender = "Female";
        a6.country = "India";
        authors[5] = a6;

        Author a7 = new Author();
        a7.authorId = 1607;
        a7.name = "Michael Brown";
        a7.email = "michael@gmail.com";
        a7.gender = "Male";
        a7.country = "USA";
        authors[6] = a7;

        Author a8 = new Author();
        a8.authorId = 1608;
        a8.name = "Sophia Wilson";
        a8.email = "sophia@gmail.com";
        a8.gender = "Female";
        a8.country = "Canada";
        authors[7] = a8;

        Author a9 = new Author();
        a9.authorId = 1609;
        a9.name = "David Lee";
        a9.email = "david@gmail.com";
        a9.gender = "Male";
        a9.country = "Singapore";
        authors[8] = a9;

        Author a10 = new Author();
        a10.authorId = 1610;
        a10.name = "Anita Desai";
        a10.email = "anita@gmail.com";
        a10.gender = "Female";
        a10.country = "India";
        authors[9] = a10;

        Author a11 = new Author();
        a11.authorId = 1611;
        a11.name = "Robert Johnson";
        a11.email = "robert@gmail.com";
        a11.gender = "Male";
        a11.country = "USA";
        authors[10] = a11;

        Author a12 = new Author();
        a12.authorId = 1612;
        a12.name = "Meena Iyer";
        a12.email = "meena@gmail.com";
        a12.gender = "Female";
        a12.country = "India";
        authors[11] = a12;

        Author a13 = new Author();
        a13.authorId = 1613;
        a13.name = "Chris Evans";
        a13.email = "chris@gmail.com";
        a13.gender = "Male";
        a13.country = "UK";
        authors[12] = a13;

        Author a14 = new Author();
        a14.authorId = 1614;
        a14.name = "Sara Khan";
        a14.email = "sara@gmail.com";
        a14.gender = "Female";
        a14.country = "India";
        authors[13] = a14;

        Author a15 = new Author();
        a15.authorId = 1615;
        a15.name = "Daniel Kim";
        a15.email = "daniel@gmail.com";
        a15.gender = "Male";
        a15.country = "South Korea";
        authors[14] = a15;

      
        for (Author author : authors) {
            System.out.println(author.authorId);
            System.out.println(author.name);
            System.out.println(author.email);
            System.out.println(author.gender);
            System.out.println(author.country);
            System.out.println("----------------------");
        }
    }
}