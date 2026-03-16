class Radio {

    static int minVolume = 0;
    static int maxVolume = 8;
    static int currentVolume;
    static boolean isRadioOn;

    static void turnOn() {
        isRadioOn = true;
        System.out.println("Radio is ON");
    }

    static void increaseVolume() {
        if(isRadioOn) {
            if(currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the Radio first");
        }
    }

    static void decreaseVolume() {
        if(isRadioOn) {
            if(currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the Radio first");
        }
    }
}