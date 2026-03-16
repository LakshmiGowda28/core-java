class CarrierService {

    static void pickUpPackage() {
        System.out.println("Carrier picked up the package");
        HubRouter.sortToZipCode();
    }
}