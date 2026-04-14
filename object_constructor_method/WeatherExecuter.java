class WeatherExecuter{
	public static void main(String args[]){
	Weather weather = new Weather();
	Climate climate = new Climate();

	weather.climate = climate;  

	weather.weatherId = 1;
	weather.place = "Bangalore";

	climate.id = 1001;
	climate.type = "Tropical";

	weather.getWeatherInfo();
	}
}