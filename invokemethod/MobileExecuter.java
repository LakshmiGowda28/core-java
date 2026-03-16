class MobileExecuter {

    public static void main(String[] args) {

        Mobile.turnOn();
		
		System.out.println("Increasing Volume");
        Mobile.increaseVolume();
        Mobile.increaseVolume();
		
		System.out.println("Decreasing Volume");
        Mobile.decreaseVolume();

    }
}