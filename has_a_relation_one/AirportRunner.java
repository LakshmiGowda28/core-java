class AirportRunner{

public static void main(String[] a){

Airport airport = new Airport();

airport.airportName ="KempeGowda";
airport.airportAdd = "Banglore";


Terminal terminal = new Terminal();
airport.terminal = terminal;

terminal.terminalNo = 1;
terminal.terminalName = "terminal A";

airport.getAirportDetails();
}
}