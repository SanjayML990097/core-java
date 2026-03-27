class Spotifyy
{
    static String songs[] = {
        "Shape of You",
        "Believer",
        "Blinding Lights",
        "Perfect",
        "Senorita",
        "Levitating",
        "Closer",
        "Kesariya",
        "Tum Hi Ho"
    };

    public static void getSongs()
    {   
        System.out.println("get songs invoked : ");
        for(String song : songs){
            System.out.println(song);
        }
        System.out.println("end of the songs");
    }
}