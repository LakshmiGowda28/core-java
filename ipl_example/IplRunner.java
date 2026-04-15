class IplRunner{

public static void main(String[] a){

String rcblast519[] = {"W","W","L","W","_"};
String rrlast519[] = {"W","W","W","W","L"};
String pbkslast519[] = {"W","W","-","W","_"};
String srhlast519[] = {"L","W","L","L","W"};
String dclast519[] = {"W","W","L","L","_"};
String gtlast519[] = {"L","L","W","W","_"};
String lsglast519[] = {"L","W","W","L","_"};
String milast519[] = {"W","L","L","L","_"};
String csklast519[] = {"L","L","L","W","_"};
String kkrlast519[] = {"L","L","-","L","_"};

Ipl ipl = new Ipl();
Season season19 = new Season();
Table table19 = new Table();

season19.table = table19;

Team teamOne19 = new Team();
teamOne19.name="RCB";
teamOne19.matches=4;
teamOne19.won=3;
teamOne19.loss=1;
teamOne19.nrr=1.148;
teamOne19.last5=rcblast519;

Team teamTwo19 = new Team();
teamTwo19.name="RR";
teamTwo19.matches=5;
teamTwo19.won=4;
teamTwo19.loss=1;
teamTwo19.nrr=0.889;
teamTwo19.last5=rrlast519;

Team teamThree19 = new Team();
teamThree19.name="PBKS";
teamThree19.matches=4;
teamThree19.won=3;
teamThree19.loss=0;
teamThree19.nrr=0.720;
teamThree19.last5=pbkslast519;

Team teamFour19 = new Team();
teamFour19.name="SRH";
teamFour19.matches=5;
teamFour19.won=2;
teamFour19.loss=3;
teamFour19.nrr=0.576;
teamFour19.last5=srhlast519;

Team teamFive19 = new Team();
teamFive19.name="DC";
teamFive19.matches=4;
teamFive19.won=2;
teamFive19.loss=2;
teamFive19.nrr=0.322;
teamFive19.last5=dclast519;

Team teamSix19 = new Team();
teamSix19.name="GT";
teamSix19.matches=4;
teamSix19.won=2;
teamSix19.loss=2;
teamSix19.nrr=0.029;
teamSix19.last5=gtlast519;

Team teamSeven19 = new Team();
teamSeven19.name="LSG";
teamSeven19.matches=4;
teamSeven19.won=2;
teamSeven19.loss=2;
teamSeven19.nrr=0.427;
teamSeven19.last5=lsglast519;

Team teamEight19 = new Team();
teamEight19.name="MI";
teamEight19.matches=4;
teamEight19.won=2;
teamEight19.loss=2;
teamEight19.nrr=0.772;
teamEight19.last5=milast519;

Team teamNine19 = new Team();
teamNine19.name="CSK";
teamNine19.matches=4;
teamNine19.won=1;
teamNine19.loss=3;
teamNine19.nrr=1.532;
teamNine19.last5=csklast519;

Team teamTen19 = new Team();
teamTen19.name="KKR";
teamTen19.matches=4;
teamTen19.won=0;
teamTen19.loss=3;
teamTen19.nrr=1.315;
teamTen19.last5=kkrlast519;

Team teams19[] = new Team[10];

teams19[0]=teamOne19;
teams19[1]=teamTwo19;
teams19[2]=teamThree19;
teams19[3]=teamFour19;
teams19[4]=teamFive19;
teams19[5]=teamSix19;
teams19[6]=teamSeven19;
teams19[7]=teamEight19;
teams19[8]=teamNine19;
teams19[9]=teamTen19;

table19.teams=teams19;

System.out.println("SEASON 19");
for(Team t:teams19){
t.getTeamDetails();
}

System.out.println("--------------------------------");

String rcblast518[] = {"W","L","W","W","_"};
String rrlast518[] = {"W","W","L","W","L"};
String pbkslast518[] = {"L","W","W","L","_"};
String srhlast518[] = {"W","L","L","W","_"};
String dclast518[] = {"L","L","W","W","_"};
String gtlast518[] = {"W","W","W","L","_"};
String lsglast518[] = {"L","W","L","W","_"};
String milast518[] = {"W","L","L","W","_"};
String csklast518[] = {"W","W","L","L","_"};
String kkrlast518[] = {"L","W","W","L","_"};

Season season18 = new Season();
Table table18 = new Table();

season18.table = table18;

Team teamOne18 = new Team();
teamOne18.name="RCB";
teamOne18.matches=5;
teamOne18.won=3;
teamOne18.loss=2;
teamOne18.nrr=0.555;
teamOne18.last5=rcblast518;

Team teamTwo18 = new Team();
teamTwo18.name="RR";
teamTwo18.matches=5;
teamTwo18.won=4;
teamTwo18.loss=1;
teamTwo18.nrr=0.990;
teamTwo18.last5=rrlast518;

Team teamThree18 = new Team();
teamThree18.name="PBKS";
teamThree18.matches=5;
teamThree18.won=2;
teamThree18.loss=3;
teamThree18.nrr=0.120;
teamThree18.last5=pbkslast518;

Team teamFour18 = new Team();
teamFour18.name="SRH";
teamFour18.matches=5;
teamFour18.won=2;
teamFour18.loss=3;
teamFour18.nrr=0.210;
teamFour18.last5=srhlast518;

Team teamFive18 = new Team();
teamFive18.name="DC";
teamFive18.matches=5;
teamFive18.won=2;
teamFive18.loss=3;
teamFive18.nrr=-0.110;
teamFive18.last5=dclast518;

Team teamSix18 = new Team();
teamSix18.name="GT";
teamSix18.matches=5;
teamSix18.won=4;
teamSix18.loss=1;
teamSix18.nrr=1.002;
teamSix18.last5=gtlast518;

Team teamSeven18 = new Team();
teamSeven18.name="LSG";
teamSeven18.matches=5;
teamSeven18.won=3;
teamSeven18.loss=2;
teamSeven18.nrr=0.333;
teamSeven18.last5=lsglast518;

Team teamEight18 = new Team();
teamEight18.name="MI";
teamEight18.matches=5;
teamEight18.won=3;
teamEight18.loss=2;
teamEight18.nrr=0.640;
teamEight18.last5=milast518;

Team teamNine18 = new Team();
teamNine18.name="CSK";
teamNine18.matches=5;
teamNine18.won=3;
teamNine18.loss=2;
teamNine18.nrr=0.450;
teamNine18.last5=csklast518;

Team teamTen18 = new Team();
teamTen18.name="KKR";
teamTen18.matches=5;
teamTen18.won=2;
teamTen18.loss=3;
teamTen18.nrr=-0.210;
teamTen18.last5=kkrlast518;

Team teams18[] = new Team[10];

teams18[0]=teamOne18;
teams18[1]=teamTwo18;
teams18[2]=teamThree18;
teams18[3]=teamFour18;
teams18[4]=teamFive18;
teams18[5]=teamSix18;
teams18[6]=teamSeven18;
teams18[7]=teamEight18;
teams18[8]=teamNine18;
teams18[9]=teamTen18;

table18.teams=teams18;

System.out.println("SEASON 18");
for(Team t:teams18){
t.getTeamDetails();
}

System.out.println("--------------------------------");


String rcblast517[]={"L","W","W","L","_"};
String rrlast517[]={"W","L","W","W","_"};
String pbkslast517[]={"W","W","L","L","_"};
String srhlast517[]={"L","L","W","W","_"};
String dclast517[]={"W","L","L","W","_"};
String gtlast517[]={"W","W","W","W","_"};
String lsglast517[]={"L","W","L","L","_"};
String milast517[]={"W","L","W","L","_"};
String csklast517[]={"L","W","W","L","_"};
String kkrlast517[]={"W","L","L","W","_"};

Season season17=new Season();
Table table17=new Table();

season17.table=table17;

Team teamOne17=new Team();
teamOne17.name="RCB";
teamOne17.matches=5;
teamOne17.won=2;
teamOne17.loss=3;
teamOne17.nrr=0.210;
teamOne17.last5=rcblast517;

Team teamTwo17=new Team();
teamTwo17.name="RR";
teamTwo17.matches=5;
teamTwo17.won=3;
teamTwo17.loss=2;
teamTwo17.nrr=0.870;
teamTwo17.last5=rrlast517;

Team teamThree17=new Team();
teamThree17.name="PBKS";
teamThree17.matches=5;
teamThree17.won=2;
teamThree17.loss=3;
teamThree17.nrr=0.020;
teamThree17.last5=pbkslast517;

Team teamFour17=new Team();
teamFour17.name="SRH";
teamFour17.matches=5;
teamFour17.won=2;
teamFour17.loss=3;
teamFour17.nrr=-0.200;
teamFour17.last5=srhlast517;

Team teamFive17=new Team();
teamFive17.name="DC";
teamFive17.matches=5;
teamFive17.won=2;
teamFive17.loss=3;
teamFive17.nrr=0.100;
teamFive17.last5=dclast517;

Team teamSix17=new Team();
teamSix17.name="GT";
teamSix17.matches=5;
teamSix17.won=5;
teamSix17.loss=0;
teamSix17.nrr=1.450;
teamSix17.last5=gtlast517;

Team teamSeven17=new Team();
teamSeven17.name="LSG";
teamSeven17.matches=5;
teamSeven17.won=1;
teamSeven17.loss=4;
teamSeven17.nrr=-0.500;
teamSeven17.last5=lsglast517;

Team teamEight17=new Team();
teamEight17.name="MI";
teamEight17.matches=5;
teamEight17.won=3;
teamEight17.loss=2;
teamEight17.nrr=0.660;
teamEight17.last5=milast517;

Team teamNine17=new Team();
teamNine17.name="CSK";
teamNine17.matches=5;
teamNine17.won=3;
teamNine17.loss=2;
teamNine17.nrr=0.400;
teamNine17.last5=csklast517;

Team teamTen17=new Team();
teamTen17.name="KKR";
teamTen17.matches=5;
teamTen17.won=2;
teamTen17.loss=3;
teamTen17.nrr=-0.100;
teamTen17.last5=kkrlast517;

Team teams17[]=new Team[10];

teams17[0]=teamOne17;
teams17[1]=teamTwo17;
teams17[2]=teamThree17;
teams17[3]=teamFour17;
teams17[4]=teamFive17;
teams17[5]=teamSix17;
teams17[6]=teamSeven17;
teams17[7]=teamEight17;
teams17[8]=teamNine17;
teams17[9]=teamTen17;

table17.teams=teams17;

System.out.println("SEASON 17");
for(Team t:teams17){
t.getTeamDetails();
}

System.out.println("--------------------------------");


String rcblast516[]={"W","L","L","W","_"};
String rrlast516[]={"W","W","L","L","_"};
String pbkslast516[]={"L","L","W","W","_"};
String srhlast516[]={"W","L","W","L","_"};
String dclast516[]={"L","W","L","W","_"};
String gtlast516[]={"W","W","W","L","_"};
String lsglast516[]={"L","L","W","L","_"};
String milast516[]={"W","W","L","W","_"};
String csklast516[]={"W","L","W","L","_"};
String kkrlast516[]={"L","W","L","W","_"};

Season season16=new Season();
Table table16=new Table();

season16.table=table16;

Team teamOne16=new Team();
teamOne16.name="RCB";
teamOne16.matches=5;
teamOne16.won=3;
teamOne16.loss=2;
teamOne16.nrr=0.450;
teamOne16.last5=rcblast516;

Team teamTwo16=new Team();
teamTwo16.name="RR";
teamTwo16.matches=5;
teamTwo16.won=3;
teamTwo16.loss=2;
teamTwo16.nrr=0.620;
teamTwo16.last5=rrlast516;

Team teamThree16=new Team();
teamThree16.name="PBKS";
teamThree16.matches=5;
teamThree16.won=2;
teamThree16.loss=3;
teamThree16.nrr=-0.050;
teamThree16.last5=pbkslast516;

Team teamFour16=new Team();
teamFour16.name="SRH";
teamFour16.matches=5;
teamFour16.won=3;
teamFour16.loss=2;
teamFour16.nrr=0.310;
teamFour16.last5=srhlast516;

Team teamFive16=new Team();
teamFive16.name="DC";
teamFive16.matches=5;
teamFive16.won=2;
teamFive16.loss=3;
teamFive16.nrr=-0.120;
teamFive16.last5=dclast516;

Team teamSix16=new Team();
teamSix16.name="GT";
teamSix16.matches=5;
teamSix16.won=4;
teamSix16.loss=1;
teamSix16.nrr=1.210;
teamSix16.last5=gtlast516;

Team teamSeven16=new Team();
teamSeven16.name="LSG";
teamSeven16.matches=5;
teamSeven16.won=1;
teamSeven16.loss=4;
teamSeven16.nrr=-0.600;
teamSeven16.last5=lsglast516;

Team teamEight16=new Team();
teamEight16.name="MI";
teamEight16.matches=5;
teamEight16.won=4;
teamEight16.loss=1;
teamEight16.nrr=1.050;
teamEight16.last5=milast516;

Team teamNine16=new Team();
teamNine16.name="CSK";
teamNine16.matches=5;
teamNine16.won=3;
teamNine16.loss=2;
teamNine16.nrr=0.520;
teamNine16.last5=csklast516;

Team teamTen16=new Team();
teamTen16.name="KKR";
teamTen16.matches=5;
teamTen16.won=2;
teamTen16.loss=3;
teamTen16.nrr=-0.200;
teamTen16.last5=kkrlast516;

Team teams16[]=new Team[10];

teams16[0]=teamOne16;
teams16[1]=teamTwo16;
teams16[2]=teamThree16;
teams16[3]=teamFour16;
teams16[4]=teamFive16;
teams16[5]=teamSix16;
teams16[6]=teamSeven16;
teams16[7]=teamEight16;
teams16[8]=teamNine16;
teams16[9]=teamTen16;

table16.teams=teams16;

System.out.println("SEASON 16");
for(Team t:teams16){
t.getTeamDetails();
}

System.out.println("--------------------------------");

String rcblast515[]={"L","W","W","W","_"};
String rrlast515[]={"W","L","W","L","_"};
String pbkslast515[]={"L","W","L","W","_"};
String srhlast515[]={"W","W","L","W","_"};
String dclast515[]={"L","L","W","L","_"};
String gtlast515[]={"W","W","W","W","_"};
String lsglast515[]={"L","W","L","L","_"};
String milast515[]={"W","L","W","W","_"};
String csklast515[]={"W","W","W","L","_"};
String kkrlast515[]={"L","L","W","W","_"};

Season season15=new Season();
Table table15=new Table();

season15.table=table15;

Team teamOne15=new Team();
teamOne15.name="RCB";
teamOne15.matches=5;
teamOne15.won=3;
teamOne15.loss=2;
teamOne15.nrr=0.650;
teamOne15.last5=rcblast515;

Team teamTwo15=new Team();
teamTwo15.name="RR";
teamTwo15.matches=5;
teamTwo15.won=2;
teamTwo15.loss=3;
teamTwo15.nrr=-0.100;
teamTwo15.last5=rrlast515;

Team teamThree15=new Team();
teamThree15.name="PBKS";
teamThree15.matches=5;
teamThree15.won=2;
teamThree15.loss=3;
teamThree15.nrr=-0.250;
teamThree15.last5=pbkslast515;

Team teamFour15=new Team();
teamFour15.name="SRH";
teamFour15.matches=5;
teamFour15.won=4;
teamFour15.loss=1;
teamFour15.nrr=1.200;
teamFour15.last5=srhlast515;

Team teamFive15=new Team();
teamFive15.name="DC";
teamFive15.matches=5;
teamFive15.won=1;
teamFive15.loss=4;
teamFive15.nrr=-0.800;
teamFive15.last5=dclast515;

Team teamSix15=new Team();
teamSix15.name="GT";
teamSix15.matches=5;
teamSix15.won=5;
teamSix15.loss=0;
teamSix15.nrr=1.800;
teamSix15.last5=gtlast515;

Team teamSeven15=new Team();
teamSeven15.name="LSG";
teamSeven15.matches=5;
teamSeven15.won=1;
teamSeven15.loss=4;
teamSeven15.nrr=-0.600;
teamSeven15.last5=lsglast515;

Team teamEight15=new Team();
teamEight15.name="MI";
teamEight15.matches=5;
teamEight15.won=4;
teamEight15.loss=1;
teamEight15.nrr=1.000;
teamEight15.last5=milast515;

Team teamNine15=new Team();
teamNine15.name="CSK";
teamNine15.matches=5;
teamNine15.won=4;
teamNine15.loss=1;
teamNine15.nrr=1.300;
teamNine15.last5=csklast515;

Team teamTen15=new Team();
teamTen15.name="KKR";
teamTen15.matches=5;
teamTen15.won=2;
teamTen15.loss=3;
teamTen15.nrr=-0.200;
teamTen15.last5=kkrlast515;

Team teams15[]=new Team[10];

teams15[0]=teamOne15;
teams15[1]=teamTwo15;
teams15[2]=teamThree15;
teams15[3]=teamFour15;
teams15[4]=teamFive15;
teams15[5]=teamSix15;
teams15[6]=teamSeven15;
teams15[7]=teamEight15;
teams15[8]=teamNine15;
teams15[9]=teamTen15;

table15.teams=teams15;

System.out.println("SEASON 15");
for(Team t:teams15){
t.getTeamDetails();
}

System.out.println("--------------------------------");
}
}