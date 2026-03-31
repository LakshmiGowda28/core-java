class Bangles{

	String brand;
	String color;
	String material;
	double price;
	int size;
	int quantity;
	String design;
	boolean adjustable;

	Bangles(){
		System.out.println("Bangles constructor invoked");
	}

	Bangles(String brand,String color,String material,double price,int size,int quantity,String design,boolean adjustable){

		this.brand=brand;
		this.color=color;
		this.material=material;
		this.price=price;
		this.size=size;
		this.quantity=quantity;
		this.design=design;
		this.adjustable=adjustable;
	}

	public void getDisplay(){

		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Material: "+material);
		System.out.println("Price: "+price);
		System.out.println("Size: "+size);
		System.out.println("Quantity: "+quantity);
		System.out.println("Design: "+design);
		System.out.println("Adjustable: "+adjustable);

		System.out.println("----------------------");
	}
}