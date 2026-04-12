class ECommerceExecuter{
	public static void main(String args[]){
	ECommerce e = new ECommerce();
	Product p = new Product();
	
	p.productId = 1;
	p.productName = "Purse";
	p.manufacturedDate = "05/06/2025";
	p.cost = 850.00;
	
	Product pTwo = new Product();
	pTwo.productId = 2;
	pTwo.productName = "Bag";
	pTwo.manufacturedDate = "10/4/2024";
	pTwo.cost = 600.00;
	
	Product pThree = new Product();
	pThree.productId = 3;
	pThree.productName = "Phone";
	pThree.manufacturedDate = "16/12/2025";
	pThree.cost = 500.00;
	
	Product p4 = new Product();
	p4.productId = 4;
	p4.productName = "Toy";
	p4.manufacturedDate = "5/4/2026";
	p4.cost = 950.00;
	
	Product p5 = new Product();
	p5.productId = 5;
	p5.productName = "TV";
	p5.manufacturedDate = "9/3/2026";
	p5.cost = 700.00;
	
	Product p6 = new Product();
	p6.productId = 6;
	p6.productName = "Bulb";
	p6.manufacturedDate = "12/2/2026";
	p6.cost = 90.00;
	
	Product p7 = new Product();
	p7.productId = 7;
	p7.productName = "air dryer";
	p7.manufacturedDate = "18/3/2026";
	p7.cost = 4500.00;
	
	Product p8 = new Product();
	p8.productId = 8;
	p8.productName = "juicer";
	p8.manufacturedDate = "19/1/2026";
	p8.cost = 6500.00;
	
	Product p9 = new Product();
	p9.productId = 9;
	p9.productName = "weighing machine";
	p9.manufacturedDate = "11/06/2025";
	p9.cost = 4500.00;
	
	Product p10 = new Product();
	p10.productId = 10;
	p10.productName = "Pouch";
	p10.manufacturedDate= "15/3/2026";
	p10.cost = 429.00;
	
	Product p11 = new Product();
	p11.productId = 11;
	p11.productName = "kettle";
	p11.manufacturedDate = "15/1/2026";
	p11.cost = 451.23;
	Product p12 = new Product();
	p12.productId = 12;
	p12.productName = "bag";
	p12.manufacturedDate = "25/3/2026";
	p12.cost = 900.87;
	
	Product p13 = new Product();
	p13.productId = 13;
	p13.productName = "clock";
	p13.manufacturedDate = "01/04/2026";
	p13.cost = 256.23;
	
	e.getProducts();
	}
}