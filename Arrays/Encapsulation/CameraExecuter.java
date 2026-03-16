class CameraExecuter {

    public static void main(String[] args) {

        Camera.turnOn();
		
		System.out.println("Increasing Zoom");
        Camera.increaseZoom();
        Camera.increaseZoom();
		Camera.increaseZoom();
		
		System.out.println("Decreasing Zoom");
        Camera.decreaseZoom();

    }
}