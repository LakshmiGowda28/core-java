class TrafficSignal{
    int signalId;
    String location;

    Cop cop;

    TrafficSignal(){}

    TrafficSignal(Cop cop){
        this.cop = cop;
        System.out.println("TrafficSignal constructor called");
    }

    public void createTrafficSignal(Cop cop){
        this.cop = cop;
        System.out.println("createTrafficSignal method called");
    }

    public void getTrafficSignalInfo(){
        System.out.println("getTrafficSignalInfo started");
        System.out.println("TrafficSignal id is " + signalId);
        System.out.println("TrafficSignal location is " + location);
        System.out.println("getTrafficSignalInfo executed");
    }
}