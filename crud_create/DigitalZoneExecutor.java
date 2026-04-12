class DigitalZoneExecutor{

  public static void main(String[] args){

    DigitalZone ref = new DigitalZone();

    boolean added = ref.addLaptopBrand("HP");
    System.out.println(added);

    added = ref.addLaptopBrand("Dell");
    System.out.println(added);

    added = ref.addLaptopBrand("Lenovo");
    System.out.println(added);

    added = ref.addLaptopBrand("ASUS");
    System.out.println(added);

    added = ref.addLaptopBrand("Acer");
    System.out.println(added);

    added = ref.addLaptopBrand("Apple");
    System.out.println(added);

    ref.getLaptopBrands();
  }
}