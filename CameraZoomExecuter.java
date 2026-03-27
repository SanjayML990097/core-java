
class CameraZoomExecuter {

    public static void main(String[] args) {

        CameraZoom.turnOn();
        CameraZoom.zoomIn(2);
        System.out.println("Current Zoom: " + CameraZoom.getZoom());
        CameraZoom.zoomOut(1);
        CameraZoom.turnOff();
    }
}