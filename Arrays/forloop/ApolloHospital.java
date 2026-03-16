class ApolloHospital
{
	static String doctors[] = {"Dr.Prasanna", "Dr.Mahalakshmi", "Dr.Basavarajappa", "Dr.Mallesh"};
	
	static void doctor()
	{
		System.out.println("The list of doctors available are ");
		for (String doctor : doctors)
		{
			System.out.println(doctor);
		}
		System.out.println();
	}
}