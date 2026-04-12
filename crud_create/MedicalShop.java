class MedicalShop{

  String medicineNames[] = new String[10];
  int index;

  public boolean addMedicine(String medicine){
    boolean isMedicineAdded = false;

    if(index < medicineNames.length){
      if(medicine != null && !medicine.isEmpty()){

        medicineNames[index++] = medicine;
        isMedicineAdded = true;
      }
      else
        System.out.println(medicine + " is not valid");
    }
    else
      System.out.println("Medicine list is full");

    return isMedicineAdded;
  }

  public void getMedicines(){
    System.out.println("Medical Shop Medicines are:");
    for(String medicine : medicineNames){
      System.out.println(medicine);
    }
  }

}