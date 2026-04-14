class GithubRunner{
	public static void main(String args[]){
	Github github = new Github();
	Repository repository = new Repository();

	repository.id = 803;
	repository.name = "html-css";

	github.createGithub(repository);  
	
	github.githubId = 3;
	github.userName = "developer";

	github.getGithubInfo();
	}
}