class GithubExecutorOne{
    public static void main(String[] args){
        Repository repository = new Repository();

        repository.id = 802;
        repository.name = "spring-project";

        Github github = new Github(repository);

        github.githubId = 2;
        github.userName = "gowda";

        github.getGithubInfo();
    }
}