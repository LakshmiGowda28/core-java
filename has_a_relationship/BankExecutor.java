class BankExecutor{

 public static void main(String[] args){

  Bank b1=new Bank();
  AccountHolder a1=new AccountHolder();
  b1.bankId=1;
  b1.bankName="SBI";
  b1.branch="Bangalore";
  b1.balance=50000;
  b1.accountHolder=a1;
  a1.holderId=101;
  a1.name="Ravi";
  a1.age=28;
  a1.accountType="Savings";
  a1.isActive=true;

  b1.getBankDetails();

  Bank b2=new Bank();
  AccountHolder a2=new AccountHolder();
  b2.bankId=2;
  b2.bankName="HDFC";
  b2.branch="Mysore";
  b2.balance=75000;
  b2.accountHolder=a2;
  a2.holderId=102;
  a2.name="Priya";
  a2.age=25;
  a2.accountType="Current";
  a2.isActive=true;

  b2.getBankDetails();

  Bank b3=new Bank();
  AccountHolder a3=new AccountHolder();
  b3.bankId=3;
  b3.bankName="ICICI";
  b3.branch="Tumkur";
  b3.balance=62000;
  b3.accountHolder=a3;
  a3.holderId=103;
  a3.name="Arun";
  a3.age=30;
  a3.accountType="Savings";
  a3.isActive=true;

  b3.getBankDetails();

  Bank b4=new Bank();
  AccountHolder a4=new AccountHolder();
  b4.bankId=4;
  b4.bankName="Axis";
  b4.branch="Chennai";
  b4.balance=88000;
  b4.accountHolder=a4;
  a4.holderId=104;
  a4.name="Sneha";
  a4.age=27;
  a4.accountType="Current";
  a4.isActive=true;

  b4.getBankDetails();

  Bank b5=new Bank();
  AccountHolder a5=new AccountHolder();
  b5.bankId=5;
  b5.bankName="Canara";
  b5.branch="Hubli";
  b5.balance=55000;
  b5.accountHolder=a5;
  a5.holderId=105;
  a5.name="Kiran";
  a5.age=29;
  a5.accountType="Savings";
  a5.isActive=true;

  b5.getBankDetails();

  Bank b6=new Bank();
  AccountHolder a6=new AccountHolder();
  b6.bankId=6;
  b6.bankName="SBI";
  b6.branch="Delhi";
  b6.balance=90000;
  b6.accountHolder=a6;
  a6.holderId=106;
  a6.name="Anil";
  a6.age=35;
  a6.accountType="Current";
  a6.isActive=true;

  b6.getBankDetails();

  Bank b7=new Bank();
  AccountHolder a7=new AccountHolder();
  b7.bankId=7;
  b7.bankName="HDFC";
  b7.branch="Pune";
  b7.balance=47000;
  b7.accountHolder=a7;
  a7.holderId=107;
  a7.name="Megha";
  a7.age=24;
  a7.accountType="Savings";
  a7.isActive=true;

  b7.getBankDetails();

  Bank b8=new Bank();
  AccountHolder a8=new AccountHolder();
  b8.bankId=8;
  b8.bankName="ICICI";
  b8.branch="Hyderabad";
  b8.balance=83000;
  b8.accountHolder=a8;
  a8.holderId=108;
  a8.name="Rahul";
  a8.age=32;
  a8.accountType="Current";
  a8.isActive=true;

  b8.getBankDetails();

  Bank b9=new Bank();
  AccountHolder a9=new AccountHolder();
  b9.bankId=9;
  b9.bankName="Axis";
  b9.branch="Goa";
  b9.balance=61000;
  b9.accountHolder=a9;
  a9.holderId=109;
  a9.name="Divya";
  a9.age=26;
  a9.accountType="Savings";
  a9.isActive=true;

  b9.getBankDetails();

  Bank b10=new Bank();
  AccountHolder a10=new AccountHolder();
  b10.bankId=10;
  b10.bankName="Canara";
  b10.branch="Mangalore";
  b10.balance=72000;
  b10.accountHolder=a10;
  a10.holderId=110;
  a10.name="Vikram";
  a10.age=31;
  a10.accountType="Current";
  a10.isActive=true;

  b10.getBankDetails();

  Bank b11=new Bank();
  AccountHolder a11=new AccountHolder();
  b11.bankId=11;
  b11.bankName="SBI";
  b11.branch="Udupi";
  b11.balance=68000;
  b11.accountHolder=a11;
  a11.holderId=111;
  a11.name="Pooja";
  a11.age=23;
  a11.accountType="Savings";
  a11.isActive=true;

  b11.getBankDetails();

  Bank b12=new Bank();
  AccountHolder a12=new AccountHolder();
  b12.bankId=12;
  b12.bankName="HDFC";
  b12.branch="Shimoga";
  b12.balance=91000;
  b12.accountHolder=a12;
  a12.holderId=112;
  a12.name="Ajay";
  a12.age=34;
  a12.accountType="Current";
  a12.isActive=true;

  b12.getBankDetails();

  Bank b13=new Bank();
  AccountHolder a13=new AccountHolder();
  b13.bankId=13;
  b13.bankName="ICICI";
  b13.branch="Belgaum";
  b13.balance=59000;
  b13.accountHolder=a13;
  a13.holderId=113;
  a13.name="Kavya";
  a13.age=22;
  a13.accountType="Savings";
  a13.isActive=true;

  b13.getBankDetails();

  Bank b14=new Bank();
  AccountHolder a14=new AccountHolder();
  b14.bankId=14;
  b14.bankName="Axis";
  b14.branch="Nagpur";
  b14.balance=86000;
  b14.accountHolder=a14;
  a14.holderId=114;
  a14.name="Manoj";
  a14.age=36;
  a14.accountType="Current";
  a14.isActive=true;

  b14.getBankDetails();

  Bank b15=new Bank();
  AccountHolder a15=new AccountHolder();
  b15.bankId=15;
  b15.bankName="Canara";
  b15.branch="Bhopal";
  b15.balance=63000;
  b15.accountHolder=a15;
  a15.holderId=115;
  a15.name="Neha";
  a15.age=27;
  a15.accountType="Savings";
  a15.isActive=true;

  b15.getBankDetails();

  Bank b16=new Bank();
  AccountHolder a16=new AccountHolder();
  b16.bankId=16;
  b16.bankName="SBI";
  b16.branch="Jaipur";
  b16.balance=95000;
  b16.accountHolder=a16;
  a16.holderId=116;
  a16.name="Ramesh";
  a16.age=40;
  a16.accountType="Current";
  a16.isActive=true;

  b16.getBankDetails();

  Bank b17=new Bank();
  AccountHolder a17=new AccountHolder();
  b17.bankId=17;
  b17.bankName="HDFC";
  b17.branch="Kolkata";
  b17.balance=57000;
  b17.accountHolder=a17;
  a17.holderId=117;
  a17.name="Swathi";
  a17.age=24;
  a17.accountType="Savings";
  a17.isActive=true;

  b17.getBankDetails();

  Bank b18=new Bank();
  AccountHolder a18=new AccountHolder();
  b18.bankId=18;
  b18.bankName="ICICI";
  b18.branch="Surat";
  b18.balance=82000;
  b18.accountHolder=a18;
  a18.holderId=118;
  a18.name="Harish";
  a18.age=33;
  a18.accountType="Current";
  a18.isActive=true;

  b18.getBankDetails();

  Bank b19=new Bank();
  AccountHolder a19=new AccountHolder();
  b19.bankId=19;
  b19.bankName="Axis";
  b19.branch="Indore";
  b19.balance=66000;
  b19.accountHolder=a19;
  a19.holderId=119;
  a19.name="Ananya";
  a19.age=26;
  a19.accountType="Savings";
  a19.isActive=true;
  b19.getBankDetails();

  Bank b20=new Bank();
  AccountHolder a20=new AccountHolder();
  b20.bankId=20;
  b20.bankName="Canara";
  b20.branch="Patna";
  b20.balance=74000;
  b20.accountHolder=a20;
  a20.holderId=120;
  a20.name="Deepak";
  a20.age=29;
  a20.accountType="Current";
  a20.isActive=true;
  b20.getBankDetails();

 }
}