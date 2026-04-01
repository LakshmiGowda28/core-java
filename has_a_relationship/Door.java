class Door{

 int doorId;
 String material;
 String color;
 double height;
 Lock lock;

 public void getDoorDetails(){

  System.out.println("Door Details");
  System.out.println("Door Id : " + doorId);
  System.out.println("Material : " + material);
  System.out.println("Color : " + color);
  System.out.println("Height : " + height);

  lock.getLockDetails();
 }
}