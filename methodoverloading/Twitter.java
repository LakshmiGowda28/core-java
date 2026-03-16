class Twitter {

	static void Login(String userName, String password)
	{
		System.out.println(userName);
		System.out.println(password);
	}

	static void Login(String email, int otp)
	{
		System.out.println(email);
		System.out.println(otp);
	}

	public static void main(String ref[])
	{
		Login("lakshmi_tw", "TWEET@555");
		Login("lakshmi@gmail.com", 902345);
	}
}