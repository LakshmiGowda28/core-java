class RadioExecuter {

    public static void main(String[] args) {

        Radio.turnOn();
		
		System.out.println("Increasing Volume");
        Radio.increaseVolume();
        Radio.increaseVolume();
		
		System.out.println("Decreasing Volume");
        Radio.decreaseVolume();

    }
}