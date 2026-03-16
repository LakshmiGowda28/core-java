class  BluetoothExecuter {

    public static void main(String[] args) {

         Bluetooth.turnOn();
		
		System.out.println("Increasing Volume");
         Bluetooth.increaseVolume();
         Bluetooth.increaseVolume();
		
		System.out.println("Decreasing Volume");
         Bluetooth.decreaseVolume();

    }
}