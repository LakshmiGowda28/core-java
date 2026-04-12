class ShowRoom {

    String managerNames[] = new String[8];
    int index;

    public boolean addManager(String manager) {
        boolean isAdded = false;

        if (index < managerNames.length) {
            if (manager != null) {
                managerNames[index++] = manager;
                isAdded = true;
            } else {
                System.out.println("Invalid manager name");
            }
        } else {
            System.out.println("Manager list is full....");
        }

        return isAdded;
    }

    public void getManagers() {
        System.out.println("ShowRoom Manager List:");

        for (String manager : managerNames) {
            System.out.println(manager);
        }
    }
}