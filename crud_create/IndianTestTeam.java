class IndianTestTeam {

    String playerNames[] = new String[11];
    int index;

    public boolean addPlayer(String player) {
        boolean isAdded = false;

        if (index < playerNames.length) {
            if (player != null) {
                playerNames[index++] = player;
                isAdded = true;
            } else {
                System.out.println("Invalid player");
            }
        } else {
            System.out.println("Team is full....");
        }

        return isAdded;
    }

    public void getPlayers() {
        System.out.println("Indian Test Team Players:");

        for (String player : playerNames) {
            System.out.println(player);
        }
    }
}