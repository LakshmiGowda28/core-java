class Hungama {

    String showNames[] = new String[14];
    int index;

    public boolean addShow(String show) {
        boolean isAdded = false;

        if (index < showNames.length) {
            if (show != null) {
                showNames[index++] = show;
                isAdded = true;
            } else {
                System.out.println("Invalid show name");
            }
        } else {
            System.out.println("Show list is full....");
        }

        return isAdded;
    }

    public void getShows() {
        System.out.println("Hungama Show List:");

        for (String show : showNames) {
            System.out.println(show);
        }
    }
}