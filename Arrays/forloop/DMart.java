class DMart
{
	static String groceries[] = {"Fruits", "Vegetables","cereals","home decor","Snacks"}; 
	
	static void groceries()
	{
		System.out.println("the list of home decor items in Dmart are ");
		for (String grocery : groceries)
		{
			System.out.println(grocery);
		}
	}
}
