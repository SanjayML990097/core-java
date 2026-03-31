class MovieExecutor {

    public static void main(String args[]) {

        Movie ref = new Movie();
        ref.movieId = 1;
        ref.movieName = "KGF";
        ref.genre = "Action";
        ref.duration = 150;
        ref.language = "Kannada";

        Actor a = new Actor();
        a.actorId = 101;
        a.actorName = "Yash";
        a.age = 37;
        a.experience = 15;
        a.nationality = "Indian";

        ref.actor = a;

        ref.getMovieDetails();
		

// 2
Movie ref2 = new Movie();
ref2.movieId = 2;
ref2.movieName = "RRR";
ref2.genre = "Action";
ref2.duration = 180;
ref2.language = "Telugu";

Actor a2 = new Actor();
a2.actorId = 102;
a2.actorName = "Ram Charan";
a2.age = 38;
a2.experience = 16;
a2.nationality = "Indian";

ref2.actor = a2;
ref2.getMovieDetails();

// 3
Movie ref3 = new Movie();
ref3.movieId = 3;
ref3.movieName = "Pushpa";
ref3.genre = "Drama";
ref3.duration = 170;
ref3.language = "Telugu";

Actor a3 = new Actor();
a3.actorId = 103;
a3.actorName = "Allu Arjun";
a3.age = 41;
a3.experience = 20;
a3.nationality = "Indian";

ref3.actor = a3;
ref3.getMovieDetails();

// 4
Movie ref4 = new Movie();
ref4.movieId = 4;
ref4.movieName = "Master";
ref4.genre = "Action";
ref4.duration = 160;
ref4.language = "Tamil";

Actor a4 = new Actor();
a4.actorId = 104;
a4.actorName = "Vijay";
a4.age = 49;
a4.experience = 28;
a4.nationality = "Indian";

ref4.actor = a4;
ref4.getMovieDetails();

// 5
Movie ref5 = new Movie();
ref5.movieId = 5;
ref5.movieName = "Jailer";
ref5.genre = "Action";
ref5.duration = 155;
ref5.language = "Tamil";

Actor a5 = new Actor();
a5.actorId = 105;
a5.actorName = "Rajinikanth";
a5.age = 73;
a5.experience = 45;
a5.nationality = "Indian";

ref5.actor = a5;
ref5.getMovieDetails();

// 6
Movie ref6 = new Movie();
ref6.movieId = 6;
ref6.movieName = "Leo";
ref6.genre = "Thriller";
ref6.duration = 165;
ref6.language = "Tamil";

Actor a6 = new Actor();
a6.actorId = 106;
a6.actorName = "Vijay";
a6.age = 49;
a6.experience = 28;
a6.nationality = "Indian";

ref6.actor = a6;
ref6.getMovieDetails();

// 7
Movie ref7 = new Movie();
ref7.movieId = 7;
ref7.movieName = "Bahubali";
ref7.genre = "Epic";
ref7.duration = 170;
ref7.language = "Telugu";

Actor a7 = new Actor();
a7.actorId = 107;
a7.actorName = "Prabhas";
a7.age = 44;
a7.experience = 18;
a7.nationality = "Indian";

ref7.actor = a7;
ref7.getMovieDetails();

// 8
Movie ref8 = new Movie();
ref8.movieId = 8;
ref8.movieName = "Salaar";
ref8.genre = "Action";
ref8.duration = 175;
ref8.language = "Telugu";

Actor a8 = new Actor();
a8.actorId = 108;
a8.actorName = "Prabhas";
a8.age = 44;
a8.experience = 18;
a8.nationality = "Indian";

ref8.actor = a8;
ref8.getMovieDetails();

// 9
Movie ref9 = new Movie();
ref9.movieId = 9;
ref9.movieName = "Sivaji";
ref9.genre = "Drama";
ref9.duration = 160;
ref9.language = "Tamil";

Actor a9 = new Actor();
a9.actorId = 109;
a9.actorName = "Rajinikanth";
a9.age = 73;
a9.experience = 45;
a9.nationality = "Indian";

ref9.actor = a9;
ref9.getMovieDetails();

// 10
Movie ref10 = new Movie();
ref10.movieId = 10;
ref10.movieName = "Arjun Reddy";
ref10.genre = "Romance";
ref10.duration = 165;
ref10.language = "Telugu";

Actor a10 = new Actor();
a10.actorId = 110;
a10.actorName = "Vijay Deverakonda";
a10.age = 35;
a10.experience = 10;
a10.nationality = "Indian";

ref10.actor = a10;
ref10.getMovieDetails();

// 11
Movie ref11 = new Movie();
ref11.movieId = 11;
ref11.movieName = "Geetha Govindam";
ref11.genre = "Romance";
ref11.duration = 150;
ref11.language = "Telugu";

Actor a11 = new Actor();
a11.actorId = 111;
a11.actorName = "Vijay Deverakonda";
a11.age = 35;
a11.experience = 10;
a11.nationality = "Indian";

ref11.actor = a11;
ref11.getMovieDetails();

// 12
Movie ref12 = new Movie();
ref12.movieId = 12;
ref12.movieName = "Doctor";
ref12.genre = "Comedy";
ref12.duration = 148;
ref12.language = "Tamil";

Actor a12 = new Actor();
a12.actorId = 112;
a12.actorName = "Sivakarthikeyan";
a12.age = 39;
a12.experience = 12;
a12.nationality = "Indian";

ref12.actor = a12;
ref12.getMovieDetails();

// continue same pattern till 29...
    }
}