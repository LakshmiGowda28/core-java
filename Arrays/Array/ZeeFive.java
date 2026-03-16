class ZeeFive
{
	public static void main(String args[])
	{
		String appName = "Zee 5";

        String kannadaSerials[] = {
			"Gattimela","Jothe Jotheyali","Naagini","Yaare Nee Mohini","Paaru","Kamali","Krishna Tulasi","Radha Ramana","Sarvamangala Mangalye","Lakshmi Baramma",
			"Puttagowri Maduve","Mangalya","Sathya","Nagini 2","Ashwini Nakshatra","Geetha","Gruhalakshmi","Kaveri","Eradu Kanasu","Suryavamsha","Radha Kalyana",
			"Premaloka","Sundari","Manasa Sarovara","Mayamruga","Janaki Raghava","Amruthavarshini","Hoo Bisilu","Nammane Yuvarani","Gunasundari"};
			
		
		String malayalamSerials[] = {
			"Kudumbavilakku","Chembarathi","Pookkalam Varavayi","Kaiyethum Doorath","Parasparam","Karuthamuthu","Sathya Enna Penkutty","Azhagiya Laila",
			"Neeyum Njanum","Vanambadi","Bharya","Sthreedhanam","Nilavilakku","Aakashadoothu","Ente Manasaputhri","Kalyani","Mizhi Randilum","Manjil Virinja Poovu",
			"Kanalpoovu","Swantham Suhruthu","Sreeraman Sreedevi","Amrutham","Udayam","Minnukettu","Kayamkulam Kochunni","Thulabharam","Megham","Chandanamazha","Pranayam","Makalkku"};
			
			
        
		String englishSerials[] = {
			"Blacklist","Suits","Friends","Breaking Bad","Better Call Saul","Money Heist","Dark","Lupin","The Crown","Peaky Blinders",
			"Stranger Things","Narcos","Ozark","House of Cards","Sherlock","Mindhunter","Vikings","The Witcher","Lucifer","Lost",
			"Arrow","Supergirl","Gotham","The Walking Dead","Game of Thrones","Prison Break","Dexter","The Boys","Westworld","The Flash"};
		

		String hindiSerials[] = {
			"Kumkum Bhagya","Kundali Bhagya","Bhagya Lakshmi","Meet","Tujhse Hai Raabta","Qurbaan Hua","Guddan Tumse Na Ho Paayega","Pavitra Rishta","Jhansi Ki Rani",
			"Jodha Akbar","Ek Tha Raja Ek Thi Rani","Kasamh Se","Saat Phere","Yeh Teri Galiyan","Jamai Raja","Agnisakshi","Choti Bahu","Bandhan","Zindagi Ki Mehek",
			"Hitler Didi","Punar Vivah","Doli Armaano Ki","Aur Pyaar Ho Gaya","Rishton Ka Saudagar","Aap Ke Aa Jane Se","Kaala Teeka","Ishq Subhan Allah",
			"Bepanah Pyaar","Ghar Ek Mandir"};
		

		String teluguSerials[] = {
			"Zee Telugu Serial 1","Muddha Mandaram","Radhamma Kuthuru","Gundamma Gari Manavadu","Iddaru Ammayilu","Koilamma","Mutyala Muggu","Chakravakam",
			"Kalyana Vaibhogam","America Ammayi","Sathamanam Bhavathi","Nethra Jyothi","Rama Sakkani Seetha","Agni Sakshi","Mangamma Gari Manavadu",
			"Sundari","Subhasree","Amrutham","Rama Seetha","Bhagya Rekha","Jagadhatri","Oohalu Gusagusalade","Padamati Sandhya Ragam",
			"Prema Entha Madhuram","Trinayani","No.1 Kodalu","Devatha","Akka Chellellu","Attarintlo Akka Chellellu","Krishnaveni"};
			
			
		String tamilSerials[] = {
			"Sembaruthi","Oru Oorla Oru Rajakumari","Rettai Roja","Deivamagal","Anandham","Lakshmi","Chellame","Kaatrukkenna Veli","Nila",
			"Poove Poochoodava","Sathya","Yaaradi Nee Mohini","Neethane Enthan Ponvasantham","Metti Oli","Kolangal","Magarasi","Arputham","Mani",
			"Gokulathil Seethai","Pandian Stores","Baakiyalakshmi","Thirumathi Hitler","Anbe Sivam","Mouna Ragam","Raja Rani","Roja","Chithi",
			"Endrendrum Punnagai","Kalyanam Mudhal Kadhal Varai","Vidhya No.1"};
			
		ZeeFiveKan(kannadaSerials);
        ZeeFiveMal(malayalamSerials);
        ZeeFiveEng(englishSerials);
        ZeeFiveHin(hindiSerials);
        ZeeFiveTam(tamilSerials);
        ZeeFiveTel(teluguSerials);
			
			
	}	
			
	static void ZeeFiveKan(String[] kannadaSerials){
	
	System.out.println("No of kannadaSerials added are:"  + kannadaSerials.length);
	System.out.println(" List of Different kannada Serials Names are:");
	for(String serialname : kannadaSerials)
		System.out.println(serialname);
	
	}
	
	static void ZeeFiveMal(String[] malayalamSerials){
    
	System.out.println("\n No of malayalamSerial added are:" + malayalamSerials.length );
	System.out.println(" List of Different malayalamSerial Names are: ");
	for(String malayalamserial : malayalamSerials)
		System.out.println(malayalamserial);
	
	}
	
	static void ZeeFiveEng(String[] englishSerials){
	
	System.out.println("\n No of EnglishSerial added are:" + englishSerials.length );
	System.out.println(" List of Different englishSerials Names are: ");
	for(String englishserial : englishSerials)
		System.out.println(englishserial);
	}
	
	static void ZeeFiveHin(String[] hindiSerials){
		
	System.out.println("\n No of hindiSerials added are:" + hindiSerials.length );
	System.out.println(" List of Different hindiSerials Names are: ");
	for(String hindiserial : hindiSerials)
		System.out.println(hindiserial);
		
	}
	
	static void ZeeFiveTam(String[] tamilSerials){
	
	System.out.println("\nNo of tamilSerials added are:" + tamilSerials.length );
	System.out.println(" List of Different tamilSerials Names are: ");
	for(String tamilserial : tamilSerials)
		System.out.println(tamilserial);
		
	}
	
	static void ZeeFiveTel(String[] teluguSerials){
	
	System.out.println("\n No of teluguSerials added are:" + teluguSerials.length );
	System.out.println(" List of Different teluguSerials Names are: ");
	for(String teluguserial : teluguSerials)
		System.out.println(teluguserial);
		
	}
	
	}
	