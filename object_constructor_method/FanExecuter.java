class FanExecuter{
	public static void main(String args[]){
	Fan fan = new Fan();
	Capacitor capacitor = new Capacitor();

	fan.capacitor = capacitor;  

	fan.fanId = 1;
	fan.brand = "Usha";

	capacitor.id = 201;
	capacitor.type = "Electric";

	fan.getFanInfo();
	}
}