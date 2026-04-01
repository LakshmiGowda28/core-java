class FactoryExecutor{

 public static void main(String[] args){

  Factory f1=new Factory();
  Machine m1=new Machine();

  f1.factoryId=1;
  f1.factoryName="Tata Motors";
  f1.location="Pune";
  f1.numberOfWorkers=500;
  f1.machine=m1;
  m1.machineId=101;
  m1.machineName="Lathe";
  m1.machineType="Cutting";
  m1.power=5.5;
  m1.isWorking=true;
  f1.getFactoryDetails();

  Factory f2=new Factory();
  Machine m2=new Machine();

  f2.factoryId=2;
  f2.factoryName="Bosch";
  f2.location="Bangalore";
  f2.numberOfWorkers=650;
  f2.machine=m2;
  m2.machineId=102;
  m2.machineName="Drill";
  m2.machineType="Hole";
  m2.power=4.2;
  m2.isWorking=true;

  f2.getFactoryDetails();

  Factory f3=new Factory();
  Machine m3=new Machine();

  f3.factoryId=3;
  f3.factoryName="Ashok Leyland";
  f3.location="Chennai";
  f3.numberOfWorkers=700;
  f3.machine=m3;
  m3.machineId=103;
  m3.machineName="Milling";
  m3.machineType="Shaping";
  m3.power=6.1;
  m3.isWorking=true;
  f3.getFactoryDetails();

  Factory f4=new Factory();
  Machine m4=new Machine();

  f4.factoryId=4;
  f4.factoryName="L&T";
  f4.location="Mumbai";
  f4.numberOfWorkers=800;
  f4.machine=m4;
  m4.machineId=104;
  m4.machineName="CNC";
  m4.machineType="Automatic";
  m4.power=7.0;
  m4.isWorking=true;
  f4.getFactoryDetails();

  Factory f5=new Factory();
  Machine m5=new Machine();

  f5.factoryId=5;
  f5.factoryName="BHEL";
  f5.location="Hyderabad";
  f5.numberOfWorkers=900;
  f5.machine=m5;
  m5.machineId=105;
  m5.machineName="Press";
  m5.machineType="Forming";
  m5.power=8.3;
  m5.isWorking=true;
  f5.getFactoryDetails();

  Factory f6=new Factory();
  Machine m6=new Machine();

  f6.factoryId=6;
  f6.factoryName="Mahindra";
  f6.location="Nagpur";
  f6.numberOfWorkers=550;
  f6.machine=m6;
  m6.machineId=106;
  m6.machineName="Grinder";
  m6.machineType="Finishing";
  m6.power=3.5;
  m6.isWorking=true;
  f6.getFactoryDetails();

  Factory f7=new Factory();
  Machine m7=new Machine();

  f7.factoryId=7;
  f7.factoryName="Hero";
  f7.location="Delhi";
  f7.numberOfWorkers=720;
  f7.machine=m7;
  m7.machineId=107;
  m7.machineName="Welder";
  m7.machineType="Joining";
  m7.power=5.0;
  m7.isWorking=true;
  f7.getFactoryDetails();

  Factory f8=new Factory();
  Machine m8=new Machine();

  f8.factoryId=8;
  f8.factoryName="Honda";
  f8.location="Gurgaon";
  f8.numberOfWorkers=680;
  f8.machine=m8;
  m8.machineId=108;
  m8.machineName="RobotArm";
  m8.machineType="Automation";
  m8.power=9.5;
  m8.isWorking=true;
  f8.getFactoryDetails();

  Factory f9=new Factory();
  Machine m9=new Machine();

  f9.factoryId=9;
  f9.factoryName="TVS";
  f9.location="Hosur";
  f9.numberOfWorkers=600;
  f9.machine=m9;
  m9.machineId=109;
  m9.machineName="LathePro";
  m9.machineType="Cutting";
  m9.power=5.9;
  m9.isWorking=true;
  f9.getFactoryDetails();

  Factory f10=new Factory();
  Machine m10=new Machine();

  f10.factoryId=10;
  f10.factoryName="Reliance";
  f10.location="Jamnagar";
  f10.numberOfWorkers=1000;
  f10.machine=m10;
  m10.machineId=110;
  m10.machineName="Pump";
  m10.machineType="Liquid";
  m10.power=6.6;
  m10.isWorking=true;
  f10.getFactoryDetails();

  Factory f11=new Factory();
  Machine m11=new Machine();

  f11.factoryId=11;
  f11.factoryName="Tata Steel";
  f11.location="Jamshedpur";
  f11.numberOfWorkers=1200;
  f11.machine=m11;
  m11.machineId=111;
  m11.machineName="Crusher";
  m11.machineType="Heavy";
  m11.power=10.5;
  m11.isWorking=true;

  f11.getFactoryDetails();

  Factory f12=new Factory();
  Machine m12=new Machine();

  f12.factoryId=12;
  f12.factoryName="Birla";
  f12.location="Indore";
  f12.numberOfWorkers=450;
  f12.machine=m12;
  m12.machineId=112;
  m12.machineName="Mixer";
  m12.machineType="Blend";
  m12.power=4.4;
  m12.isWorking=true;
  f12.getFactoryDetails();

  Factory f13=new Factory();
  Machine m13=new Machine();

  f13.factoryId=13;
  f13.factoryName="ITC";
  f13.location="Kolkata";
  f13.numberOfWorkers=300;
  f13.machine=m13;
  m13.machineId=113;
  m13.machineName="Packing";
  m13.machineType="Packaging";
  m13.power=3.9;
  m13.isWorking=true;

  f13.getFactoryDetails();

  Factory f14=new Factory();
  Machine m14=new Machine();

  f14.factoryId=14;
  f14.factoryName="Amul";
  f14.location="Anand";
  f14.numberOfWorkers=350;
  f14.machine=m14;
  m14.machineId=114;
  m14.machineName="Cooler";
  m14.machineType="Refrigeration";
  m14.power=5.7;
  m14.isWorking=true;
  f14.getFactoryDetails();

  Factory f15=new Factory();
  Machine m15=new Machine();

  f15.factoryId=15;
  f15.factoryName="Nestle";
  f15.location="Moga";
  f15.numberOfWorkers=500;
  f15.machine=m15;
  m15.machineId=115;
  m15.machineName="Filler";
  m15.machineType="Liquid";
  m15.power=4.8;
  m15.isWorking=true;
  f15.getFactoryDetails();

  Factory f16=new Factory();
  Machine m16=new Machine();

  f16.factoryId=16;
  f16.factoryName="Pepsi";
  f16.location="Punjab";
  f16.numberOfWorkers=430;
  f16.machine=m16;
  m16.machineId=116;
  m16.machineName="BottleLine";
  m16.machineType="Packaging";
  m16.power=6.9;
  m16.isWorking=true;
  f16.getFactoryDetails();

  Factory f17=new Factory();
  Machine m17=new Machine();

  f17.factoryId=17;
  f17.factoryName="CocaCola";
  f17.location="Noida";
  f17.numberOfWorkers=480;
  f17.machine=m17;
  m17.machineId=117;
  m17.machineName="Carbonator";
  m17.machineType="Gas";
  m17.power=7.4;
  m17.isWorking=true;
  f17.getFactoryDetails();

  Factory f18=new Factory();
  Machine m18=new Machine();

  f18.factoryId=18;
  f18.factoryName="Infosys";
  f18.location="Mysore";
  f18.numberOfWorkers=200;
  f18.machine=m18;
  m18.machineId=118;
  m18.machineName="Server";
  m18.machineType="IT";
  m18.power=2.5;
  m18.isWorking=true;
  f18.getFactoryDetails();

  Factory f19=new Factory();
  Machine m19=new Machine();

  f19.factoryId=19;
  f19.factoryName="Wipro";
  f19.location="Bangalore";
  f19.numberOfWorkers=220;
  f19.machine=m19;
  m19.machineId=119;
  m19.machineName="ComputerUnit";
  m19.machineType="IT";
  m19.power=2.2;
  m19.isWorking=true;
  f19.getFactoryDetails();

  Factory f20=new Factory();
  Machine m20=new Machine();

  f20.factoryId=20;
  f20.factoryName="Samsung";
  f20.location="Noida";
  f20.numberOfWorkers=750;
  f20.machine=m20;
  m20.machineId=120;
  m20.machineName="AssemblyLine";
  m20.machineType="Production";
  m20.power=8.8;
  m20.isWorking=true;

  f20.getFactoryDetails();

 }
}