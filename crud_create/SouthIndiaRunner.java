class SouthIndiaRunner {

public static void main(String[] args) {

SouthIndia s = new SouthIndia();

boolean added = s.addAirport("Kempegowda Airport");
System.out.println(added);

added = s.addAirport("Chennai Airport");
System.out.println(added);

added = s.addAirport("Hyderabad Airport");
System.out.println(added);

added = s.addAirport("Cochin Airport");
System.out.println(added);
		
added = s.addAirport("Rajiv Gandhi International Airport");
System.out.println(added);

added = s.addAirport("Trivandrum International Airport");
System.out.println(added);

added = s.addAirport("Mangalore International Airport");
System.out.println(added);

added = s.addAirport("Calicut International Airport");
System.out.println(added);


    s.getAirports();
    }
}