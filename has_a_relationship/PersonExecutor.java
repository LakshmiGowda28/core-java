class PersonExecutor{

 public static void main(String[] args){

  Person p1=new Person();
  GovernmentIdentificationCard g1=new GovernmentIdentificationCard();

  p1.personId=1;
  p1.name="Lakshmi";
  p1.age=23;
  p1.address="Bangalore";
  p1.idCard=g1;
  g1.cardId=101;
  g1.idType="Aadhar";
  g1.idNumber="1234-5678-1111";
  g1.nationality="Indian";
  g1.isValid=true;
  p1.getPersonDetails();

  Person p2=new Person();
  GovernmentIdentificationCard g2=new GovernmentIdentificationCard();

  p2.personId=2;
  p2.name="Ravi";
  p2.age=30;
  p2.address="Mysore";
  p2.idCard=g2;
  g2.cardId=102;
  g2.idType="PAN";
  g2.idNumber="ABCDE1234F";
  g2.nationality="Indian";
  g2.isValid=true;
  p2.getPersonDetails();

  Person p3=new Person();
  GovernmentIdentificationCard g3=new GovernmentIdentificationCard();

  p3.personId=3;
  p3.name="Sneha";
  p3.age=27;
  p3.address="Tumkur";
  p3.idCard=g3;
  g3.cardId=103;
  g3.idType="Passport";
  g3.idNumber="N1234567";
  g3.nationality="Indian";
  g3.isValid=true;
  p3.getPersonDetails();

  Person p4=new Person();
  GovernmentIdentificationCard g4=new GovernmentIdentificationCard();

  p4.personId=4;
  p4.name="Kiran";
  p4.age=25;
  p4.address="Chennai";
  p4.idCard=g4;
  g4.cardId=104;
  g4.idType="DrivingLicense";
  g4.idNumber="DL123456";
  g4.nationality="Indian";
  g4.isValid=true;
  p4.getPersonDetails();

  Person p5=new Person();
  GovernmentIdentificationCard g5=new GovernmentIdentificationCard();

  p5.personId=5;
  p5.name="Divya";
  p5.age=29;
  p5.address="Hyderabad";
  p5.idCard=g5;
  g5.cardId=105;
  g5.idType="VoterID";
  g5.idNumber="VOTE5678";
  g5.nationality="Indian";
  g5.isValid=true;
  p5.getPersonDetails();

  Person p6=new Person();
  GovernmentIdentificationCard g6=new GovernmentIdentificationCard();

  p6.personId=6;
  p6.name="Arjun";
  p6.age=31;
  p6.address="Pune";
  p6.idCard=g6;
  g6.cardId=106;
  g6.idType="Aadhar";
  g6.idNumber="2222-3333-4444";
  g6.nationality="Indian";
  g6.isValid=true;

  p6.getPersonDetails();

  Person p7=new Person();
  GovernmentIdentificationCard g7=new GovernmentIdentificationCard();

  p7.personId=7;
  p7.name="Megha";
  p7.age=26;
  p7.address="Delhi";
  p7.idCard=g7;
  g7.cardId=107;
  g7.idType="PAN";
  g7.idNumber="PQRS1234Z";
  g7.nationality="Indian";
  g7.isValid=true;

  p7.getPersonDetails();

  Person p8=new Person();
  GovernmentIdentificationCard g8=new GovernmentIdentificationCard();

  p8.personId=8;
  p8.name="Rahul";
  p8.age=35;
  p8.address="Mumbai";
  p8.idCard=g8;
  g8.cardId=108;
  g8.idType="Passport";
  g8.idNumber="M7654321";
  g8.nationality="Indian";
  g8.isValid=true;

  p8.getPersonDetails();

  Person p9=new Person();
  GovernmentIdentificationCard g9=new GovernmentIdentificationCard();

  p9.personId=9;
  p9.name="Ananya";
  p9.age=24;
  p9.address="Goa";
  p9.idCard=g9;
  g9.cardId=109;
  g9.idType="DrivingLicense";
  g9.idNumber="DL654321";
  g9.nationality="Indian";
  g9.isValid=true;

  p9.getPersonDetails();

  Person p10=new Person();
  GovernmentIdentificationCard g10=new GovernmentIdentificationCard();

  p10.personId=10;
  p10.name="Vikram";
  p10.age=33;
  p10.address="Jaipur";
  p10.idCard=g10;
  g10.cardId=110;
  g10.idType="VoterID";
  g10.idNumber="VOTE9999";
  g10.nationality="Indian";
  g10.isValid=true;
  p10.getPersonDetails();

  Person p11=new Person();
  GovernmentIdentificationCard g11=new GovernmentIdentificationCard();

  p11.personId=11;
  p11.name="Swathi";
  p11.age=22;
  p11.address="Nagpur";
  p11.idCard=g11;
  g11.cardId=111;
  g11.idType="Aadhar";
  g11.idNumber="5555-6666-7777";
  g11.nationality="Indian";
  g11.isValid=true;

  p11.getPersonDetails();

  Person p12=new Person();
  GovernmentIdentificationCard g12=new GovernmentIdentificationCard();

  p12.personId=12;
  p12.name="Harish";
  p12.age=40;
  p12.address="Patna";
  p12.idCard=g12;
  g12.cardId=112;
  g12.idType="PAN";
  g12.idNumber="LMNO4567P";
  g12.nationality="Indian";
  g12.isValid=true;

  p12.getPersonDetails();

  Person p13=new Person();
  GovernmentIdentificationCard g13=new GovernmentIdentificationCard();

  p13.personId=13;
  p13.name="Deepak";
  p13.age=28;
  p13.address="Udupi";
  p13.idCard=g13;
  g13.cardId=113;
  g13.idType="Passport";
  g13.idNumber="K3456789";
  g13.nationality="Indian";
  g13.isValid=true;

  p13.getPersonDetails();

  Person p14=new Person();
  GovernmentIdentificationCard g14=new GovernmentIdentificationCard();

  p14.personId=14;
  p14.name="Kavya";
  p14.age=21;
  p14.address="Belgaum";
  p14.idCard=g14;
  g14.cardId=114;
  g14.idType="DrivingLicense";
  g14.idNumber="DL888888";
  g14.nationality="Indian";
  g14.isValid=true;

  p14.getPersonDetails();

  Person p15=new Person();
  GovernmentIdentificationCard g15=new GovernmentIdentificationCard();

  p15.personId=15;
  p15.name="Ajay";
  p15.age=36;
  p15.address="Mangalore";
  p15.idCard=g15;
  g15.cardId=115;
  g15.idType="VoterID";
  g15.idNumber="VOTE1234";
  g15.nationality="Indian";
  g15.isValid=true;

  p15.getPersonDetails();

  Person p16=new Person();
  GovernmentIdentificationCard g16=new GovernmentIdentificationCard();

  p16.personId=16;
  p16.name="Neha";
  p16.age=27;
  p16.address="Coimbatore";
  p16.idCard=g16;
  g16.cardId=116;
  g16.idType="Aadhar";
  g16.idNumber="8888-9999-0000";
  g16.nationality="Indian";
  g16.isValid=true;

  p16.getPersonDetails();

  Person p17=new Person();
  GovernmentIdentificationCard g17=new GovernmentIdentificationCard();

  p17.personId=17;
  p17.name="Manoj";
  p17.age=38;
  p17.address="Indore";
  p17.idCard=g17;
  g17.cardId=117;
  g17.idType="PAN";
  g17.idNumber="UVWX1234Y";
  g17.nationality="Indian";
  g17.isValid=true;

  p17.getPersonDetails();

  Person p18=new Person();
  GovernmentIdentificationCard g18=new GovernmentIdentificationCard();

  p18.personId=18;
  p18.name="Priya";
  p18.age=26;
  p18.address="Surat";
  p18.idCard=g18;
  g18.cardId=118;
  g18.idType="Passport";
  g18.idNumber="Z9876543";
  g18.nationality="Indian";
  g18.isValid=true;

  p18.getPersonDetails();

  Person p19=new Person();
  GovernmentIdentificationCard g19=new GovernmentIdentificationCard();

  p19.personId=19;
  p19.name="Rohit";
  p19.age=32;
  p19.address="Chandigarh";
  p19.idCard=g19;
  g19.cardId=119;
  g19.idType="DrivingLicense";
  g19.idNumber="DL777777";
  g19.nationality="Indian";
  g19.isValid=true;

  p19.getPersonDetails();

  Person p20=new Person();
  GovernmentIdentificationCard g20=new GovernmentIdentificationCard();

  p20.personId=20;
  p20.name="Asha";
  p20.age=34;
  p20.address="Bangalore";
  p20.idCard=g20;
  g20.cardId=120;
  g20.idType="VoterID";
  g20.idNumber="VOTE4321";
  g20.nationality="Indian";
  g20.isValid=true;

  p20.getPersonDetails();

 }
}