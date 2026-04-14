class FanRunner{
	public static void main(String args[]){
	Fan fan = new Fan();
	Capacitor capacitor = new Capacitor();

	capacitor.id = 203;
	capacitor.type = "DC";

	fan.createFan(capacitor);  
	
	fan.fanId = 3;
	fan.brand = "Bajaj";

	fan.getFanInfo();
	}
}