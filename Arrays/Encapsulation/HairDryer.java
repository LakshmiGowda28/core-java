class HairDryer {

    static int minTemp = 0;
    static int maxTemp = 10;
    static int currentTemp;
    static boolean isAirFryerOn;

    static void turnOn() {
        isAirFryerOn = true;
        System.out.println("Air Fryer is ON");
    }

    static void increaseTemp() {
        if(isAirFryerOn) {
            if(currentTemp < maxTemp) {
                currentTemp++;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the Air Fryer first");
        }
    }

    static void decreaseTemp() {
        if(isAirFryerOn) {
            if(currentTemp > minTemp) {
                currentTemp--;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the Air Fryer first");
        }
    }
}