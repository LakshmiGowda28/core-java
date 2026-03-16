class AirPurifier {

    static int minSpeed = 0;
    static int maxSpeed = 5;
    static int currentSpeed;
    static boolean isPurifierOn;

    static void turnOn() {
        isPurifierOn = true;
        System.out.println("Air Purifier is ON");
    }

    static void increaseSpeed() {
        if(isPurifierOn) {
            if(currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Speed : " + currentSpeed);
            }
        } else {
            System.out.println("Turn ON the Air Purifier first");
        }
    }

    static void decreaseSpeed() {
        if(isPurifierOn) {
            if(currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Speed : " + currentSpeed);
            }
        } else {
            System.out.println("Turn ON the Air Purifier first");
        }
    }
}