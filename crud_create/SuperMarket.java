class SuperMarket{

String productNames[] = new String[8];
int index;

public boolean addProduct(String product){
boolean isProductAdded = false;

    if(index < productNames.length){
    if(product != null && !product.isEmpty()){

        productNames[index++] = product;
        isProductAdded = true;
    }
    else
    System.out.println(product + " is not valid");
    }
    else
    System.out.println("Product list is full");

    return isProductAdded;
  }

public void getProducts(){
System.out.println("SuperMarket Products are:");
    for(String product : productNames)
    System.out.println(product);
   
  }

}