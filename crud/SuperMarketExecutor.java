class SuperMarketExecutor{

  public static void main(String[] args){

    SuperMarket s = new SuperMarket();

    boolean added = s.addProduct("Rice");
    System.out.println(added);

    added = s.addProduct("Milk");
    System.out.println(added);

    added = s.addProduct("Bread");
    System.out.println(added);

    added = s.addProduct("Sugar");
    System.out.println(added);

    added = s.addProduct("Salt");
    System.out.println(added);

    added = s.addProduct("Oil");
    System.out.println(added);

    added = s.addProduct("Biscuits");
    System.out.println(added);

    added = s.addProduct("Soap");
    System.out.println(added);

    s.getProducts();
	
	

String product = s.getProductByName("Rice");
System.out.println("Product name is available");

s.updateProduct("Oil", "Sunflower Oil");
System.out.println("Product name is updated");

s.deleteProduct("Sugar");
System.out.println("Product name is deleted");

s.getProducts();
  }
}