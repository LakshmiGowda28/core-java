class MobileExecutor{

 public static void main(String[] args){

  Mobile m1=new Mobile();
  Sim s1=new Sim();
  m1.mobileId=1;
  m1.brand="Samsung";
  m1.price=18000;
  m1.model="Galaxy M32";
  m1.sim=s1;
  s1.simId=101;
  s1.provider="Jio";
  s1.networkType="5G";
  s1.phoneNumber=9876543210L;
  s1.isActive=true;
  m1.getMobileDetails();

  Mobile m2=new Mobile();
  Sim s2=new Sim();
  m2.mobileId=2;
  m2.brand="Vivo";
  m2.price=15000;
  m2.model="Y21";
  m2.sim=s2;
  s2.simId=102;
  s2.provider="Airtel";
  s2.networkType="4G";
  s2.phoneNumber=9876543211L;
  s2.isActive=true;

  m2.getMobileDetails();

  Mobile m3=new Mobile();
  Sim s3=new Sim();
  m3.mobileId=3;
  m3.brand="Redmi";
  m3.price=13000;
  m3.model="Note 10";
  m3.sim=s3;
  s3.simId=103;
  s3.provider="Vi";
  s3.networkType="4G";
  s3.phoneNumber=9876543212L;
  s3.isActive=true;

  m3.getMobileDetails();

  Mobile m4=new Mobile();
  Sim s4=new Sim();
  m4.mobileId=4;
  m4.brand="Realme";
  m4.price=17000;
  m4.model="Narzo 50";
  m4.sim=s4;
  s4.simId=104;
  s4.provider="Jio";
  s4.networkType="5G";
  s4.phoneNumber=9876543213L;
  s4.isActive=true;
  m4.getMobileDetails();

  Mobile m5=new Mobile();
  Sim s5=new Sim();
  m5.mobileId=5;
  m5.brand="OnePlus";
  m5.price=28000;
  m5.model="Nord CE";
  m5.sim=s5;
  s5.simId=105;
  s5.provider="Airtel";
  s5.networkType="5G";
  s5.phoneNumber=9876543214L;
  s5.isActive=true;
  m5.getMobileDetails();

  Mobile m6=new Mobile();
  Sim s6=new Sim();
  m6.mobileId=6;
  m6.brand="Samsung";
  m6.price=22000;
  m6.model="Galaxy A34";
  m6.sim=s6;
  s6.simId=106;
  s6.provider="Vi";
  s6.networkType="4G";
  s6.phoneNumber=9876543215L;
  s6.isActive=true;
  m6.getMobileDetails();

  Mobile m7=new Mobile();
  Sim s7=new Sim();
  m7.mobileId=7;
  m7.brand="Vivo";
  m7.price=19000;
  m7.model="V25";
  m7.sim=s7;
  s7.simId=107;
  s7.provider="Jio";
  s7.networkType="5G";
  s7.phoneNumber=9876543216L;
  s7.isActive=true;
  m7.getMobileDetails();

  Mobile m8=new Mobile();
  Sim s8=new Sim();
  m8.mobileId=8;
  m8.brand="Redmi";
  m8.price=12000;
  m8.model="Note 11";
  m8.sim=s8;
  s8.simId=108;
  s8.provider="Airtel";
  s8.networkType="4G";
  s8.phoneNumber=9876543217L;
  s8.isActive=true;
  m8.getMobileDetails();

  Mobile m9=new Mobile();
  Sim s9=new Sim();
  m9.mobileId=9;
  m9.brand="Realme";
  m9.price=16000;
  m9.model="C55";
  m9.sim=s9;
  s9.simId=109;
  s9.provider="Vi";
  s9.networkType="4G";
  s9.phoneNumber=9876543218L;
  s9.isActive=true;
  m9.getMobileDetails();
  Mobile m10=new Mobile();
  Sim s10=new Sim();

  m10.mobileId=10;
  m10.brand="OnePlus";
  m10.price=30000;
  m10.model="Nord 2";
  m10.sim=s10;
  s10.simId=110;
  s10.provider="Jio";
  s10.networkType="5G";
  s10.phoneNumber=9876543219L;
  s10.isActive=true;
  m10.getMobileDetails();

  Mobile m11=new Mobile();
  Sim s11=new Sim();
  m11.mobileId=11;
  m11.brand="Samsung";
  m11.price=21000;
  m11.model="Galaxy F23";
  m11.sim=s11;
  s11.simId=111;
  s11.provider="Airtel";
  s11.networkType="4G";
  s11.phoneNumber=9876543220L;
  s11.isActive=true;

  m11.getMobileDetails();

  Mobile m12=new Mobile();
  Sim s12=new Sim();
  m12.mobileId=12;
  m12.brand="Vivo";
  m12.price=17500;
  m12.model="Y35";
  m12.sim=s12;
  s12.simId=112;
  s12.provider="Vi";
  s12.networkType="4G";
  s12.phoneNumber=9876543221L;
  s12.isActive=true;

  m12.getMobileDetails();

  Mobile m13=new Mobile();
  Sim s13=new Sim();
  m13.mobileId=13;
  m13.brand="Redmi";
  m13.price=14000;
  m13.model="Note 12";
  m13.sim=s13;
  s13.simId=113;
  s13.provider="Jio";
  s13.networkType="5G";
  s13.phoneNumber=9876543222L;
  s13.isActive=true;

  m13.getMobileDetails();

  Mobile m14=new Mobile();
  Sim s14=new Sim();
  m14.mobileId=14;
  m14.brand="Realme";
  m14.price=15500;
  m14.model="Narzo 60";
  m14.sim=s14;
  s14.simId=114;
  s14.provider="Airtel";
  s14.networkType="4G";
  s14.phoneNumber=9876543223L;
  s14.isActive=true;

  m14.getMobileDetails();

  Mobile m15=new Mobile();
  Sim s15=new Sim();
  m15.mobileId=15;
  m15.brand="OnePlus";
  m15.price=32000;
  m15.model="Nord 3";
  m15.sim=s15;
  s15.simId=115;
  s15.provider="Vi";
  s15.networkType="5G";
  s15.phoneNumber=9876543224L;
  s15.isActive=true;

  m15.getMobileDetails();

  Mobile m16=new Mobile();
  Sim s16=new Sim();
  m16.mobileId=16;
  m16.brand="Samsung";
  m16.price=23000;
  m16.model="Galaxy A52";
  m16.sim=s16;
  s16.simId=116;
  s16.provider="Jio";
  s16.networkType="5G";
  s16.phoneNumber=9876543225L;
  s16.isActive=true;
  m16.getMobileDetails();

  Mobile m17=new Mobile();
  Sim s17=new Sim();

  m17.mobileId=17;
  m17.brand="Vivo";
  m17.price=16500;
  m17.model="T1";
  m17.sim=s17;
  s17.simId=117;
  s17.provider="Airtel";
  s17.networkType="4G";
  s17.phoneNumber=9876543226L;
  s17.isActive=true;
  m17.getMobileDetails();

  Mobile m18=new Mobile();
  Sim s18=new Sim();
  m18.mobileId=18;
  m18.brand="Redmi";
  m18.price=15000;
  m18.model="Note 9";
  m18.sim=s18;
  s18.simId=118;
  s18.provider="Vi";
  s18.networkType="4G";
  s18.phoneNumber=9876543227L;
  s18.isActive=true;
  m18.getMobileDetails();

  Mobile m19=new Mobile();
  Sim s19=new Sim();
  m19.mobileId=19;
  m19.brand="Realme";
  m19.price=18000;
  m19.model="C53";
  m19.sim=s19;
  s19.simId=119;
  s19.provider="Jio";
  s19.networkType="5G";
  s19.phoneNumber=9876543228L;
  s19.isActive=true;

  m19.getMobileDetails();

  Mobile m20=new Mobile();
  Sim s20=new Sim();

  m20.mobileId=20;
  m20.brand="OnePlus";
  m20.price=35000;
  m20.model="11R";
  m20.sim=s20;
  s20.simId=120;
  s20.provider="Airtel";
  s20.networkType="5G";
  s20.phoneNumber=9876543229L;
  s20.isActive=true;
  m20.getMobileDetails();

 }
}