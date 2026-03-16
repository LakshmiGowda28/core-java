class JioHotstar{

    static String kannadaSeries[] = {"Humble Politician Nograj","Honeymoon","Loose Connection","Ekam","By Mistake",
									"Love You Abhi","Shuddhi","Bhinna","Aarambha","Namma Metro",
									"Mayabazar","Satya","Jothe Jotheyali","Kasturi Nivasa","Mahanati",
									"Ranganayaki","Radha Ramana","Gattimela","Lakshmi Baramma","Kannadathi",
									"Geetha","Mangala Gowri","Paaru","Nannarasi Radhe","Muddu Lakshmi",
									"Nagini","Mahadevi","Brahmagantu","Naagini 2","Sevanthi"};
        

    static String englishSeries[] = {"Game of Thrones","Breaking Bad","Friends","The Office","Stranger Things",
									"Loki","WandaVision","The Mandalorian","Sherlock","Prison Break",
									"House of the Dragon","The Boys","Suits","Dark","Money Heist",
									"Chernobyl","Westworld","The Crown","Peaky Blinders","Vikings",
									"Lost","The Walking Dead","HIMYM","Modern Family","The Flash",
									"Arrow","Daredevil","The Witcher","Squid Game","Wednesday"};
        

    static String teluguSeries[] = {"9 Hours","Parampara","Save the Tigers","Mansion 24","Kudi Yedamaithe",
									"Locked","Gaalivaana","Sin","Oka Chinna Family Story","ATM",
									"Jhansi","Dhootha","Dayaa","Vadhuvu","Recce",
									"The Baker and the Beauty","Unheard","Loser","Gods of Dharmapuri","Mastis",
									"Modern Love Hyderabad","Vyavastha","Kumari Srimathi","Aha Naa Pellanta","Rana Naidu",
									"High Priestess","Pitta Kathalu","Bigg Boss Telugu","DID Telugu","Telugu Idol"};
        

    static String hindiSeries[] = {"Special OPS","Aarya","Criminal Justice","The Night Manager","City of Dreams",
									"Hostages","Asur","Rudra","The Freelancer","The Empire",
									"Taaza Khabar","Escaype Live","Out of Love","Grahan","Human",
									"Masoom","Roar of the Lion","Sarabhai","Mirzapur","Family Man",
									"Breathe","Maharani","Scam 1992","Farzi","Panchayat",
									"Rocket Boys","Undekhi","Abhay","Delhi Crime","Sacred Games"};
        

    static String tamilSeries[] = {"Suzhal","Fall","Vilangu","November Story","Iru Dhuruvam",
									"Queen","Fingertip","Navarasa","Auto Shankar","Live Telecast",
									"Meme Boys","Ayali","Bigg Boss Tamil","Dance Jodi","Survivor Tamil",
									"Kanaa Kaanum","Kana Kanum Kalangal","Anantham","Paper Rocket","Triples",
									"Addham","Udanpaal","Chutney Sambar","Inspector Rishi","Irai",
									"Mathagam","The Village","Perfect Husband","Mansion Tamil","Mansion 24 Tamil"};
        

    static String malayalamSeries[] = {"Kerala Crime Files","Masterpeace","Perilloor Premier","1000 Babies","Jai Mahendran",
										"Nagendran","Under Construction","Modern Kochi","Average Ambili","Oru Chiri",
										"Instagraamam","Police Files","Marimayam","Uppum Mulakum","Karikku",
										"Samarthya Shastram","Manorathangal","Indu","Pharma","Lal Salaam",
										"College Days","Call Me Dad","Ladies Room","Pranayini","Anuragam",
										"Comedy Utsavam","Fast Furious Mal","Family Stories","Kairali Series","Flowers Series"};
        
    public static void main(String args[]) {

        // Method initialization
        getKannadaSeries();
        getEnglishSeries();
        getTeluguSeries();
        getHindiSeries();
        getTamilSeries();
        getMalayalamSeries();
    }

    // Method declarations

    static void getKannadaSeries() {
        System.out.println("\nAvailable Kannada Series:");
        for(String series : kannadaSeries) {
            System.out.println(series);
        }
    }

    static void getEnglishSeries() {
        System.out.println("\nAvailable English Series:");
        for(String series : englishSeries) {
            System.out.println(series);
        }
    }

    static void getTeluguSeries() {
        System.out.println("\nAvailable Telugu Series:");
        for(String series : teluguSeries) {
            System.out.println(series);
        }
    }

    static void getHindiSeries() {
        System.out.println("\nAvailable Hindi Series:");
        for(String series : hindiSeries) {
            System.out.println(series);
        }
    }

    static void getTamilSeries() {
        System.out.println("\nAvailable Tamil Series:");
        for(String series : tamilSeries) {
            System.out.println(series);
        }
    }

    static void getMalayalamSeries() {
        System.out.println("\nAvailable Malayalam Series:");
        for(String series : malayalamSeries) {
            System.out.println(series);
        }
    }
}