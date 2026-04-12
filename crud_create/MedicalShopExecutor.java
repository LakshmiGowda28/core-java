class MedicalShopExecutor{

  public static void main(String[] args){

    MedicalShop ref = new MedicalShop();

    boolean added = ref.addMedicine("Paracetamol");
    System.out.println(added);

    added = ref.addMedicine("Crocin");
    System.out.println(added);

    added = ref.addMedicine("Dolo650");
    System.out.println(added);

    added = ref.addMedicine("Azithromycin");
    System.out.println(added);

    added = ref.addMedicine("Amoxicillin");
    System.out.println(added);

    added = ref.addMedicine("Cetrizine");
    System.out.println(added);

    added = ref.addMedicine("Pantoprazole");
    System.out.println(added);

    added = ref.addMedicine("Ibuprofen");
    System.out.println(added);

    added = ref.addMedicine("Metformin");
    System.out.println(added);

    added = ref.addMedicine("ORS");
    System.out.println(added);

    ref.getMedicines();
  }
}