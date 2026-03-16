class Aha {
        String ahaTeluguMovies[] = {"Colour Photo","Middle Class Melodies","Gali Patam","Writer Padmabhushan","Oke Okkadu","Prati Roju Pandage","Bhanumathi & Ramakrishna","Sammohanam",
									"Brochevarevarura","Kshanam","Agent Sai Srinivasa Athreya","Jathi Ratnalu","Krishna and His Leela","Naandhi","Asura","Gamyam","Chi La Sow",
									"Ee Nagaraniki Emaindi","Awe","Malli Raava","Sreekaram","Ala Modalaindi","Prasthanam","Leader","Mathu Vadalara","DJ Tillu","Raja Raja Chora",
									"Good Luck Sakhi","Kotha Bangaru Lokam","Oopiri Aagadu"};
									
		public static void main(String[] args) {
		getahaTelgu();
	}
	
static void getahaTelgu(String[] ahaTeluguMovies){
	
	System.out.println("No of teluguMovies added are:" + ahaTeluguMovies.length );
	System.out.println("List of Different teluguMovies Names are: ");
	for(String ahaTeluguMovie : ahaTeluguMovies){
	System.out.println(ahaTeluguMovie);
	}
}
}


