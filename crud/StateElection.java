class StateElection {

    String partyNames[] = new String[7];
    int index;

    public boolean addParty(String party) {

        boolean isPartyAdded = false;

        if (index < partyNames.length) {

            if (party != null && !party.isEmpty()) {
                partyNames[index++] = party;
                isPartyAdded = true;
            } else {
                System.out.println(party + " is not valid");
            }

        } else {
            System.out.println("Party list is full");
        }

        return isPartyAdded;
    }

    public void getParties() {

        System.out.println("State Election Parties are:");

        for (String party : partyNames) {
            System.out.println(party);
        }
    }

    public String getPartyByName(String partyName) {

        String name = null;

        for (String party : partyNames) {
            if (party == partyName) {
                name = party;
                break;
            }
        }

        if (name == null) {
            System.out.println("Party is not found");
        }

        return name;
    }

    public boolean updateParty(String existingParty, String updatedParty) {

        boolean isUpdated = false;

        for (int i = 0; i < partyNames.length; i++) {

            if (partyNames[i] == existingParty) {
                partyNames[i] = updatedParty;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingParty + " is not found");
        }

        return isUpdated;
    }

    public boolean deleteParty(String partyName) {

        boolean isDeleted = false;

        for (int i = 0; i < partyNames.length; i++) {

            if (partyNames[i] == partyName) {
                partyNames[i] = null;
                isDeleted = true;
                break;
            }
        }

        if (isDeleted == false) {
            System.out.println(partyName + " is not found");
        }

        return isDeleted;
    }
}