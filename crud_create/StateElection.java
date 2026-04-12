class StateElection{

String partyNames[] = new String[7];
int index;

public boolean addParty(String party){
boolean isPartyAdded = false;

    if(index < partyNames.length){
    if(party != null && !party.isEmpty()){

        partyNames[index++] = party;
        isPartyAdded = true;
    }
    else
    System.out.println(party + " is not valid");
    }
    else
    System.out.println("Party list is full");

return isPartyAdded;
  }

public void getParties(){
    System.out.println("State Election Parties are:");
    for(String party : partyNames)
    System.out.println(party);
   
  }

}