class PodcastExecutor{

 public static void main(String[] args){

  Podcast p1=new Podcast();
  Guest g1=new Guest();

  p1.podcastId=1;
  p1.podcastName="TechTalk";
  p1.category="Technology";
  p1.totalEpisodes=120;
  p1.guest=g1;
  g1.guestId=101;
  g1.guestName="Elon";
  g1.profession="Entrepreneur";
  g1.age=52;
  g1.isFamous=true;
  p1.getPodcastDetails();

  Podcast p2=new Podcast();
  Guest g2=new Guest();

  p2.podcastId=2;
  p2.podcastName="HealthCast";
  p2.category="Health";
  p2.totalEpisodes=80;
  p2.guest=g2;
  g2.guestId=102;
  g2.guestName="Deepika";
  g2.profession="Doctor";
  g2.age=40;
  g2.isFamous=true;
  p2.getPodcastDetails();

  Podcast p3=new Podcast();
  Guest g3=new Guest();

  p3.podcastId=3;
  p3.podcastName="StartupStories";
  p3.category="Business";
  p3.totalEpisodes=60;
  p3.guest=g3;
  g3.guestId=103;
  g3.guestName="Ritesh";
  g3.profession="CEO";
  g3.age=38;
  g3.isFamous=true;
  p3.getPodcastDetails();

  Podcast p4=new Podcast();
  Guest g4=new Guest();

  p4.podcastId=4;
  p4.podcastName="FitnessTalk";
  p4.category="Fitness";
  p4.totalEpisodes=95;
  p4.guest=g4;
  g4.guestId=104;
  g4.guestName="Rahul";
  g4.profession="Trainer";
  g4.age=35;
  g4.isFamous=true;
  p4.getPodcastDetails();

  Podcast p5=new Podcast();
  Guest g5=new Guest();

  p5.podcastId=5;
  p5.podcastName="MovieBuzz";
  p5.category="Entertainment";
  p5.totalEpisodes=140;
  p5.guest=g5;
  g5.guestId=105;
  g5.guestName="Yash";
  g5.profession="Actor";
  g5.age=38;
  g5.isFamous=true;
  p5.getPodcastDetails();

  Podcast p6=new Podcast();
  Guest g6=new Guest();

  p6.podcastId=6;
  p6.podcastName="MindTalk";
  p6.category="Motivation";
  p6.totalEpisodes=70;
  p6.guest=g6;
  g6.guestId=106;
  g6.guestName="Sandeep";
  g6.profession="Speaker";
  g6.age=45;
  g6.isFamous=true;

  p6.getPodcastDetails();

  Podcast p7=new Podcast();
  Guest g7=new Guest();

  p7.podcastId=7;
  p7.podcastName="FinanceGuru";
  p7.category="Finance";
  p7.totalEpisodes=110;
  p7.guest=g7;
  g7.guestId=107;
  g7.guestName="Rakesh";
  g7.profession="Investor";
  g7.age=50;
  g7.isFamous=true;
  p7.getPodcastDetails();

  Podcast p8=new Podcast();
  Guest g8=new Guest();

  p8.podcastId=8;
  p8.podcastName="FoodStories";
  p8.category="Cooking";
  p8.totalEpisodes=55;
  p8.guest=g8;
  g8.guestId=108;
  g8.guestName="Sanjeev";
  g8.profession="Chef";
  g8.age=59;
  g8.isFamous=true;
  p8.getPodcastDetails();

  Podcast p9=new Podcast();
  Guest g9=new Guest();

  p9.podcastId=9;
  p9.podcastName="TravelTime";
  p9.category="Travel";
  p9.totalEpisodes=45;
  p9.guest=g9;
  g9.guestId=109;
  g9.guestName="Ankit";
  g9.profession="Traveler";
  g9.age=32;
  g9.isFamous=true;
  p9.getPodcastDetails();

  Podcast p10=new Podcast();
  Guest g10=new Guest();

  p10.podcastId=10;
  p10.podcastName="CodingTalk";
  p10.category="Programming";
  p10.totalEpisodes=130;
  p10.guest=g10;
  g10.guestId=110;
  g10.guestName="James";
  g10.profession="Developer";
  g10.age=36;
  g10.isFamous=true;

  p10.getPodcastDetails();

  Podcast p11=new Podcast();
  Guest g11=new Guest();

  p11.podcastId=11;
  p11.podcastName="CareerGuide";
  p11.category="Education";
  p11.totalEpisodes=65;
  p11.guest=g11;
  g11.guestId=111;
  g11.guestName="Priya";
  g11.profession="Mentor";
  g11.age=34;
  g11.isFamous=true;
  p11.getPodcastDetails();

  Podcast p12=new Podcast();
  Guest g12=new Guest();

  p12.podcastId=12;
  p12.podcastName="ScienceToday";
  p12.category="Science";
  p12.totalEpisodes=75;
  p12.guest=g12;
  g12.guestId=112;
  g12.guestName="Abdul";
  g12.profession="Scientist";
  g12.age=60;
  g12.isFamous=true;

  p12.getPodcastDetails();

  Podcast p13=new Podcast();
  Guest g13=new Guest();

  p13.podcastId=13;
  p13.podcastName="HistoryTime";
  p13.category="History";
  p13.totalEpisodes=40;
  p13.guest=g13;
  g13.guestId=113;
  g13.guestName="Ravi";
  g13.profession="Historian";
  g13.age=48;
  g13.isFamous=true;
  p13.getPodcastDetails();

  Podcast p14=new Podcast();
  Guest g14=new Guest();

  p14.podcastId=14;
  p14.podcastName="SpiritualTalk";
  p14.category="Spiritual";
  p14.totalEpisodes=90;
  p14.guest=g14;
  g14.guestId=114;
  g14.guestName="Sadhguru";
  g14.profession="Guru";
  g14.age=67;
  g14.isFamous=true;
  p14.getPodcastDetails();

  Podcast p15=new Podcast();
  Guest g15=new Guest();

  p15.podcastId=15;
  p15.podcastName="DesignWorld";
  p15.category="Design";
  p15.totalEpisodes=35;
  p15.guest=g15;
  g15.guestId=115;
  g15.guestName="Neha";
  g15.profession="Designer";
  g15.age=29;
  g15.isFamous=true;
  p15.getPodcastDetails();

  Podcast p16=new Podcast();
  Guest g16=new Guest();

  p16.podcastId=16;
  p16.podcastName="SportsTalk";
  p16.category="Sports";
  p16.totalEpisodes=105;
  p16.guest=g16;
  g16.guestId=116;
  g16.guestName="Virat";
  g16.profession="Cricketer";
  g16.age=36;
  g16.isFamous=true;
  p16.getPodcastDetails();

  Podcast p17=new Podcast();
  Guest g17=new Guest();

  p17.podcastId=17;
  p17.podcastName="StartupTalk";
  p17.category="Business";
  p17.totalEpisodes=58;
  p17.guest=g17;
  g17.guestId=117;
  g17.guestName="Narayana";
  g17.profession="Entrepreneur";
  g17.age=70;
  g17.isFamous=true;
  p17.getPodcastDetails();

  Podcast p18=new Podcast();
  Guest g18=new Guest();

  p18.podcastId=18;
  p18.podcastName="AIWorld";
  p18.category="AI";
  p18.totalEpisodes=48;
  p18.guest=g18;
  g18.guestId=118;
  g18.guestName="Sam";
  g18.profession="Researcher";
  g18.age=39;
  g18.isFamous=true;
  p18.getPodcastDetails();

  Podcast p19=new Podcast();
  Guest g19=new Guest();

  p19.podcastId=19;
  p19.podcastName="MusicTime";
  p19.category="Music";
  p19.totalEpisodes=100;
  p19.guest=g19;
  g19.guestId=119;
  g19.guestName="Arijit";
  g19.profession="Singer";
  g19.age=37;
  g19.isFamous=true;
  p19.getPodcastDetails();
  
  Podcast p20=new Podcast();
  Guest g20=new Guest();

  p20.podcastId=20;
  p20.podcastName="SuccessStories";
  p20.category="Motivation";
  p20.totalEpisodes=150;
  p20.guest=g20;
  g20.guestId=120;
  g20.guestName="Sudha";
  g20.profession="Author";
  g20.age=73;
  g20.isFamous=true;
  p20.getPodcastDetails();

 }
}