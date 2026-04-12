class House {

String indoorGames[] = new String[6];
int index;

public boolean addGame(String game) {
boolean isAdded = false;

if(index < indoorGames.length ){
    if (game != null) {
        indoorGames[index++] = game;
        isAdded = true;
        } 
	else 
    System.out.println("Invalid game");
    }
    else
    System.out.println("Game is full....");	
return isAdded;
    }

public void getGames() {
System.out.println("Indoor Games List:");

        for (String game : indoorGames) 
        System.out.println(game);
        
    }
}