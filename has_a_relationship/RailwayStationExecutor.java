class RailwayStationExecutor{

 public static void main(String[] args){

  RailwayStation r1=new RailwayStation();
  Platform p1=new Platform();

  r1.stationId=1;
  r1.stationName="Majestic";
  r1.location="Bangalore";
  r1.numberOfTrains=120;

  r1.platform=p1;
  p1.platformId=101;
  p1.platformNumber=1;
  p1.capacity=500;
  p1.type="Express";
  p1.isActive=true;

  r1.getStationDetails();



  RailwayStation r2=new RailwayStation();
  Platform p2=new Platform();

  r2.stationId=2;
  r2.stationName="Yesvantpur";
  r2.location="Bangalore";
  r2.numberOfTrains=90;

  r2.platform=p2;
  p2.platformId=102;
  p2.platformNumber=2;
  p2.capacity=450;
  p2.type="Passenger";
  p2.isActive=true;

  r2.getStationDetails();



  RailwayStation r3=new RailwayStation();
  Platform p3=new Platform();

  r3.stationId=3;
  r3.stationName="KSR";
  r3.location="Bangalore";
  r3.numberOfTrains=130;

  r3.platform=p3;
  p3.platformId=103;
  p3.platformNumber=3;
  p3.capacity=600;
  p3.type="Express";
  p3.isActive=true;

  r3.getStationDetails();



  RailwayStation r4=new RailwayStation();
  Platform p4=new Platform();

  r4.stationId=4;
  r4.stationName="Mysore";
  r4.location="Mysore";
  r4.numberOfTrains=80;

  r4.platform=p4;
  p4.platformId=104;
  p4.platformNumber=4;
  p4.capacity=400;
  p4.type="Passenger";
  p4.isActive=true;

  r4.getStationDetails();



  RailwayStation r5=new RailwayStation();
  Platform p5=new Platform();

  r5.stationId=5;
  r5.stationName="Hubli";
  r5.location="Hubli";
  r5.numberOfTrains=70;

  r5.platform=p5;
  p5.platformId=105;
  p5.platformNumber=5;
  p5.capacity=350;
  p5.type="Express";
  p5.isActive=true;

  r5.getStationDetails();



  RailwayStation r6=new RailwayStation();
  Platform p6=new Platform();

  r6.stationId=6;
  r6.stationName="Tumkur";
  r6.location="Tumkur";
  r6.numberOfTrains=60;

  r6.platform=p6;
  p6.platformId=106;
  p6.platformNumber=1;
  p6.capacity=300;
  p6.type="Passenger";
  p6.isActive=true;

  r6.getStationDetails();



  RailwayStation r7=new RailwayStation();
  Platform p7=new Platform();

  r7.stationId=7;
  r7.stationName="Chennai";
  r7.location="Chennai";
  r7.numberOfTrains=150;

  r7.platform=p7;
  p7.platformId=107;
  p7.platformNumber=6;
  p7.capacity=700;
  p7.type="Express";
  p7.isActive=true;

  r7.getStationDetails();



  RailwayStation r8=new RailwayStation();
  Platform p8=new Platform();

  r8.stationId=8;
  r8.stationName="Hyderabad";
  r8.location="Hyderabad";
  r8.numberOfTrains=140;

  r8.platform=p8;
  p8.platformId=108;
  p8.platformNumber=7;
  p8.capacity=650;
  p8.type="Express";
  p8.isActive=true;

  r8.getStationDetails();



  RailwayStation r9=new RailwayStation();
  Platform p9=new Platform();

  r9.stationId=9;
  r9.stationName="Pune";
  r9.location="Pune";
  r9.numberOfTrains=110;

  r9.platform=p9;
  p9.platformId=109;
  p9.platformNumber=2;
  p9.capacity=500;
  p9.type="Passenger";
  p9.isActive=true;

  r9.getStationDetails();



  RailwayStation r10=new RailwayStation();
  Platform p10=new Platform();

  r10.stationId=10;
  r10.stationName="Delhi";
  r10.location="Delhi";
  r10.numberOfTrains=200;

  r10.platform=p10;
  p10.platformId=110;
  p10.platformNumber=10;
  p10.capacity=900;
  p10.type="Express";
  p10.isActive=true;

  r10.getStationDetails();



  RailwayStation r11=new RailwayStation();
  Platform p11=new Platform();

  r11.stationId=11;
  r11.stationName="Goa";
  r11.location="Goa";
  r11.numberOfTrains=50;

  r11.platform=p11;
  p11.platformId=111;
  p11.platformNumber=1;
  p11.capacity=250;
  p11.type="Passenger";
  p11.isActive=true;

  r11.getStationDetails();



  RailwayStation r12=new RailwayStation();
  Platform p12=new Platform();

  r12.stationId=12;
  r12.stationName="Udupi";
  r12.location="Udupi";
  r12.numberOfTrains=45;

  r12.platform=p12;
  p12.platformId=112;
  p12.platformNumber=2;
  p12.capacity=260;
  p12.type="Passenger";
  p12.isActive=true;

  r12.getStationDetails();



  RailwayStation r13=new RailwayStation();
  Platform p13=new Platform();

  r13.stationId=13;
  r13.stationName="Belgaum";
  r13.location="Belgaum";
  r13.numberOfTrains=65;

  r13.platform=p13;
  p13.platformId=113;
  p13.platformNumber=3;
  p13.capacity=350;
  p13.type="Express";
  p13.isActive=true;

  r13.getStationDetails();



  RailwayStation r14=new RailwayStation();
  Platform p14=new Platform();

  r14.stationId=14;
  r14.stationName="Nagpur";
  r14.location="Nagpur";
  r14.numberOfTrains=120;

  r14.platform=p14;
  p14.platformId=114;
  p14.platformNumber=4;
  p14.capacity=500;
  p14.type="Express";
  p14.isActive=true;

  r14.getStationDetails();



  RailwayStation r15=new RailwayStation();
  Platform p15=new Platform();

  r15.stationId=15;
  r15.stationName="Surat";
  r15.location="Surat";
  r15.numberOfTrains=100;

  r15.platform=p15;
  p15.platformId=115;
  p15.platformNumber=5;
  p15.capacity=480;
  p15.type="Passenger";
  p15.isActive=true;

  r15.getStationDetails();



  RailwayStation r16=new RailwayStation();
  Platform p16=new Platform();

  r16.stationId=16;
  r16.stationName="Indore";
  r16.location="Indore";
  r16.numberOfTrains=95;

  r16.platform=p16;
  p16.platformId=116;
  p16.platformNumber=6;
  p16.capacity=420;
  p16.type="Express";
  p16.isActive=true;

  r16.getStationDetails();



  RailwayStation r17=new RailwayStation();
  Platform p17=new Platform();

  r17.stationId=17;
  r17.stationName="Jaipur";
  r17.location="Jaipur";
  r17.numberOfTrains=130;

  r17.platform=p17;
  p17.platformId=117;
  p17.platformNumber=7;
  p17.capacity=550;
  p17.type="Express";
  p17.isActive=true;

  r17.getStationDetails();



  RailwayStation r18=new RailwayStation();
  Platform p18=new Platform();

  r18.stationId=18;
  r18.stationName="Patna";
  r18.location="Patna";
  r18.numberOfTrains=105;

  r18.platform=p18;
  p18.platformId=118;
  p18.platformNumber=8;
  p18.capacity=520;
  p18.type="Passenger";
  p18.isActive=true;

  r18.getStationDetails();



  RailwayStation r19=new RailwayStation();
  Platform p19=new Platform();

  r19.stationId=19;
  r19.stationName="Kolkata";
  r19.location="Kolkata";
  r19.numberOfTrains=170;

  r19.platform=p19;
  p19.platformId=119;
  p19.platformNumber=9;
  p19.capacity=800;
  p19.type="Express";
  p19.isActive=true;

  r19.getStationDetails();



  RailwayStation r20=new RailwayStation();
  Platform p20=new Platform();

  r20.stationId=20;
  r20.stationName="Mumbai";
  r20.location="Mumbai";
  r20.numberOfTrains=220;

  r20.platform=p20;
  p20.platformId=120;
  p20.platformNumber=12;
  p20.capacity=950;
  p20.type="Express";
  p20.isActive=true;

  r20.getStationDetails();

 }
}