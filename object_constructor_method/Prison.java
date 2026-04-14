class Prison{
    int prisonId;
    String name;

    Criminal criminal;

    Prison(){}

    Prison(Criminal criminal){
        this.criminal = criminal;
        System.out.println("Prison constructor called");
    }

    public void createPrison(Criminal criminal){
        this.criminal = criminal;
        System.out.println("createPrison method called");
    }

    public void getPrisonInfo(){
        System.out.println("getPrisonInfo started");
        System.out.println("Prison id is " + prisonId);
        System.out.println("Prison name is " + name);
        System.out.println("getPrisonInfo executed");
    }
}
