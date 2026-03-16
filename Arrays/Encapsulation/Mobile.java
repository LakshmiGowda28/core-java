class Mobile {

    static int minVolume = 0;
    static int maxVolume = 15;
    static int currentVolume;
    static boolean isMobileOn;

    static void turnOn() {
        isMobileOn = true;
        System.out.println("Mobile is ON");
    }

    static void increaseVolume() {
        if(isMobileOn) {
            if(currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the Mobile first");
        }
    }

    static void decreaseVolume() {
        if(isMobileOn) {
            if(currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the Mobile first");
        }
    }
}