class DigitalZone {

  String laptopBrandNames[] = new String[6];
  int index;

  public boolean addLaptopBrand(String brand){
    boolean isLaptopBrandAdded = false;

    if(index < laptopBrandNames.length){
      if(brand != null && !brand.isEmpty()){

        laptopBrandNames[index++] = brand;
        isLaptopBrandAdded = true;
      }
      else
        System.out.println(brand + " is not valid");
    }
    else
      System.out.println("Laptop brand list is full");

    return isLaptopBrandAdded;
  }

  public void getLaptopBrands(){
    System.out.println("Laptop Brand Names are:");
    for(String brand : laptopBrandNames){
      System.out.println(brand);
    }
  }

}