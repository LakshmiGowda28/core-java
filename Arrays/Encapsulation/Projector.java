class Projector {

    static int minBrightness = 0;
    static int maxBrightness = 10;
    static int currentBrightness;
    static boolean isProjectorOn;

    static void turnOn() {
        isProjectorOn = true;
        System.out.println("Projector is ON");
    }

    static void increaseBrightness() {
        if(isProjectorOn) {
            if(currentBrightness < maxBrightness) {
                currentBrightness++;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the Projector first");
        }
    }

    static void decreaseBrightness() {
        if(isProjectorOn) {
            if(currentBrightness > minBrightness) {
                currentBrightness--;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the Projector first");
        }
    }
}