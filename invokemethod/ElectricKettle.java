class ElectricKettle {

    static int minTemp = 30;
    static int maxTemp = 100;
    static int currentTemp = 50;
    static boolean isKettleOn;

    static void turnOn() {
        isKettleOn = true;
        System.out.println("Electric Kettle is ON");
    }

    static void increaseTemp() {
        if(isKettleOn) {
            if(currentTemp < maxTemp) {
                currentTemp++;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the Kettle first");
        }
    }

    static void decreaseTemp() {
        if(isKettleOn) {
            if(currentTemp > minTemp) {
                currentTemp--;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the Kettle first");
        }
    }
}