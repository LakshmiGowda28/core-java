class FreelancerExecutor{

 public static void main(String[] args){

  Freelancer f1=new Freelancer();
  Client c1=new Client();

  f1.freelancerId=1;
  f1.freelancerName="Lakshmi";
  f1.skill="Web Development";
  f1.hourlyRate=25;

  f1.client=c1;
  c1.clientId=101;
  c1.clientName="Google";
  c1.projectName="Website UI";
  c1.projectDuration=3;
  c1.isInternational=true;

  f1.getFreelancerDetails();



  Freelancer f2=new Freelancer();
  Client c2=new Client();

  f2.freelancerId=2;
  f2.freelancerName="Ravi";
  f2.skill="Graphic Design";
  f2.hourlyRate=20;

  f2.client=c2;
  c2.clientId=102;
  c2.clientName="Amazon";
  c2.projectName="Logo Design";
  c2.projectDuration=2;
  c2.isInternational=true;

  f2.getFreelancerDetails();



  Freelancer f3=new Freelancer();
  Client c3=new Client();

  f3.freelancerId=3;
  f3.freelancerName="Sneha";
  f3.skill="Content Writing";
  f3.hourlyRate=15;

  f3.client=c3;
  c3.clientId=103;
  c3.clientName="Flipkart";
  c3.projectName="Blog Writing";
  c3.projectDuration=4;
  c3.isInternational=false;

  f3.getFreelancerDetails();



  Freelancer f4=new Freelancer();
  Client c4=new Client();

  f4.freelancerId=4;
  f4.freelancerName="Kiran";
  f4.skill="App Development";
  f4.hourlyRate=30;

  f4.client=c4;
  c4.clientId=104;
  c4.clientName="Microsoft";
  c4.projectName="Mobile App";
  c4.projectDuration=6;
  c4.isInternational=true;

  f4.getFreelancerDetails();



  Freelancer f5=new Freelancer();
  Client c5=new Client();

  f5.freelancerId=5;
  f5.freelancerName="Divya";
  f5.skill="SEO";
  f5.hourlyRate=18;

  f5.client=c5;
  c5.clientId=105;
  c5.clientName="Zomato";
  c5.projectName="SEO Optimization";
  c5.projectDuration=5;
  c5.isInternational=false;

  f5.getFreelancerDetails();



  Freelancer f6=new Freelancer();
  Client c6=new Client();

  f6.freelancerId=6;
  f6.freelancerName="Arjun";
  f6.skill="Video Editing";
  f6.hourlyRate=22;

  f6.client=c6;
  c6.clientId=106;
  c6.clientName="Netflix";
  c6.projectName="Promo Video";
  c6.projectDuration=3;
  c6.isInternational=true;

  f6.getFreelancerDetails();



  Freelancer f7=new Freelancer();
  Client c7=new Client();

  f7.freelancerId=7;
  f7.freelancerName="Megha";
  f7.skill="UI Design";
  f7.hourlyRate=26;

  f7.client=c7;
  c7.clientId=107;
  c7.clientName="Adobe";
  c7.projectName="App UI";
  c7.projectDuration=4;
  c7.isInternational=true;

  f7.getFreelancerDetails();



  Freelancer f8=new Freelancer();
  Client c8=new Client();

  f8.freelancerId=8;
  f8.freelancerName="Rahul";
  f8.skill="Python Dev";
  f8.hourlyRate=28;

  f8.client=c8;
  c8.clientId=108;
  c8.clientName="IBM";
  c8.projectName="Automation Script";
  c8.projectDuration=5;
  c8.isInternational=true;

  f8.getFreelancerDetails();



  Freelancer f9=new Freelancer();
  Client c9=new Client();

  f9.freelancerId=9;
  f9.freelancerName="Ananya";
  f9.skill="Animation";
  f9.hourlyRate=24;

  f9.client=c9;
  c9.clientId=109;
  c9.clientName="Disney";
  c9.projectName="Cartoon Animation";
  c9.projectDuration=6;
  c9.isInternational=true;

  f9.getFreelancerDetails();



  Freelancer f10=new Freelancer();
  Client c10=new Client();

  f10.freelancerId=10;
  f10.freelancerName="Vikram";
  f10.skill="Data Analysis";
  f10.hourlyRate=27;

  f10.client=c10;
  c10.clientId=110;
  c10.clientName="Infosys";
  c10.projectName="Data Report";
  c10.projectDuration=3;
  c10.isInternational=false;

  f10.getFreelancerDetails();



  Freelancer f11=new Freelancer();
  Client c11=new Client();

  f11.freelancerId=11;
  f11.freelancerName="Swathi";
  f11.skill="Testing";
  f11.hourlyRate=19;

  f11.client=c11;
  c11.clientId=111;
  c11.clientName="TCS";
  c11.projectName="Software Testing";
  c11.projectDuration=4;
  c11.isInternational=false;

  f11.getFreelancerDetails();



  Freelancer f12=new Freelancer();
  Client c12=new Client();

  f12.freelancerId=12;
  f12.freelancerName="Harish";
  f12.skill="Cyber Security";
  f12.hourlyRate=35;

  f12.client=c12;
  c12.clientId=112;
  c12.clientName="Cisco";
  c12.projectName="Security Audit";
  c12.projectDuration=5;
  c12.isInternational=true;

  f12.getFreelancerDetails();



  Freelancer f13=new Freelancer();
  Client c13=new Client();

  f13.freelancerId=13;
  f13.freelancerName="Deepak";
  f13.skill="Java Dev";
  f13.hourlyRate=29;

  f13.client=c13;
  c13.clientId=113;
  c13.clientName="Oracle";
  c13.projectName="Backend Dev";
  c13.projectDuration=6;
  c13.isInternational=true;

  f13.getFreelancerDetails();



  Freelancer f14=new Freelancer();
  Client c14=new Client();

  f14.freelancerId=14;
  f14.freelancerName="Kavya";
  f14.skill="Figma Design";
  f14.hourlyRate=21;

  f14.client=c14;
  c14.clientId=114;
  c14.clientName="Canva";
  c14.projectName="Template Design";
  c14.projectDuration=2;
  c14.isInternational=true;

  f14.getFreelancerDetails();



  Freelancer f15=new Freelancer();
  Client c15=new Client();

  f15.freelancerId=15;
  f15.freelancerName="Ajay";
  f15.skill="React Dev";
  f15.hourlyRate=31;

  f15.client=c15;
  c15.clientId=115;
  c15.clientName="Meta";
  c15.projectName="Web App";
  c15.projectDuration=5;
  c15.isInternational=true;

  f15.getFreelancerDetails();



  Freelancer f16=new Freelancer();
  Client c16=new Client();

  f16.freelancerId=16;
  f16.freelancerName="Neha";
  f16.skill="Marketing";
  f16.hourlyRate=23;

  f16.client=c16;
  c16.clientId=116;
  c16.clientName="Swiggy";
  c16.projectName="Campaign";
  c16.projectDuration=3;
  c16.isInternational=false;

  f16.getFreelancerDetails();



  Freelancer f17=new Freelancer();
  Client c17=new Client();

  f17.freelancerId=17;
  f17.freelancerName="Manoj";
  f17.skill="Flutter Dev";
  f17.hourlyRate=30;

  f17.client=c17;
  c17.clientId=117;
  c17.clientName="Paytm";
  c17.projectName="Mobile App";
  c17.projectDuration=6;
  c17.isInternational=false;

  f17.getFreelancerDetails();



  Freelancer f18=new Freelancer();
  Client c18=new Client();

  f18.freelancerId=18;
  f18.freelancerName="Priya";
  f18.skill="Illustration";
  f18.hourlyRate=20;

  f18.client=c18;
  c18.clientId=118;
  c18.clientName="Byjus";
  c18.projectName="Book Design";
  c18.projectDuration=4;
  c18.isInternational=false;

  f18.getFreelancerDetails();



  Freelancer f19=new Freelancer();
  Client c19=new Client();

  f19.freelancerId=19;
  f19.freelancerName="Rohit";
  f19.skill="SQL Dev";
  f19.hourlyRate=26;

  f19.client=c19;
  c19.clientId=119;
  c19.clientName="Accenture";
  c19.projectName="Database";
  c19.projectDuration=3;
  c19.isInternational=true;

  f19.getFreelancerDetails();



  Freelancer f20=new Freelancer();
  Client c20=new Client();

  f20.freelancerId=20;
  f20.freelancerName="Asha";
  f20.skill="Testing";
  f20.hourlyRate=18;

  f20.client=c20;
  c20.clientId=120;
  c20.clientName="Capgemini";
  c20.projectName="QA Testing";
  c20.projectDuration=4;
  c20.isInternational=true;

  f20.getFreelancerDetails();

 }
}