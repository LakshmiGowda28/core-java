class Bluetooth {

    static int minVolume = 0;
    static int maxVolume = 12;
    static int currentVolume;
    static boolean isBluetoothOn;

    static void turnOn() {
        isBluetoothOn = true;
        System.out.println("Bluetooth is ON");
    }

    static void increaseVolume() {
        if(isBluetoothOn) {
            if(currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON Bluetooth first");
        }
    }

    static void decreaseVolume() {
        if(isBluetoothOn) {
            if(currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON Bluetooth first");
        }
    }
}