class UniverseRunner {
public static void main(String[] args) {

Universe u = new Universe();

boolean added = u.addGalaxy("Milky Way");
System.out.println(added);
		
added = u.addGalaxy("Andromeda");
System.out.println(added);

added = u.addGalaxy("Triangulum Galaxy");
System.out.println(added);

added = u.addGalaxy("Sombrero Galaxy");
System.out.println(added);

added = u.addGalaxy("Whirlpool Galaxy");
System.out.println(added);

added = u.addGalaxy("Pinwheel Galaxy");
System.out.println(added);

added = u.addGalaxy("Black Eye Galaxy");
System.out.println(added);

added = u.addGalaxy("Sunflower Galaxy");
System.out.println(added);

added = u.addGalaxy("Messier 87");
System.out.println(added);

added = u.addGalaxy("IC 1101");
System.out.println(added);

added = u.addGalaxy("Centaurus A");
System.out.println(added);

	u.getGalaxies();
	
    }
}