class GymExecutor{

 public static void main(String[] args){

  Gym g1=new Gym();
  Trainer t1=new Trainer();

  g1.gymId=1;
  g1.gymName="Gold Gym";
  g1.location="Bangalore";
  g1.totalMembers=250;
  g1.trainer=t1;
  t1.trainerId=101;
  t1.trainerName="Rahul";
  t1.specialization="Weight Loss";
  t1.experienceYears=5;
  t1.isCertified=true;

  g1.getGymDetails();

  Gym g2=new Gym();
  Trainer t2=new Trainer();

  g2.gymId=2;
  g2.gymName="CultFit";
  g2.location="Mysore";
  g2.totalMembers=180;
  g2.trainer=t2;
  t2.trainerId=102;
  t2.trainerName="Sneha";
  t2.specialization="Yoga";
  t2.experienceYears=6;
  t2.isCertified=true;

  g2.getGymDetails();

  Gym g3=new Gym();
  Trainer t3=new Trainer();

  g3.gymId=3;
  g3.gymName="PowerHouse";
  g3.location="Tumkur";
  g3.totalMembers=120;
  g3.trainer=t3;
  t3.trainerId=103;
  t3.trainerName="Kiran";
  t3.specialization="Bodybuilding";
  t3.experienceYears=8;
  t3.isCertified=true;

  g3.getGymDetails();

  Gym g4=new Gym();
  Trainer t4=new Trainer();

  g4.gymId=4;
  g4.gymName="FitnessZone";
  g4.location="Chennai";
  g4.totalMembers=200;
  g4.trainer=t4;
  t4.trainerId=104;
  t4.trainerName="Divya";
  t4.specialization="Cardio";
  t4.experienceYears=4;
  t4.isCertified=true;

  g4.getGymDetails();

  Gym g5=new Gym();
  Trainer t5=new Trainer();

  g5.gymId=5;
  g5.gymName="MuscleFactory";
  g5.location="Hyderabad";
  g5.totalMembers=300;
  g5.trainer=t5;
  t5.trainerId=105;
  t5.trainerName="Arjun";
  t5.specialization="Strength";
  t5.experienceYears=7;
  t5.isCertified=true;

  g5.getGymDetails();

  Gym g6=new Gym();
  Trainer t6=new Trainer();

  g6.gymId=6;
  g6.gymName="IronClub";
  g6.location="Pune";
  g6.totalMembers=170;
  g6.trainer=t6;
  t6.trainerId=106;
  t6.trainerName="Megha";
  t6.specialization="Zumba";
  t6.experienceYears=5;
  t6.isCertified=true;

  g6.getGymDetails();

  Gym g7=new Gym();
  Trainer t7=new Trainer();

  g7.gymId=7;
  g7.gymName="FitLife";
  g7.location="Delhi";
  g7.totalMembers=260;
  g7.trainer=t7;
  t7.trainerId=107;
  t7.trainerName="Vikram";
  t7.specialization="CrossFit";
  t7.experienceYears=9;
  t7.isCertified=true;

  g7.getGymDetails();

  Gym g8=new Gym();
  Trainer t8=new Trainer();

  g8.gymId=8;
  g8.gymName="BodyZone";
  g8.location="Goa";
  g8.totalMembers=90;
  g8.trainer=t8;
  t8.trainerId=108;
  t8.trainerName="Pooja";
  t8.specialization="Yoga";
  t8.experienceYears=6;
  t8.isCertified=true;

  g8.getGymDetails();

  Gym g9=new Gym();
  Trainer t9=new Trainer();

  g9.gymId=9;
  g9.gymName="FitnessWorld";
  g9.location="Kolkata";
  g9.totalMembers=210;
  g9.trainer=t9;
  t9.trainerId=109;
  t9.trainerName="Ramesh";
  t9.specialization="Weight Loss";
  t9.experienceYears=10;
  t9.isCertified=true;

  g9.getGymDetails();

  Gym g10=new Gym();
  Trainer t10=new Trainer();

  g10.gymId=10;
  g10.gymName="ActiveGym";
  g10.location="Mumbai";
  g10.totalMembers=320;
  g10.trainer=t10;
  t10.trainerId=110;
  t10.trainerName="Ananya";
  t10.specialization="Pilates";
  t10.experienceYears=5;
  t10.isCertified=true;

  g10.getGymDetails();

  Gym g11=new Gym();
  Trainer t11=new Trainer();

  g11.gymId=11;
  g11.gymName="FitClub";
  g11.location="Jaipur";
  g11.totalMembers=140;
  g11.trainer=t11;
  t11.trainerId=111;
  t11.trainerName="Harish";
  t11.specialization="Strength";
  t11.experienceYears=7;
  t11.isCertified=true;

  g11.getGymDetails();

  Gym g12=new Gym();
  Trainer t12=new Trainer();

  g12.gymId=12;
  g12.gymName="ProFitness";
  g12.location="Surat";
  g12.totalMembers=160;
  g12.trainer=t12;
  t12.trainerId=112;
  t12.trainerName="Swathi";
  t12.specialization="Yoga";
  t12.experienceYears=6;
  t12.isCertified=true;

  g12.getGymDetails();

  Gym g13=new Gym();
  Trainer t13=new Trainer();

  g13.gymId=13;
  g13.gymName="MuscleGym";
  g13.location="Nagpur";
  g13.totalMembers=180;
  g13.trainer=t13;
  t13.trainerId=113;
  t13.trainerName="Deepak";
  t13.specialization="Cardio";
  t13.experienceYears=4;
  t13.isCertified=true;

  g13.getGymDetails();

  Gym g14=new Gym();
  Trainer t14=new Trainer();

  g14.gymId=14;
  g14.gymName="FlexGym";
  g14.location="Indore";
  g14.totalMembers=130;
  g14.trainer=t14;
  t14.trainerId=114;
  t14.trainerName="Kavya";
  t14.specialization="Zumba";
  t14.experienceYears=5;
  t14.isCertified=true;

  g14.getGymDetails();

  Gym g15=new Gym();
  Trainer t15=new Trainer();

  g15.gymId=15;
  g15.gymName="ShapeUp";
  g15.location="Patna";
  g15.totalMembers=110;
  g15.trainer=t15;
  t15.trainerId=115;
  t15.trainerName="Ajay";
  t15.specialization="CrossFit";
  t15.experienceYears=8;
  t15.isCertified=true;

  g15.getGymDetails();

  Gym g16=new Gym();
  Trainer t16=new Trainer();

  g16.gymId=16;
  g16.gymName="BodyFit";
  g16.location="Udupi";
  g16.totalMembers=95;
  g16.trainer=t16;
  t16.trainerId=116;
  t16.trainerName="Neha";
  t16.specialization="Yoga";
  t16.experienceYears=6;
  t16.isCertified=true;

  g16.getGymDetails();

  Gym g17=new Gym();
  Trainer t17=new Trainer();

  g17.gymId=17;
  g17.gymName="PowerGym";
  g17.location="Belgaum";
  g17.totalMembers=175;
  g17.trainer=t17;
  t17.trainerId=117;
  t17.trainerName="Manoj";
  t17.specialization="Strength";
  t17.experienceYears=9;
  t17.isCertified=true;

  g17.getGymDetails();

  Gym g18=new Gym();
  Trainer t18=new Trainer();

  g18.gymId=18;
  g18.gymName="EnergyGym";
  g18.location="Mangalore";
  g18.totalMembers=150;
  g18.trainer=t18;
  t18.trainerId=118;
  t18.trainerName="Priya";
  t18.specialization="Pilates";
  t18.experienceYears=5;
  t18.isCertified=true;
  g18.getGymDetails();

  Gym g19=new Gym();
  Trainer t19=new Trainer();

  g19.gymId=19;
  g19.gymName="FitPower";
  g19.location="Coimbatore";
  g19.totalMembers=200;
  g19.trainer=t19;
  t19.trainerId=119;
  t19.trainerName="Ravi";
  t19.specialization="Weight Loss";
  t19.experienceYears=10;
  t19.isCertified=true;
  g19.getGymDetails();

  Gym g20=new Gym();
  Trainer t20=new Trainer();
  g20.gymId=20;
  g20.gymName="UltimateFitness";
  g20.location="Chandigarh";
  g20.totalMembers=240;
  g20.trainer=t20;
  t20.trainerId=120;
  t20.trainerName="Asha";
  t20.specialization="Yoga";
  t20.experienceYears=7;
  t20.isCertified=true;
  g20.getGymDetails();

 }
}