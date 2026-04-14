class TrafficSignalRunner{
	public static void main(String args[]){
	TrafficSignal trafficSignal = new TrafficSignal();
	Cop cop = new Cop();

	cop.id = 703;
	cop.name = "Kiran";

	trafficSignal.createTrafficSignal(cop);  
	
	trafficSignal.signalId = 3;
	trafficSignal.location = "BTM";

	trafficSignal.getTrafficSignalInfo();
	}
}