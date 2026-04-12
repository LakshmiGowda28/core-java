class SuperMarketExecutor{

  public static void main(String[] args){

    SuperMarket ref = new SuperMarket();

    boolean added = ref.addProduct("Rice");
    System.out.println(added);

    added = ref.addProduct("Milk");
    System.out.println(added);

    added = ref.addProduct("Bread");
    System.out.println(added);

    added = ref.addProduct("Sugar");
    System.out.println(added);

    added = ref.addProduct("Salt");
    System.out.println(added);

    added = ref.addProduct("Oil");
    System.out.println(added);

    added = ref.addProduct("Biscuits");
    System.out.println(added);

    added = ref.addProduct("Soap");
    System.out.println(added);

    ref.getProducts();
  }
}