class SouthIndiaRunner {

public static void main(String[] args) {

SouthIndia s = new SouthIndia();

boolean added = s.addAirport("Kempegowda");
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

added = s.addAirport("Goa Airport");
System.out.println(added);


s.getAirports();

String airport = s.getAirportByName("Kempegowda");
System.out.println("Airport name is available");

s.updateAirport("Chennai Airport", "Chennai International");
System.out.println("Airport name is updated");

s.deleteAirport("Cochin Airport");
System.out.println("Airport name is deleted");

s.getAirports();
    }
}