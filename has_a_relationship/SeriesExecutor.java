class SeriesExecutor{

 public static void main(String[] args){

  Series s1=new Series();
  Episode e1=new Episode();

  s1.seriesId=1;
  s1.seriesName="Stranger Things";
  s1.genre="SciFi";
  s1.totalSeasons=4;
  s1.episode=e1;
  e1.episodeId=101;
  e1.episodeTitle="Chapter One";
  e1.durationMinutes=50;
  e1.episodeNumber=1;
  e1.isHit=true;
  s1.getSeriesDetails();

  Series s2=new Series();
  Episode e2=new Episode();

  s2.seriesId=2;
  s2.seriesName="Money Heist";
  s2.genre="Thriller";
  s2.totalSeasons=5;
  s2.episode=e2;
  e2.episodeId=102;
  e2.episodeTitle="The Professor";
  e2.durationMinutes=48;
  e2.episodeNumber=1;
  e2.isHit=true;
  s2.getSeriesDetails();

  Series s3=new Series();
  Episode e3=new Episode();

  s3.seriesId=3;
  s3.seriesName="Friends";
  s3.genre="Comedy";
  s3.totalSeasons=10;
  s3.episode=e3;
  e3.episodeId=103;
  e3.episodeTitle="Pilot";
  e3.durationMinutes=22;
  e3.episodeNumber=1;
  e3.isHit=true;
  s3.getSeriesDetails();

  Series s4=new Series();
  Episode e4=new Episode();

  s4.seriesId=4;
  s4.seriesName="Breaking Bad";
  s4.genre="Crime";
  s4.totalSeasons=5;
  s4.episode=e4;
  e4.episodeId=104;
  e4.episodeTitle="Chemistry";
  e4.durationMinutes=55;
  e4.episodeNumber=1;
  e4.isHit=true;
  s4.getSeriesDetails();

  Series s5=new Series();
  Episode e5=new Episode();

  s5.seriesId=5;
  s5.seriesName="Dark";
  s5.genre="Mystery";
  s5.totalSeasons=3;
  s5.episode=e5;
  e5.episodeId=105;
  e5.episodeTitle="Beginnings";
  e5.durationMinutes=52;
  e5.episodeNumber=1;
  e5.isHit=true;
  s5.getSeriesDetails();

  Series s6=new Series();
  Episode e6=new Episode();

  s6.seriesId=6;
  s6.seriesName="Vikings";
  s6.genre="History";
  s6.totalSeasons=6;
  s6.episode=e6;
  e6.episodeId=106;
  e6.episodeTitle="Ragnar";
  e6.durationMinutes=44;
  e6.episodeNumber=1;
  e6.isHit=true;
  s6.getSeriesDetails();

  Series s7=new Series();
  Episode e7=new Episode();

  s7.seriesId=7;
  s7.seriesName="Lucifer";
  s7.genre="Fantasy";
  s7.totalSeasons=6;
  s7.episode=e7;
  e7.episodeId=107;
  e7.episodeTitle="Devil";
  e7.durationMinutes=45;
  e7.episodeNumber=1;
  e7.isHit=true;
  s7.getSeriesDetails();

  Series s8=new Series();
  Episode e8=new Episode();

  s8.seriesId=8;
  s8.seriesName="Wednesday";
  s8.genre="Comedy";
  s8.totalSeasons=1;
  s8.episode=e8;
  e8.episodeId=108;
  e8.episodeTitle="Wednesday Child";
  e8.durationMinutes=49;
  e8.episodeNumber=1;
  e8.isHit=true;
  s8.getSeriesDetails();

  Series s9=new Series();
  Episode e9=new Episode();

  s9.seriesId=9;
  s9.seriesName="Game of Thrones";
  s9.genre="Fantasy";
  s9.totalSeasons=8;
  s9.episode=e9;
  e9.episodeId=109;
  e9.episodeTitle="Winter is Coming";
  e9.durationMinutes=60;
  e9.episodeNumber=1;
  e9.isHit=true;
  s9.getSeriesDetails();

  Series s10=new Series();
  Episode e10=new Episode();

  s10.seriesId=10;
  s10.seriesName="The Office";
  s10.genre="Comedy";
  s10.totalSeasons=9;
  s10.episode=e10;
  e10.episodeId=110;
  e10.episodeTitle="Work Day";
  e10.durationMinutes=22;
  e10.episodeNumber=1;
  e10.isHit=true;
  s10.getSeriesDetails();

  Series s11=new Series();
  Episode e11=new Episode();

  s11.seriesId=11;
  s11.seriesName="Sherlock";
  s11.genre="Detective";
  s11.totalSeasons=4;
  s11.episode=e11;
  e11.episodeId=111;
  e11.episodeTitle="Study in Pink";
  e11.durationMinutes=88;
  e11.episodeNumber=1;
  e11.isHit=true;
  s11.getSeriesDetails();

  Series s12=new Series();
  Episode e12=new Episode();

  s12.seriesId=12;
  s12.seriesName="Peaky Blinders";
  s12.genre="Crime";
  s12.totalSeasons=6;
  s12.episode=e12;
  e12.episodeId=112;
  e12.episodeTitle="Thomas Shelby";
  e12.durationMinutes=58;
  e12.episodeNumber=1;
  e12.isHit=true;

  s12.getSeriesDetails();

  Series s13=new Series();
  Episode e13=new Episode();

  s13.seriesId=13;
  s13.seriesName="Narcos";
  s13.genre="Crime";
  s13.totalSeasons=3;
  s13.episode=e13;
  e13.episodeId=113;
  e13.episodeTitle="Pablo";
  e13.durationMinutes=49;
  e13.episodeNumber=1;
  e13.isHit=true;
  s13.getSeriesDetails();

  Series s14=new Series();
  Episode e14=new Episode();

  s14.seriesId=14;
  s14.seriesName="Manifest";
  s14.genre="Drama";
  s14.totalSeasons=4;
  s14.episode=e14;
  e14.episodeId=114;
  e14.episodeTitle="Flight 828";
  e14.durationMinutes=47;
  e14.episodeNumber=1;
  e14.isHit=true;
  s14.getSeriesDetails();

  Series s15=new Series();
  Episode e15=new Episode();

  s15.seriesId=15;
  s15.seriesName="Black Mirror";
  s15.genre="SciFi";
  s15.totalSeasons=6;
  s15.episode=e15;
  e15.episodeId=115;
  e15.episodeTitle="Technology";
  e15.durationMinutes=60;
  e15.episodeNumber=1;
  e15.isHit=true;
  s15.getSeriesDetails();

  Series s16=new Series();
  Episode e16=new Episode();

  s16.seriesId=16;
  s16.seriesName="Suits";
  s16.genre="Drama";
  s16.totalSeasons=9;
  s16.episode=e16;
  e16.episodeId=116;
  e16.episodeTitle="Law";
  e16.durationMinutes=42;
  e16.episodeNumber=1;
  e16.isHit=true;
  s16.getSeriesDetails();

  Series s17=new Series();
  Episode e17=new Episode();

  s17.seriesId=17;
  s17.seriesName="Loki";
  s17.genre="Marvel";
  s17.totalSeasons=2;
  s17.episode=e17;
  e17.episodeId=117;
  e17.episodeTitle="Time";
  e17.durationMinutes=51;
  e17.episodeNumber=1;
  e17.isHit=true;
  s17.getSeriesDetails();

  Series s18=new Series();
  Episode e18=new Episode();

  s18.seriesId=18;
  s18.seriesName="Flash";
  s18.genre="Superhero";
  s18.totalSeasons=9;
  s18.episode=e18;
  e18.episodeId=118;
  e18.episodeTitle="Speed";
  e18.durationMinutes=43;
  e18.episodeNumber=1;
  e18.isHit=true;
  s18.getSeriesDetails();

  Series s19=new Series();
  Episode e19=new Episode();

  s19.seriesId=19;
  s19.seriesName="Arrow";
  s19.genre="Action";
  s19.totalSeasons=8;
  s19.episode=e19;
  e19.episodeId=119;
  e19.episodeTitle="Green Arrow";
  e19.durationMinutes=44;
  e19.episodeNumber=1;
  e19.isHit=true;
  s19.getSeriesDetails();

  Series s20=new Series();
  Episode e20=new Episode();

  s20.seriesId=20;
  s20.seriesName="Mirzapur";
  s20.genre="Crime";
  s20.totalSeasons=3;
  s20.episode=e20;
  e20.episodeId=120;
  e20.episodeTitle="Kaleen Bhaiya";
  e20.durationMinutes=50;
  e20.episodeNumber=1;
  e20.isHit=true;

  s20.getSeriesDetails();

 }
}