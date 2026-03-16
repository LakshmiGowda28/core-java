class Earbuds {

    static int minVolume = 0;
    static int maxVolume = 10;
    static int currentVolume;
    static boolean isHeadphonesOn;

    static void turnOn() {
        isHeadphonesOn = true;
        System.out.println("Headphones is ON");
    }

    static void increaseVolume() {
        if(isHeadphonesOn) {
            if(currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the Headphones first");
        }
    }

    static void decreaseVolume() {
        if(isHeadphonesOn) {
            if(currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the Headphones first");
        }
    }
}