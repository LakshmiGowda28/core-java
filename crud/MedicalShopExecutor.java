class MedicalShopExecutor{

  public static void main(String[] args){

    MedicalShop m = new MedicalShop();

    boolean added = m.addMedicine("Paracetamol");
    System.out.println(added);

    added = m.addMedicine("Crocin");
    System.out.println(added);

    added = m.addMedicine("Dolo");
    System.out.println(added);

    added = m.addMedicine("Azithromycin");
    System.out.println(added);

    added = m.addMedicine("Amoxicillin");
    System.out.println(added);

    added = m.addMedicine("Cetrizine");
    System.out.println(added);

    added = m.addMedicine("Pantoprazole");
    System.out.println(added);

    added = m.addMedicine("Ibuprofen");
    System.out.println(added);

    added = m.addMedicine("Metformin");
    System.out.println(added);

    added = m.addMedicine("ORS");
    System.out.println(added);

    m.getMedicines();
	
String medicine = m.getMedicineByName("Paracetamol");
System.out.println("Medicine name is available");

m.updateMedicine("Dolo", "Dolo 650");
System.out.println("Medicine name is updated");	

m.deleteMedicine("Paracetamol");
System.out.println("Medicine is deleted");

m.getMedicines();
  }
}