class Team{

String name;
int matches;
int won;
int loss;
double nrr;
int points;
String last5[];

public void getTeamDetails(){

System.out.print(" name  "+name+" | ");
System.out.print(" played "+matches+" | ");
System.out.print(" won  "+won+" | ");
System.out.print(" loss  "+loss+" | ");
System.out.print(" NRR "+nrr+" | ");
System.out.print(" last 5 ");
	for(String last : last5){
		System.out.print(last);
	}
System.out.println("\n");

}

}