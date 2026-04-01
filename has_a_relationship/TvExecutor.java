class TvExecutor{

 public static void main(String[] args){

  Tv t1 = new Tv();
  t1.tvId = 1;
  t1.brand = "Sony";
  t1.price = 50000;
  t1.type = "LED";

  Remote r1 = new Remote();
  t1.remote = r1;
  r1.remoteId = 101;
  r1.brand = "Sony";
  r1.type = "Smart";
  r1.batteryLevel = 80;
  r1.isWorking = true;

  t1.getTvDetails();
 
  Tv t2 = new Tv();
  t2.tvId = 2;
  t2.brand = "Samsung";
  t2.price = 45000;
  t2.type = "QLED";

  Remote r2 = new Remote();
  t2.remote = r2;

  r2.remoteId = 102;
  r2.brand = "Samsung";
  r2.type = "Smart";
  r2.batteryLevel = 75;
  r2.isWorking = true;

  t2.getTvDetails();
 
  Tv t3 = new Tv();
  t3.tvId = 3;
  t3.brand = "LG";
  t3.price = 40000;
  t3.type = "OLED";

  Remote r3 = new Remote();
  t3.remote = r3;

  r3.remoteId = 103;
  r3.brand = "LG";
  r3.type = "Magic";
  r3.batteryLevel = 70;
  r3.isWorking = true;

  t3.getTvDetails();
  
  Tv t4 = new Tv();
  t4.tvId = 4;
  t4.brand = "Mi";
  t4.price = 30000;
  t4.type = "LED";

  Remote r4 = new Remote();
  t4.remote = r4;

  r4.remoteId = 104;
  r4.brand = "Mi";
  r4.type = "Smart";
  r4.batteryLevel = 65;
  r4.isWorking = true;

  t4.getTvDetails();
  
  Tv t5 = new Tv();
  t5.tvId = 5;
  t5.brand = "OnePlus";
  t5.price = 35000;
  t5.type = "LED";

  Remote r5 = new Remote();
  t5.remote = r5;

  r5.remoteId = 105;
  r5.brand = "OnePlus";
  r5.type = "Smart";
  r5.batteryLevel = 60;
  r5.isWorking = true;

  t5.getTvDetails();
  
  Tv t6 = new Tv();
  t6.tvId = 6;
  t6.brand = "Sony";
  t6.price = 52000;
  t6.type = "OLED";

  Remote r6 = new Remote();
  t6.remote = r6;

  r6.remoteId = 106;
  r6.brand = "Sony";
  r6.type = "Smart";
  r6.batteryLevel = 85;
  r6.isWorking = true;

  t6.getTvDetails();
  
  Tv t7 = new Tv();
  t7.tvId = 7;
  t7.brand = "Samsung";
  t7.price = 48000;
  t7.type = "QLED";

  Remote r7 = new Remote();
  t7.remote = r7;

  r7.remoteId = 107;
  r7.brand = "Samsung";
  r7.type = "Smart";
  r7.batteryLevel = 78;
  r7.isWorking = true;

  t7.getTvDetails();
  
  Tv t8 = new Tv();
  t8.tvId = 8;
  t8.brand = "LG";
  t8.price = 42000;
  t8.type = "OLED";

  Remote r8 = new Remote();
  t8.remote = r8;

  r8.remoteId = 108;
  r8.brand = "LG";
  r8.type = "Magic";
  r8.batteryLevel = 68;
  r8.isWorking = true;

  t8.getTvDetails();
  
  Tv t9 = new Tv();
  t9.tvId = 9;
  t9.brand = "Mi";
  t9.price = 28000;
  t9.type = "LED";

  Remote r9 = new Remote();
  t9.remote = r9;

  r9.remoteId = 109;
  r9.brand = "Mi";
  r9.type = "Smart";
  r9.batteryLevel = 55;
  r9.isWorking = true;

  t9.getTvDetails();
  
  Tv t10 = new Tv();
  t10.tvId = 10;
  t10.brand = "OnePlus";
  t10.price = 36000;
  t10.type = "LED";

  Remote r10 = new Remote();
  t10.remote = r10;

  r10.remoteId = 110;
  r10.brand = "OnePlus";
  r10.type = "Smart";
  r10.batteryLevel = 62;
  r10.isWorking = true;

  t10.getTvDetails();
  

  Tv t11=new Tv();
  Remote r11=new Remote();
  t11.tvId=11;
  t11.brand="Sony";
  t11.price=51000;
  t11.type="LED";
  
  t11.remote=r11;
  r11.remoteId=111; 
  r11.brand="Sony";
  r11.type="Smart";
  r11.batteryLevel=80;
  r11.isWorking=true;
  
  t11.getTvDetails();

  Tv t12=new Tv();
  Remote r12=new Remote();
  t12.tvId=12;
  t12.brand="Samsung";
  t12.price=47000;
  t12.type="QLED";
  
  t12.remote=r12;
  r12.remoteId=112;
  r12.brand="Samsung";
  r12.type="Smart";
  r12.batteryLevel=75;
  r12.isWorking=true;
  
  t12.getTvDetails();

  Tv t13=new Tv();
  Remote r13=new Remote();
  t13.tvId=13;
  t13.brand="LG";
  t13.price=43000;
  t13.type="OLED";
  
  t13.remote=r13;
  r13.remoteId=113;
  r13.brand="LG";
  r13.type="Magic";
  r13.batteryLevel=70;
  r13.isWorking=true;
  
  t13.getTvDetails();

  Tv t14=new Tv();
  Remote r14=new Remote();
  t14.tvId=14;
  t14.brand="Mi";
  t14.price=29000;
  t14.type="LED";
  
  t14.remote=r14;
  r14.remoteId=114;
  r14.brand="Mi";
  r14.type="Smart";
  r14.batteryLevel=60;
  r14.isWorking=true;
  
  t14.getTvDetails();

  Tv t15=new Tv();
  Remote r15=new Remote();
  t15.tvId=15;
  t15.brand="OnePlus";
  t15.price=37000;
  t15.type="LED";
  
  t15.remote=r15;
  r15.remoteId=115;
  r15.brand="OnePlus";
  r15.type="Smart";
  r15.batteryLevel=65;
  r15.isWorking=true;
  
  t15.getTvDetails();

  Tv t16=new Tv();
  Remote r16=new Remote();
  t16.tvId=16;
  t16.brand="Sony";
  t16.price=53000;
  t16.type="OLED";
  
  t16.remote=r16;
  r16.remoteId=116;
  r16.brand="Sony";
  r16.type="Smart";
  r16.batteryLevel=85;
  r16.isWorking=true;
  
  t16.getTvDetails();

  Tv t17=new Tv();
  Remote r17=new Remote();
  t17.tvId=17;
  t17.brand="Samsung";
  t17.price=49000;
  t17.type="QLED";
  
  t17.remote=r17;
  r17.remoteId=117;
  r17.brand="Samsung";
  r17.type="Smart";
  r17.batteryLevel=78;
  r17.isWorking=true;
  
  t17.getTvDetails();

  Tv t18=new Tv();
  Remote r18=new Remote();
  t18.tvId=18;
  t18.brand="LG";
  t18.price=44000;
  t18.type="OLED";
  
  t18.remote=r18;
  r18.remoteId=118;
  r18.brand="LG";
  r18.type="Magic";
  r18.batteryLevel=68;
  r18.isWorking=true;
  
  t18.getTvDetails();

  Tv t19=new Tv();
  Remote r19=new Remote();
  t19.tvId=19;
  t19.brand="Mi";
  t19.price=30000;
  t19.type="LED";
  
  t19.remote=r19;
  r19.remoteId=119;
  r19.brand="Mi";
  r19.type="Smart";
  r19.batteryLevel=58;
  r19.isWorking=true;
  
  t19.getTvDetails();

  Tv t20=new Tv();
  Remote r20=new Remote();
  t20.tvId=20;
  t20.brand="OnePlus";
  t20.price=38000;
  t20.type="LED";
  
  t20.remote=r20;
  r20.remoteId=120;
  r20.brand="OnePlus";
  r20.type="Smart";
  r20.batteryLevel=66;
  r20.isWorking=true;
  
  t20.getTvDetails();

 }
}