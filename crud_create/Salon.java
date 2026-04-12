class Salon {

    String services[] = new String[7];
    int index;

    public boolean addService(String service) {
        boolean isAdded = false;

        if (index < services.length) {
            if (service != null) {
                services[index++] = service;
                isAdded = true;
            } else {
                System.out.println("Invalid service");
            }
        } else {
            System.out.println("Service list is full....");
        }

        return isAdded;
    }

    public void getServices() {
        System.out.println("Salon Services List:");

        for (String service : services) {
            System.out.println(service);
        }
    }
}