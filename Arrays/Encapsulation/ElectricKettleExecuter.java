class ElectricKettleExecuter {

    public static void main(String[] args) {

        Heater.turnOn();
		
		System.out.println("Increasing Temparature");
        Heater.increaseTemp();
        Heater.increaseTemp();
		
		System.out.println("Decreasing Temparature");
        Heater.decreaseTemp();

    }
}