class Movie {
    
    int movieId;
    String movieName;
    String genre;
    int duration;
    String language;
    
    Actor actor;

    public void getMovieDetails() {
        System.out.println("The movieId is: " + movieId);
        System.out.println("The movieName is: " + movieName);
        System.out.println("The genre is: " + genre);
        System.out.println("The duration is: " + duration);
        System.out.println("The language is: " + language);

        actor.getActorDetails();
    }
}



