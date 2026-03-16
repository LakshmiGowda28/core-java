class Instagram {

	static void Login(String userName, String password)
	{
		System.out.println("Username: " + userName);
		System.out.println("Password: " + password);
	}

	static void Login(String email, int otp)
	{
		System.out.println("Email: " + email);
		System.out.println("OTP: " + otp);
	}

	public static void main(String ref[])
	{
		Login("lakshmi_insta", "INSTA@123");
		Login("lakshmi@gmail.com", 458921);
	}
}