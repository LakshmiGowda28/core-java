class Politician{
    int politicianId;
    String name;

    Voter voter;

    Politician(){}

    Politician(Voter voter){
        this.voter = voter;
        System.out.println("Politician constructor called");
    }

    public void createPolitician(Voter voter){
        this.voter = voter;
        System.out.println("createPolitician method called");
    }

    public void getPoliticianInfo(){
        System.out.println("getPoliticianInfo started");
        System.out.println("Politician id is " + politicianId);
        System.out.println("Politician name is " + name);
        System.out.println("getPoliticianInfo executed");
    }
}