class CameraZoom {

    static int zoom = 1;
    static boolean power = false;

    static int getZoom() {
        return zoom;
    }

    static void turnOn() {
        power = true;
        System.out.println("Camera ON");
    }

    static void turnOff() {
        power = false;
        System.out.println("Camera OFF");
    }

    static void zoomIn(int value) {
        if(power){
            zoom += value;
            System.out.println("Zoom increased to: " + zoom);
        }
    }

    static void zoomOut(int value) {
        if(power){
            zoom -= value;
            System.out.println("Zoom decreased to: " + zoom);
        }
    }
}
