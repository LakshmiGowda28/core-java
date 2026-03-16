class AmazonPrime {

    static String kannadaWebSeries[] = {"Naa Kanda Vishnu","Naa Kanda Puttanna Kanagal","Naa Kanda Ambi","Naa Kanda Vajramuni","Naa Kanda Rajkumar",
										"Humble Politician Nograj","Suzhal The Vortex","Suzhal Season 2","Killers Of The Cosmos","Murder in the Hills",
										"Kavaludaari","Nathicharami","ACT 1978","Gubbi Mele Brahmastra","Kariya",
										"Mysore Masala","Raa Ra","Gultoo","Dare to Dream","Kannada Chronicles",
										"Moorane Krishnappa","Maaman","Dhandoraa","Bank of Bhagyalakshmi","Vaamana",
										"Urvi","Classic Stories","Kannada Shorts","Crime Files Kannada","Village Drama"};
        

    static String teluguWebSeries[] = { "The Family Man","Gullak","Mirzapur","Panchayat","Bandish Bandits",
										"Breathe","Four More Shots","Aspirants","Modern Love Hyderabad","CommitMental",
										"Gods of Dharmapuri","City of Dreams","Asur","Bestseller","Made in Heaven",
										"Paatal Lok","Jubilee","Metro Park","Inside Edge","Hostages",
										"Aarya","The Last Hour","Sunflower","Mirzapur Season 2","Gullak Season 2",
										"Bandish Bandits 2","The Gone Game","Breathe Season 2","Farzi","The Night Manager"};
       

    static String hindiWebSeries[] = {"Mirzapur","The Family Man","Paatal Lok","Made in Heaven","Inside Edge",
										"Breathe","Panchayat","Four More Shots Please","The Forgotten Army","Bandish Bandits",
										"Bard of Blood","Tandav","Gullak","The Boys","Comicstaan",
										"The Wheel of Time","The Last Hour","Farzi","Jubilee","The Night Manager",
										"Blackbird","Panchayat Season 2","The Family Man Season 3","City of Dreams","Made in Heaven 2",
										"Hostages 2","Aarya 2","Inside Edge 2","Mirzapur 3","Gullak 3"};
        

    static String englishWebSeries[] = {"The Boys","Jack Ryan","The Man in the High Castle","Fleabag","The Marvelous Mrs Maisel",
										"Good Omens","Hanna","Bosch","Reacher","The Expanse",
										"Goliath","Transparent","Hunters","Homecoming","Upload",
										"The Peripheral","Sneaky Pete","Carnival Row","Modern Love","The Wheel of Time",
										"The Grand Tour","Paper Girls","The Rings of Power","The Power","The Rig",
										"Citadel","Bosch Legacy","Reacher Season 2","Jack Ryan Season 2","Upload Season 2" };
        

    static String tamilWebSeries[] = {"Tsurune","Dororo","Tokyo Ghoul","Alice in Borderland","Attack on Titan",
										"Vinland Saga","Erased","Beastars","Great Pretender","Parasyte",
										"Samurai Champloo","Cowboy Bebop","Ajin","Godzilla","Your Lie in April",
										"March Comes in Like a Lion","Kabaneri","Ergo Proxy","Psycho Pass","Monster",
										"Fullmetal Alchemist","Death Note","Steins Gate","Gintama","Neon Genesis Evangelion",
										"Blade of the Immortal","Blade Runner Black Out","The Forest of Love","Shoplifters","Parasyte Live Action"};
        

    static String malWebSeries[] = {"Pachinko","The Glory","Marry My Husband","Our Blues","The Night Agent",
									"Familiar Wife","My Mister","Prison Playbook","The Silent Sea","Kingdom",
									"Vincenzo","The Good Bad Mother","The Veil","Signal","Crash Landing on You",
									"Mr Sunshine","Train to Busan","Night in Paradise","Sweet Home","My Name",
									"Itaewon Class","Love Alarm","Reply 1988","Hospital Playlist","Sisyphus The Myth",
									"Snowdrop","Alchemy of Souls","The Outlaws","The Glory Season 2","Kingdom Season 2"};
        

    public static void main(String args[]) {
        getKannadaWebSeries();
        getTeluguWebSeries();
        getHindiWebSeries();
        getEnglishWebSeries();
        getTamilWebSeries();
        getMalWebSeries();
    }

    static void getKannadaWebSeries() {
        System.out.println("\nAvailable Kannada Web Series:");
        for(String series : kannadaWebSeries) {
            System.out.println(series);
        }
    }

    static void getTeluguWebSeries() {
        System.out.println("\nAvailable Telugu Web Series:");
        for(String series : teluguWebSeries) {
            System.out.println(series);
        }
    }

    static void getHindiWebSeries() {
        System.out.println("\nAvailable Hindi Web Series:");
        for(String series : hindiWebSeries) {
            System.out.println(series);
        }
    }

    static void getEnglishWebSeries() {
        System.out.println("\nAvailable English Web Series:");
        for(String series : englishWebSeries) {
            System.out.println(series);
        }
    }

    static void getTamilWebSeries() {
        System.out.println("\nAvailable Tamil Web Series:");
        for(String series : tamilWebSeries) {
            System.out.println(series);
        }
    }

    static void getMalWebSeries() {
        System.out.println("\nAvailable Malyalam Web Series:");
        for(String series : malWebSeries) {
            System.out.println(series);
        }
    }
}