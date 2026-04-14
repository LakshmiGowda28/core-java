class TrafficSignalExecutorOne{
    public static void main(String[] args){
        Cop cop = new Cop();

        cop.id = 702;
        cop.name = "Arjun";

        TrafficSignal trafficSignal = new TrafficSignal(cop);

        trafficSignal.signalId = 2;
        trafficSignal.location = "Majestic";

        trafficSignal.getTrafficSignalInfo();
    }
}