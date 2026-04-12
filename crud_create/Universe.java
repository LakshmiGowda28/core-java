class Universe {

String galaxies[] = new String[11];
int index;

public boolean addGalaxy(String galaxy) {
boolean isAdded = false;
    
	if(index < galaxies.length ){
    if (galaxy != null) {
    galaxies[index++] = galaxy;
    isAdded = true;
    }
	else 
    System.out.println("Invalid galaxy");
    }
    else
    System.out.println("Galaxies are full...");
	
return isAdded;
    }

public void getGalaxies() {
System.out.println("List of Galaxies:");

    for (String galaxy : galaxies)
    System.out.println(galaxy);
   
    }
}