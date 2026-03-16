class Light {

    static int minBrightness = 0;
    static int maxBrightness = 5;
    static int currentBrightness;
    static boolean isLightOn;

    static void turnOn() {
        isLightOn = true;
        System.out.println("LED Light is ON");
    }

    static void increaseBrightness() {
        if(isLightOn) {
            if(currentBrightness < maxBrightness) {
                currentBrightness++;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the Light first");
        }
    }

    static void decreaseBrightness() {
        if(isLightOn) {
            if(currentBrightness > minBrightness) {
                currentBrightness--;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the Light first");
        }
    }
}