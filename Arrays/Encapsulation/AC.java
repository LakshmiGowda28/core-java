class AC {

    static int minTemp = 16;
    static int maxTemp = 30;
    static int currentTemp = 24;
    static boolean isAcOn;

    static void turnOn() {
        isAcOn = true;
        System.out.println("AC is ON");
    }

    static void increaseTemp() {
        if(isAcOn) {
            if(currentTemp < maxTemp) {
                currentTemp++;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the AC first");
        }
    }

    static void decreaseTemp() {
        if(isAcOn) {
            if(currentTemp > minTemp) {
                currentTemp--;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the AC first");
        }
    }
}