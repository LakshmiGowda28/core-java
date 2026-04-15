class Table{
    Team[] teams;  
    void getTableDetails(){
        for(Team t : teams){
            t.getTeamDetails();
        }
    }
}