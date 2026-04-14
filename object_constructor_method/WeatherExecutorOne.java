class WeatherExecutorOne{
    public static void main(String[] args){
        Climate climate = new Climate();

        climate.id = 1002;
        climate.type = "Dry";

        Weather weather = new Weather(climate);

        weather.weatherId = 2;
        weather.place = "Delhi";

        weather.getWeatherInfo();
    }
}