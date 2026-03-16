class HeadPhone {

    static int minVolume = 0;
    static int maxVolume = 20;
    static int currentVolume;
    static boolean isMusicSystemOn;

    static void turnOn() {
        isMusicSystemOn = true;
        System.out.println("Music System is ON");
    }

    static void increaseVolume() {
        if(isMusicSystemOn) {
            if(currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON Music System first");
        }
    }

    static void decreaseVolume() {
        if(isMusicSystemOn) {
            if(currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON Music System first");
        }
    }
}