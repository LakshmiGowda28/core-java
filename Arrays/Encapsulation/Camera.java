class Camera {

    static int minZoom = 0;
    static int maxZoom = 5;
    static int currentZoom;
    static boolean isCameraOn;

    static void turnOn() {
        isCameraOn = true;
        System.out.println("Camera is ON");
    }

    static void increaseZoom() {
        if(isCameraOn) {
            if(currentZoom < maxZoom) {
                currentZoom++;
                System.out.println("Zoom : " + currentZoom);
            }
        } else {
            System.out.println("Turn ON the Camera first");
        }
    }

    static void decreaseZoom() {
        if(isCameraOn) {
            if(currentZoom > minZoom) {
                currentZoom--;
                System.out.println("Zoom : " + currentZoom);
            }
        } else {
            System.out.println("Turn ON the Camera first");
        }
    }
}
