class FanExecutorOne{
    public static void main(String[] args){
        Capacitor capacitor = new Capacitor();

        capacitor.id = 202;
        capacitor.type = "AC";

        Fan fan = new Fan(capacitor);

        fan.fanId = 2;
        fan.brand = "Orient";

        fan.getFanInfo();
    }
}