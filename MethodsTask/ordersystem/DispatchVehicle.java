class DispatchVehicle {

    static void outForDelivery() {
        System.out.println("Vehicle out for delivery");
        DeliveryAgent.reachDoorStep();
    }
}