class Weather{
    int weatherId;
    String place;

    Climate climate;

    Weather(){}

    Weather(Climate climate){
        this.climate = climate;
        System.out.println("Weather constructor called");
    }

    public void createWeather(Climate climate){
        this.climate = climate;
        System.out.println("createWeather method called");
    }

    public void getWeatherInfo(){
        System.out.println("getWeatherInfo started");
        System.out.println("Weather id is " + weatherId);
        System.out.println("Weather place is " + place);
        System.out.println("getWeatherInfo executed");
    }
}