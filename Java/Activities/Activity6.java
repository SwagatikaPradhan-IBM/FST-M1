public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
    Activity6_Plane newPlane = new Activity6_Plane(10);
    newPlane.onboard("1");
        newPlane.onboard("2");
        newPlane.onboard("3");
        newPlane.onboard("4");
        newPlane.onboard("5");
        newPlane.onboard("6");
        newPlane.onboard("7");
        newPlane.onboard("8");
        newPlane.onboard("9");
        newPlane.onboard("10");
        System.out.println("TakeOff Time: "+newPlane.takeOff());
        System.out.println("Passengers on Plane: "+newPlane.getPassengers());
        Thread.sleep(5000);
        newPlane.land();
        System.out.println("Landing Time : "+newPlane.getLastTimeLanded());
        System.out.println("Passengers on plane after landing "+newPlane.getPassengers());

    }
}
