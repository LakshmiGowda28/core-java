class Fan {

    static int minSpeed = 0;
    static int maxSpeed = 5;
    static int currentSpeed;
    static boolean isFanOn;

    static void turnOn() {
        isFanOn = true;
        System.out.println("Fan is ON");
    }

    static void increaseSpeed() {
        if(isFanOn) {
            if(currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Speed : " + currentSpeed);
            }
        } else {
            System.out.println("Turn ON the Fan first");
        }
    }

    static void decreaseSpeed() {
        if(isFanOn) {
            if(currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Speed : " + currentSpeed);
            }
        } else {
            System.out.println("Turn ON the Fan first");
        }
    }
}