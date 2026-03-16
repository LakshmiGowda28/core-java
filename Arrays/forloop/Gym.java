class Gym
{
	static String equipments[] = {"Treadmills", "Ellipticals", "Rowing machines", "Dumbbels", "Barbells"};
	
	static void equipments()
	{
		System.out.println("Available equipments are ");
		for(String equipment : equipments)
		{
			System.out.println(equipment);
		}
	}
	
	public static void main(String[] args)
	{
		equipments();
	}
}

