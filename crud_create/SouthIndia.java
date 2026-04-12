class SouthIndia {

String airportNames[] = new String[9];
int index;

    public boolean addAirport(String airport) {
        boolean isAdded = false;

        if (index < airportNames.length) {
            if (airport != null) {
                airportNames[index++] = airport;
                isAdded = true;
            } else {
                System.out.println("Invalid airport");
            }
        } else {
            System.out.println("Airport list is full....");
        }

        return isAdded;
    }

    public void getAirports() {
        System.out.println("South India Airport List:");

        for (String airport : airportNames) {
            System.out.println(airport);
        }
    }
}