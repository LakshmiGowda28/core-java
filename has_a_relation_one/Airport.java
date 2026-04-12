class Airport{
	
	String airportName;
	String airportAdd;
	Terminal terminal;
	
	public void getAirportDetails()
	{
	System.out.println("the airport name is"+airportName);
	System.out.println("the airport addeess is"+airportAdd);
	terminal.getTerminalDetails();
	}
	
	
	public boolean createTerminal(Terminal terminal)
	{	
		this.terminal=terminal;
		return true;
	}
}	