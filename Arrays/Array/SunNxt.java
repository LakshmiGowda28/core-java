class SunNxt{

    static String kannadaShortMovies[] = {"Loose Connection","Arishadvarga","Malgudi Days Short","Bypass Road Kannada","The Last Note",
											"Room No 306","Cycle","Silent Night Kannada","The Promise Kannada","Behind the Door",
											"Shadow Game","Broken Dreams","Unknown Face","Street Light","Dark Room",
											"Red Signal","The Visitor","Empty Road","Final Call","Secret Letter",
											"Blind Date Kannada","Lost Signal","The Rain Story","Mirror Image","Hidden Truth",
											"Midnight Call","The Escape Kannada","Hope","Second Chance","Last Breath"};

        
    static String teluguShortMovies[] = {"Kshanam Short","Love at First Sight","Silent Love","The Proposal Telugu","Dark Night",
										"Anukokunda","Mouna Ragam Short","The Promise Telugu","Blind Love","Empty Heart",
										"Room No 13","Shadow Telugu","Rain Story Telugu","Unknown Call","Final Day",
										"Secret Love","Broken Heart","Lost Boy","Mirror Life","Hidden Tears",
										"Last Message","Unexpected","Second Life","Street Story","Midnight Telugu",
										"Red Rose","The Escape Telugu","Hope Telugu","Silent Cry","New Beginning"};
        

    static String tamilShortMovies[] = {"Aval Short","Dark Room Tamil","The Promise Tamil","Silent Love Tamil","Unknown Path",
										"Rain Drops","Broken Dreams Tamil","Hidden Face","Street Light Tamil","Final Call Tamil",
										"Blind Date Tamil","Lost Story","Mirror Image Tamil","Secret Letter Tamil","Last Night",
										"Hope Tamil","Second Chance Tamil","Empty Road Tamil","Red Signal Tamil","Shadow Tamil",
										"Unexpected Tamil","New Life","The Escape Tamil","Unknown Girl","Silent Cry Tamil",
										"Behind Door Tamil","Final Message","Lost Time","Broken Promise","Midnight Tamil"};
        

    static String englishShortMovies[] = { "The Last Call","Broken Silence","Unknown Visitor","Final Message","Midnight Escape",
											"Lost in Time","The Secret Room","Blind Date","Dark Street","Empty House",
											"The Promise","Shadow Game","Hidden Truth","Second Chance","Last Breath",
											"The Visitor","Unknown Face","Silent Cry","Mirror Life","Hope",
											"Red Signal","Street Light","Behind the Door","Final Day","Lost Signal",
											"Unexpected","New Beginning","The Rain Story","Secret Letter","Broken Heart"};
       

    static String hindiDrama[] = { "Goblin","Crash Landing on You","Descendants of the Sun","Vincenzo","Itaewon Class",
									"Hotel Del Luna","The King Eternal Monarch","Healer","The Glory","Start Up",
									"My Love from the Star","While You Were Sleeping","Business Proposal","Hometown Cha Cha Cha","Signal",
									"Mouse","Extraordinary Attorney Woo","Sweet Home","All of Us Are Dead","Kingdom",
									"True Beauty","Penthouse","Sky Castle","The Heirs","Reply 1988",
									"My Mister","Flower of Evil","Weightlifting Fairy","Hospital Playlist","Alchemy of Souls"};
       

    static String malDrama[] = { "Alice in Borderland","Good Morning Call","Erased","Midnight Diner","Followers",
										"Terrace House","The Naked Director","Giri Haji","Switched","Atelier",
										"Million Yen Women","Love Lasts Forever","Hana Yori Dango","Death Note Drama","Liar Game",
										"Nodame Cantabile","Rich Man Poor Woman","Code Blue","Unnatural","1 Litre of Tears",
										"Mother","Legal High","Hero","Signal Japan","Tokyo Love Story",
										"Orange Days","Great Teacher Onizuka","Bloody Monday","My Boss My Hero","Dragon Zakura"};
   
    public static void main(String args[]) {

        getKannadaShortMovies();
        getTeluguShortMovies();
        getTamilShortMovies();
        getEnglishShortMovies();
        getHindiDrama();
        getMalDrama();
    }


    static void getKannadaShortMovies() {
        System.out.println("\nAvailable Kannada Short Movies:");
        for(String movie : kannadaShortMovies) {
            System.out.println(movie);
        }
    }

    static void getTeluguShortMovies() {
        System.out.println("\nAvailable Telugu Short Movies:");
        for(String movie : teluguShortMovies) {
            System.out.println(movie);
        }
    }

    static void getTamilShortMovies() {
        System.out.println("\nAvailable Tamil Short Movies:");
        for(String movie : tamilShortMovies) {
            System.out.println(movie);
        }
    }

    static void getEnglishShortMovies() {
        System.out.println("\nAvailable English Short Movies:");
        for(String movie : englishShortMovies) {
            System.out.println(movie);
        }
    }

    static void getHindiDrama() {
        System.out.println("\nAvailable Hindi Drama:");
        for(String drama : hindiDrama) {
            System.out.println(drama);
        }
    }

    static void getMalDrama() {
        System.out.println("\nAvailable Malyalam Drama:");
        for(String drama : malDrama) {
            System.out.println(drama);
        }
    }
}