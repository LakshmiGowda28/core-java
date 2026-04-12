class BangloreRunner{

public static void main(String[] a){

Banglore b = new Banglore();

boolean added = b.addPincode(574239);
System.out.println(added);

added = b.addPincode(560049);
System.out.println(added);

added = b.addPincode(423921);
System.out.println(added);

added = b.addPincode(533329);
System.out.println(added);

added = b.addPincode(590830);
System.out.println(added);

b.getPincodes();
}

}