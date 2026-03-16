class Mixer {

    static int minSpeed = 0;
    static int maxSpeed = 3;
    static int currentSpeed;
    static boolean isMixerOn;

    static void turnOn() {
        isMixerOn = true;
        System.out.println("Mixer Grinder is ON");
    }

    static void increaseSpeed() {
        if(isMixerOn) {
            if(currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Speed : " + currentSpeed);
            }
        } else {
            System.out.println("Turn ON the Mixer first");
        }
    }

    static void decreaseSpeed() {
        if(isMixerOn) {
            if(currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Speed : " + currentSpeed);
            }
        } else {
            System.out.println("Turn ON the Mixer first");
        }
    }
}