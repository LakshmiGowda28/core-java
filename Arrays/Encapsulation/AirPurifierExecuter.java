class AirPurifierExecuter {

    public static void main(String[] args) {

        AirPurifier.turnOn();
		
		System.out.println("Increasing Volume");
        AirPurifier.increaseSpeed();
        AirPurifier.increaseSpeed();
		
		System.out.println("Decreasing Volume");
        AirPurifier.decreaseSpeed();

    }
}