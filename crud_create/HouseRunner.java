class HouseRunner {
    
public static void main(String[] args) {

House h = new House();

boolean added = h.addGame("Chess");
System.out.println(added);
	
added = h.addGame("Carrom");
System.out.println(added);
		
added =  h.addGame("Ludo");
System.out.println(added);

added = h.addGame("Musical Chairs");		
System.out.println(added);

added = h.addGame("Truth or Dare");		
System.out.println(added);

added = h.addGame("Puzzles");		
System.out.println(added);

        h.getGames();
    }
}