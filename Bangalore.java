class Bangalore {
    
    int cityId;
    String cityName;
    String state;
    int population;
    String famousFor;
    
    MallOfAsia mallOfAsia;

    public void getCityDetails() {
        System.out.println("The cityId is: " + cityId);
        System.out.println("The cityName is: " + cityName);
        System.out.println("The state is: " + state);
        System.out.println("The population is: " + population);
        System.out.println("The famousFor is: " + famousFor);

        mallOfAsia.getMallDetails();
    }
}



