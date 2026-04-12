class ShowRoom {

    String managerNames[] = new String[8];
    int index;

    public boolean addManager(String manager) {

        boolean isAdded = false;

        if (index < managerNames.length) {

            if (manager != null && !manager.isEmpty()) {
                managerNames[index++] = manager;
                isAdded = true;
            } else {
                System.out.println(manager + " is not valid");
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

    public String getManagerByName(String managerName) {

        String name = null;

        for (String manager : managerNames) {
            if (manager == managerName) {
                name = manager;
                break;
            }
        }

        if (name == null) {
            System.out.println("Manager is not found");
        }

        return name;
    }

    public boolean updateManager(String existingManager, String updatedManager) {

        boolean isUpdated = false;

        for (int i = 0; i < managerNames.length; i++) {

            if (managerNames[i] == existingManager) {
                managerNames[i] = updatedManager;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingManager + " is not found");
        }

        return isUpdated;
    }

    public boolean deleteManager(String managerName) {

        boolean isDeleted = false;

        for (int i = 0; i < managerNames.length; i++) {

            if (managerNames[i] == managerName) {
                managerNames[i] = null;
                isDeleted = true;
                break;
            }
        }

        if (isDeleted == false) {
            System.out.println(managerName + " is not found");
        }

        return isDeleted;
    }
}