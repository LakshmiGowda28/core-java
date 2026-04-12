class Course {

    String technologyNames[] = new String[15];
    int index;

    public boolean addTechnology(String tech) {
        boolean isAdded = false;

        if (index < technologyNames.length) {
            if (tech != null) {
                technologyNames[index++] = tech;
                isAdded = true;
            } else {
                System.out.println("Invalid technology");
            }
        } else {
            System.out.println("Technology list is full....");
        }

        return isAdded;
    }

    public void getTechnologies() {
        System.out.println("Course Technology List:");

        for (String tech : technologyNames) {
            System.out.println(tech);
        }
    }
}