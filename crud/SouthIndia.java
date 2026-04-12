class SouthIndia {

    String airportNames[] = new String[9];
    int index;

    public boolean addAirport(String airport) {

        boolean isAdded = false;

        if (index < airportNames.length) {

            if (airport != null && !airport.isEmpty()) {
                airportNames[index++] = airport;
                isAdded = true;
            } else {
                System.out.println(airport + " is not valid");
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

    public String getAirportByName(String airportName) {

        String name = null;

        for (String airport : airportNames) {
            if (airport == airportName) {
                name = airport;
                break;
            }
        }

        if (name == null) {
            System.out.println("Airport is not found");
        }

        return name;
    }

    public boolean updateAirport(String existingAirport, String updatedAirport) {

        boolean isUpdated = false;

        for (int i = 0; i < airportNames.length; i++) {

            if (airportNames[i] == existingAirport) {
                airportNames[i] = updatedAirport;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingAirport + " is not found");
        }

        return isUpdated;
    }

    public boolean deleteAirport(String airportName) {

        boolean isDeleted = false;

        for (int i = 0; i < airportNames.length; i++) {

            if (airportNames[i] == airportName) {
                airportNames[i] = null;
                isDeleted = true;
                break;
            }
        }

        if (isDeleted == false) {
            System.out.println(airportName + " is not found");
        }

        return isDeleted;
    }
}