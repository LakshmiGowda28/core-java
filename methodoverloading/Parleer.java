class Parleer {
	static void Login(String userName, String password){
		System.out.println(userName);
		System.out.println(password);
	}
	static void Login(String email, int otp){
		System.out.println(email);
		System.out.println(otp);
	}
	public static void main(String ref[]){
		Login("lakshmi","lAkSh@123");
		Login("lakshmi@gmail.com",117833);
	}
}