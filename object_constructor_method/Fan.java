class Fan{
    int fanId;
    String brand;

    Capacitor capacitor;

    Fan(){}
	
    Fan(Capacitor capacitor){
        this.capacitor = capacitor;
        System.out.println("Fan constructor called");
    }
    public void createFan(Capacitor capacitor){
        this.capacitor = capacitor;
        System.out.println("createFan method called");
    }
    public void getFanInfo(){
        System.out.println("getFanInfo started");
        System.out.println("Fan id is " + fanId);
        System.out.println("Fan brand is " + brand);
        System.out.println("getFanInfo executed");
    }
}