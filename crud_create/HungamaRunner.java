class HungamaRunner {

    public static void main(String[] args) {

        Hungama h = new Hungama();

        boolean added = h.addShow("Doraemon");
        System.out.println(added);

        added = h.addShow("Shinchan");
        System.out.println(added);

        added = h.addShow("Pokemon");
        System.out.println(added);

        added = h.addShow("Oggy and the Cockroaches");
        System.out.println(added);

        added = h.addShow("Ninja Hattori");
        System.out.println(added);

        added = h.addShow("Perman");
        System.out.println(added);
		
		 added = h.addShow("Beyblade Burst");
        System.out.println(added);

        added = h.addShow("Kiteretsu");
        System.out.println(added);

        added = h.addShow("Kochikame");
        System.out.println(added);

        added = h.addShow("Roll No 21");
        System.out.println(added);

        added = h.addShow("Motu Patlu");
        System.out.println(added);
		
		 added = h.addShow("Little Singham");
        System.out.println(added);

        added = h.addShow("Pakdam Pakdai");
        System.out.println(added);
		
		 added = h.addShow("Tom & Jerry");
        System.out.println(added);


        h.getShows();
    }
}