class Salon {

    String services[] = new String[7];
    int index;

    public boolean addService(String service) {

        boolean isAdded = false;

        if (index < services.length) {

            if (service != null && !service.isEmpty()) {
                services[index++] = service;
                isAdded = true;
            } else {
                System.out.println(service + " is not valid");
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

    public String getServiceByName(String serviceName) {

        String name = null;

        for (String service : services) {
            if (service == serviceName) {
                name = service;
                break;
            }
        }

        if (name == null) {
            System.out.println("Service is not found");
        }

        return name;
    }

    public boolean updateService(String existingService, String updatedService) {

        boolean isUpdated = false;

        for (int i = 0; i < services.length; i++) {

            if (services[i] == existingService) {
                services[i] = updatedService;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingService + " is not found");
        }

        return isUpdated;
    }
}