class Refrigerator {

    static int minTemp = 1;
    static int maxTemp = 10;
    static int currentTemp = 5;
    static boolean isFridgeOn;

    static void turnOn() {
        isFridgeOn = true;
        System.out.println("Refrigerator is ON");
    }

    static void increaseTemp() {
        if(isFridgeOn) {
            if(currentTemp < maxTemp) {
                currentTemp++;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the Refrigerator first");
        }
    }

    static void decreaseTemp() {
        if(isFridgeOn) {
            if(currentTemp > minTemp) {
                currentTemp--;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the Refrigerator first");
        }
    }
}