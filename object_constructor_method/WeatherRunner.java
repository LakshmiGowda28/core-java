class WeatherRunner{
	public static void main(String args[]){
	Weather weather = new Weather();
	Climate climate = new Climate();

	climate.id = 1003;
	climate.type = "Humid";

	weather.createWeather(climate);  
	
	weather.weatherId = 3;
	weather.place = "Chennai";

	weather.getWeatherInfo();
	}
}