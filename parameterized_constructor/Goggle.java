class Goggle{

	String brand;
	String color;
	String lensType;
	double price;
	String frameMaterial;
	boolean uvProtection;
	int quantity;
	String size;

	Goggle(){
		System.out.println("Goggle constructor invoked");
	}

	Goggle(String brand,String color,String lensType,double price,String frameMaterial,boolean uvProtection,int quantity,String size){

		this.brand=brand;
		this.color=color;
		this.lensType=lensType;
		this.price=price;
		this.frameMaterial=frameMaterial;
		this.uvProtection=uvProtection;
		this.quantity=quantity;
		this.size=size;
	}

	public void getDisplay(){

		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Lens Type: "+lensType);
		System.out.println("Price: "+price);
		System.out.println("Frame Material: "+frameMaterial);
		System.out.println("UV Protection: "+uvProtection);
		System.out.println("Quantity: "+quantity);
		System.out.println("Size: "+size);

		System.out.println("----------------------");
	}
}