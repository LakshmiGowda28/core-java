class ECommerce{
	Product products[] = new Product[13];
	int index;
	public boolean addProducts(Product product){
		boolean isAdded = false;
		boolean isProductIdValid = false;
		boolean isProductNameValid = false;
		boolean isManufacturedDate = false;
		boolean isCost = false;
		
		if(product.productId>0)
			isProductIdValid = true;
		else
			System.out.println(product.productId +" is not valid");
		if(product.productName != null && !product.productName.isEmpty())
			isProductNameValid = true;
		else
			System.out.println(product.productName+" is not valid");
		if(product.manufacturedDate != null)
			isManufacturedDate = true;
		else
			System.out.println("not valid date");
		if(product.cost != 0.0)
			isCost = true;
		else
			System.out.println("not a valid cost");	
		if(isProductIdValid && isProductNameValid && isManufacturedDate && isCost)
			products[index++] = product;
		return isAdded;
	}
	
	void getProducts(){
		for(Product product : products){
			System.out.println("The product id is "+product.productId);
			System.out.println("The product name is "+product.productName);
			System.out.println("The manufactured date is "+product.manufacturedDate);
			System.out.println("The cost of the product is "+product.cost);
			System.out.println("-------------------");
		}
	}
}