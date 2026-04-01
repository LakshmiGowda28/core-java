class PhonePeExecutor{

 public static void main(String[] args){

  PhonePe p1=new PhonePe();
  History h1=new History();

  p1.phonePeId=1;
  p1.userName="Lakshmi";
  p1.walletBalance=5000;
  p1.accountType="Savings";
  p1.history=h1;
  h1.historyId=101;
  h1.transactionType="Recharge";
  h1.amount=299;
  h1.date="01-03-2026";
  h1.isSuccessful=true;

  p1.getPhonePeDetails();

  PhonePe p2=new PhonePe();
  History h2=new History();
  p2.phonePeId=2;
  p2.userName="Ravi";
  p2.walletBalance=3200;
  p2.accountType="Savings";
  p2.history=h2;
  h2.historyId=102;
  h2.transactionType="Electric Bill";
  h2.amount=850;
  h2.date="02-03-2026";
  h2.isSuccessful=true;

  p2.getPhonePeDetails();

  PhonePe p3=new PhonePe();
  History h3=new History();
  p3.phonePeId=3;
  p3.userName="Sneha";
  p3.walletBalance=7100;
  p3.accountType="Current";
  p3.history=h3;
  h3.historyId=103;
  h3.transactionType="Transfer";
  h3.amount=1500;
  h3.date="03-03-2026";
  h3.isSuccessful=true;

  p3.getPhonePeDetails();

  PhonePe p4=new PhonePe();
  History h4=new History();
  p4.phonePeId=4;
  p4.userName="Arjun";
  p4.walletBalance=2000;
  p4.accountType="Savings";
  p4.history=h4;
  h4.historyId=104;
  h4.transactionType="Movie Ticket";
  h4.amount=450;
  h4.date="04-03-2026";
  h4.isSuccessful=true;

  p4.getPhonePeDetails();

  PhonePe p5=new PhonePe();
  History h5=new History();
  p5.phonePeId=5;
  p5.userName="Megha";
  p5.walletBalance=9000;
  p5.accountType="Current";
  p5.history=h5;
  h5.historyId=105;
  h5.transactionType="Shopping";
  h5.amount=2300;
  h5.date="05-03-2026";
  h5.isSuccessful=true;

  p5.getPhonePeDetails();

  PhonePe p6=new PhonePe();
  History h6=new History();
  p6.phonePeId=6;
  p6.userName="Kiran";
  p6.walletBalance=4100;
  p6.accountType="Savings";
  p6.history=h6;
  h6.historyId=106;
  h6.transactionType="Food Order";
  h6.amount=620;
  h6.date="06-03-2026";
  h6.isSuccessful=true;

  p6.getPhonePeDetails();

  PhonePe p7=new PhonePe();
  History h7=new History();
  p7.phonePeId=7;
  p7.userName="Divya";
  p7.walletBalance=3800;
  p7.accountType="Savings";
  p7.history=h7;
  h7.historyId=107;
  h7.transactionType="Gas Bill";
  h7.amount=920;
  h7.date="07-03-2026";
  h7.isSuccessful=true;

  p7.getPhonePeDetails();

  PhonePe p8=new PhonePe();
  History h8=new History();
  p8.phonePeId=8;
  p8.userName="Rahul";
  p8.walletBalance=6500;
  p8.accountType="Current";
  p8.history=h8;
  h8.historyId=108;
  h8.transactionType="Mobile Recharge";
  h8.amount=399;
  h8.date="08-03-2026";
  h8.isSuccessful=true;

  p8.getPhonePeDetails();

  PhonePe p9=new PhonePe();
  History h9=new History();
  p9.phonePeId=9;
  p9.userName="Ananya";
  p9.walletBalance=5400;
  p9.accountType="Savings";
  p9.history=h9;
  h9.historyId=109;
  h9.transactionType="Transfer";
  h9.amount=1200;
  h9.date="09-03-2026";
  h9.isSuccessful=true;

  p9.getPhonePeDetails();

  PhonePe p10=new PhonePe();
  History h10=new History();
  p10.phonePeId=10;
  p10.userName="Vikram";
  p10.walletBalance=8300;
  p10.accountType="Current";
  p10.history=h10;
  h10.historyId=110;
  h10.transactionType="Insurance";
  h10.amount=3000;
  h10.date="10-03-2026";
  h10.isSuccessful=true;
  p10.getPhonePeDetails();

  PhonePe p11=new PhonePe();
  History h11=new History();
  p11.phonePeId=11;
  p11.userName="Pooja";
  p11.walletBalance=2100;
  p11.accountType="Savings";
  p11.history=h11;
  h11.historyId=111;
  h11.transactionType="Recharge";
  h11.amount=249;
  h11.date="11-03-2026";
  h11.isSuccessful=true;
  p11.getPhonePeDetails();

  PhonePe p12=new PhonePe();
  History h12=new History();
  p12.phonePeId=12;
  p12.userName="Ramesh";
  p12.walletBalance=7200;
  p12.accountType="Current";
  p12.history=h12;
  h12.historyId=112;
  h12.transactionType="Shopping";
  h12.amount=2600;
  h12.date="12-03-2026";
  h12.isSuccessful=true;
  p12.getPhonePeDetails();

  PhonePe p13=new PhonePe();
  History h13=new History();
  p13.phonePeId=13;
  p13.userName="Swathi";
  p13.walletBalance=3100;
  p13.accountType="Savings";
  p13.history=h13;
  h13.historyId=113;
  h13.transactionType="Food";
  h13.amount=540;
  h13.date="13-03-2026";
  h13.isSuccessful=true;
  p13.getPhonePeDetails();

  PhonePe p14=new PhonePe();
  History h14=new History();
  p14.phonePeId=14;
  p14.userName="Manoj";
  p14.walletBalance=6600;
  p14.accountType="Current";
  p14.history=h14;
  h14.historyId=114;
  h14.transactionType="Transfer";
  h14.amount=1800;
  h14.date="14-03-2026";
  h14.isSuccessful=true;
  p14.getPhonePeDetails();

  PhonePe p15=new PhonePe();
  History h15=new History();
  p15.phonePeId=15;
  p15.userName="Neha";
  p15.walletBalance=4700;
  p15.accountType="Savings";
  p15.history=h15;
  h15.historyId=115;
  h15.transactionType="Recharge";
  h15.amount=199;
  h15.date="15-03-2026";
  h15.isSuccessful=true;
  p15.getPhonePeDetails();

  PhonePe p16=new PhonePe();
  History h16=new History();
  p16.phonePeId=16;
  p16.userName="Ajay";
  p16.walletBalance=8800;
  p16.accountType="Current";
  p16.history=h16;
  h16.historyId=116;
  h16.transactionType="Bill";
  h16.amount=2100;
  h16.date="16-03-2026";
  h16.isSuccessful=true;

  p16.getPhonePeDetails();

  PhonePe p17=new PhonePe();
  History h17=new History();
  p17.phonePeId=17;
  p17.userName="Kavya";
  p17.walletBalance=3500;
  p17.accountType="Savings";
  p17.history=h17;
  h17.historyId=117;
  h17.transactionType="Movie";
  h17.amount=500;
  h17.date="17-03-2026";
  h17.isSuccessful=true;

  p17.getPhonePeDetails();

  PhonePe p18=new PhonePe();
  History h18=new History();
  p18.phonePeId=18;
  p18.userName="Harish";
  p18.walletBalance=7600;
  p18.accountType="Current";
  p18.history=h18;
  h18.historyId=118;
  h18.transactionType="Shopping";
  h18.amount=3200;
  h18.date="18-03-2026";
  h18.isSuccessful=true;
  p18.getPhonePeDetails();

  PhonePe p19=new PhonePe();
  History h19=new History();
  p19.phonePeId=19;
  p19.userName="Deepak";
  p19.walletBalance=2900;
  p19.accountType="Savings";
  p19.history=h19;
  h19.historyId=119;
  h19.transactionType="Food";
  h19.amount=450;
  h19.date="19-03-2026";
  h19.isSuccessful=true;
  p19.getPhonePeDetails();

  PhonePe p20=new PhonePe();
  History h20=new History();
  p20.phonePeId=20;
  p20.userName="Anil";
  p20.walletBalance=9400;
  p20.accountType="Current";
  p20.history=h20;
  h20.historyId=120;
  h20.transactionType="Transfer";
  h20.amount=4000;
  h20.date="20-03-2026";
  h20.isSuccessful=true;
  p20.getPhonePeDetails();

 }
}