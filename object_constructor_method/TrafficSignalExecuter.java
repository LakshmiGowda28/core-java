class TrafficSignalExecuter{
	public static void main(String args[]){
	TrafficSignal trafficSignal = new TrafficSignal();
	Cop cop = new Cop();

	trafficSignal.cop = cop;  

	trafficSignal.signalId = 1;
	trafficSignal.location = "SilkBoard";

	cop.id = 701;
	cop.name = "Ravi";

	trafficSignal.getTrafficSignalInfo();
	}
}