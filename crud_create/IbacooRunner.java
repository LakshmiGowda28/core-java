class IbacooRunner{

public static void main(String[] ice){

Ibacoo i = new Ibacoo();

boolean added = i.addIceCream("ButterScotch");
System.out.println(added);

added = i.addIceCream("Chocolate");
System.out.println(added);

added = i.addIceCream("Mango");
System.out.println(added);

added = i.addIceCream("Black Current");
System.out.println(added);

added = i.addIceCream("Chikku");
System.out.println(added);

added = i.addIceCream("Strawberry");
System.out.println(added);

added = i.addIceCream("Vanilla");
System.out.println(added);

added = i.addIceCream("Blueberry");
System.out.println(added);

added = i.addIceCream("Cone");
System.out.println(added);

added = i.addIceCream("Candy");
System.out.println(added);

added = i.addIceCream("kulfi");
System.out.println(added);

i.getIceCreams();

String icecream = i.getIceCreamByName("Mango");
System.out.println(icecream + " is available");

i.updatedIceCream("Chocolate", "Chocolate cake");
System.out.println("icecream is updated");

i.getIceCreams();

}

}