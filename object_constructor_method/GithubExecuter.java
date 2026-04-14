class GithubExecuter{
	public static void main(String args[]){
	Github github = new Github();
	Repository repository = new Repository();

	github.repository = repository;  

	github.githubId = 1;
	github.userName = "lakshmi";

	repository.id = 801;
	repository.name = "core-java";

	github.getGithubInfo();
	}
}