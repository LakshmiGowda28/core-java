class Github{
    int githubId;
    String userName;

    Repository repository;

    Github(){}

    Github(Repository repository){
        this.repository = repository;
        System.out.println("Github constructor called");
    }

    public void createGithub(Repository repository){
        this.repository = repository;
        System.out.println("createGithub method called");
    }

    public void getGithubInfo(){
        System.out.println("getGithubInfo started");
        System.out.println("Github id is " + githubId);
        System.out.println("Github userName is " + userName);
        System.out.println("getGithubInfo executed");
    }
}