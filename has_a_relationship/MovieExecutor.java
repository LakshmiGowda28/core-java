class MovieExecutor{

 public static void main(String[] args){

  Movie m1=new Movie();
  Actor a1=new Actor();

  m1.movieId=1;
  m1.movieName="KGF";
  m1.language="Kannada";
  m1.budget=80000000;
  m1.actor=a1;
  a1.actorId=101;
  a1.actorName="Yash";
  a1.age=38;
  a1.experienceYears=15;
  a1.isAwardWinner=true;
  m1.getMovieDetails();

  Movie m2=new Movie();
  Actor a2=new Actor();

  m2.movieId=2;
  m2.movieName="RRR";
  m2.language="Telugu";
  m2.budget=150000000;
  m2.actor=a2;
  a2.actorId=102;
  a2.actorName="RamCharan";
  a2.age=39;
  a2.experienceYears=18;
  a2.isAwardWinner=true;
  m2.getMovieDetails();

  Movie m3=new Movie();
  Actor a3=new Actor();
  m3.movieId=3;
  m3.movieName="Jailer";
  m3.language="Tamil";
  m3.budget=90000000;
  m3.actor=a3;
  a3.actorId=103;
  a3.actorName="Rajinikanth";
  a3.age=72;
  a3.experienceYears=45;
  a3.isAwardWinner=true;
  m3.getMovieDetails();

  Movie m4=new Movie();
  Actor a4=new Actor();

  m4.movieId=4;
  m4.movieName="Pushpa";
  m4.language="Telugu";
  m4.budget=85000000;
  m4.actor=a4;
  a4.actorId=104;
  a4.actorName="AlluArjun";
  a4.age=41;
  a4.experienceYears=20;
  a4.isAwardWinner=true;
  m4.getMovieDetails();

  Movie m5=new Movie();
  Actor a5=new Actor();
  m5.movieId=5;
  m5.movieName="Leo";
  m5.language="Tamil";
  m5.budget=100000000;
  m5.actor=a5;
  a5.actorId=105;
  a5.actorName="Vijay";
  a5.age=49;
  a5.experienceYears=28;
  a5.isAwardWinner=true;
  m5.getMovieDetails();

  Movie m6=new Movie();
  Actor a6=new Actor();
  m6.movieId=6;
  m6.movieName="Bahubali";
  m6.language="Telugu";
  m6.budget=120000000;
  m6.actor=a6;
  a6.actorId=106;
  a6.actorName="Prabhas";
  a6.age=44;
  a6.experienceYears=21;
  a6.isAwardWinner=true;
  m6.getMovieDetails();

  Movie m7=new Movie();
  Actor a7=new Actor();

  m7.movieId=7;
  m7.movieName="Kantara";
  m7.language="Kannada";
  m7.budget=16000000;
  m7.actor=a7;
  a7.actorId=107;
  a7.actorName="RishabShetty";
  a7.age=40;
  a7.experienceYears=12;
  a7.isAwardWinner=true;
  m7.getMovieDetails();

  Movie m8=new Movie();
  Actor a8=new Actor();
  m8.movieId=8;
  m8.movieName="Master";
  m8.language="Tamil";
  m8.budget=95000000;
  m8.actor=a8;
  a8.actorId=108;
  a8.actorName="Vijay";
  a8.age=49;
  a8.experienceYears=28;
  a8.isAwardWinner=true;
  m8.getMovieDetails();

  Movie m9=new Movie();
  Actor a9=new Actor();
  m9.movieId=9;
  m9.movieName="Salar";
  m9.language="Telugu";
  m9.budget=140000000;
  m9.actor=a9;
  a9.actorId=109;
  a9.actorName="Prabhas";
  a9.age=44;
  a9.experienceYears=21;
  a9.isAwardWinner=true;
  m9.getMovieDetails();

  Movie m10=new Movie();
  Actor a10=new Actor();

  m10.movieId=10;
  m10.movieName="Vikram";
  m10.language="Tamil";
  m10.budget=70000000;
  m10.actor=a10;
  a10.actorId=110;
  a10.actorName="KamalHaasan";
  a10.age=69;
  a10.experienceYears=50;
  a10.isAwardWinner=true;
  m10.getMovieDetails();

  Movie m11=new Movie();
  Actor a11=new Actor();

  m11.movieId=11;
  m11.movieName="Drishyam";
  m11.language="Malayalam";
  m11.budget=20000000;
  m11.actor=a11;
  a11.actorId=111;
  a11.actorName="Mohanlal";
  a11.age=64;
  a11.experienceYears=40;
  a11.isAwardWinner=true;
  m11.getMovieDetails();
  Movie m12=new Movie();
  Actor a12=new Actor();

  m12.movieId=12;
  m12.movieName="War";
  m12.language="Hindi";
  m12.budget=150000000;
  m12.actor=a12;
  a12.actorId=112;
  a12.actorName="Hrithik";
  a12.age=50;
  a12.experienceYears=25;
  a12.isAwardWinner=true;

  m12.getMovieDetails();

  Movie m13=new Movie();
  Actor a13=new Actor();

  m13.movieId=13;
  m13.movieName="Dangal";
  m13.language="Hindi";
  m13.budget=70000000;
  m13.actor=a13;
  a13.actorId=113;
  a13.actorName="Aamir";
  a13.age=59;
  a13.experienceYears=35;
  a13.isAwardWinner=true;

  m13.getMovieDetails();

  Movie m14=new Movie();
  Actor a14=new Actor();

  m14.movieId=14;
  m14.movieName="Pathaan";
  m14.language="Hindi";
  m14.budget=180000000;
  m14.actor=a14;
  a14.actorId=114;
  a14.actorName="Shahrukh";
  a14.age=58;
  a14.experienceYears=32;
  a14.isAwardWinner=true;

  m14.getMovieDetails();

  Movie m15=new Movie();
  Actor a15=new Actor();

  m15.movieId=15;
  m15.movieName="Animal";
  m15.language="Hindi";
  m15.budget=100000000;
  m15.actor=a15;
  a15.actorId=115;
  a15.actorName="Ranbir";
  a15.age=42;
  a15.experienceYears=18;
  a15.isAwardWinner=true;
  m15.getMovieDetails();

  Movie m16=new Movie();
  Actor a16=new Actor();

  m16.movieId=16;
  m16.movieName="KGF2";
  m16.language="Kannada";
  m16.budget=100000000;
  m16.actor=a16;
  a16.actorId=116;
  a16.actorName="Yash";
  a16.age=38;
  a16.experienceYears=15;
  a16.isAwardWinner=true;
  m16.getMovieDetails();

  Movie m17=new Movie();
  Actor a17=new Actor();

  m17.movieId=17;
  m17.movieName="Kushi";
  m17.language="Telugu";
  m17.budget=50000000;
  m17.actor=a17;
  a17.actorId=117;
  a17.actorName="VijayDevarakonda";
  a17.age=35;
  a17.experienceYears=12;
  a17.isAwardWinner=true;
  m17.getMovieDetails();

  Movie m18=new Movie();
  Actor a18=new Actor();

  m18.movieId=18;
  m18.movieName="SitaRamam";
  m18.language="Telugu";
  m18.budget=30000000;
  m18.actor=a18;
  a18.actorId=118;
  a18.actorName="Dulquer";
  a18.age=38;
  a18.experienceYears=13;
  a18.isAwardWinner=true;

  m18.getMovieDetails();

  Movie m19=new Movie();
  Actor a19=new Actor();
  m19.movieId=19;
  m19.movieName="Jawan";
  m19.language="Hindi";
  m19.budget=160000000;
  m19.actor=a19;
  a19.actorId=119;
  a19.actorName="Shahrukh";
  a19.age=58;
  a19.experienceYears=32;
  a19.isAwardWinner=true;

  m19.getMovieDetails();

  Movie m20=new Movie();
  Actor a20=new Actor();

  m20.movieId=20;
  m20.movieName="Tiger3";
  m20.language="Hindi";
  m20.budget=200000000;
  m20.actor=a20;
  a20.actorId=120;
  a20.actorName="Salman";
  a20.age=59;
  a20.experienceYears=34;
  a20.isAwardWinner=true;
  m20.getMovieDetails();
 }
}