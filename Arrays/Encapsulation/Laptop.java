class Laptop {

    static int minBrightness = 0;
    static int maxBrightness = 10;
    static int currentBrightness;
    static boolean isLaptopOn;

    static void turnOn() {
        isLaptopOn = true;
        System.out.println("Laptop is ON");
    }

    static void increaseBrightness() {
        if(isLaptopOn) {
            if(currentBrightness < maxBrightness) {
                currentBrightness++;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the Laptop first");
        }
    }

    static void decreaseBrightness() {
        if(isLaptopOn) {
            if(currentBrightness > minBrightness) {
                currentBrightness--;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the Laptop first");
        }
    }
}