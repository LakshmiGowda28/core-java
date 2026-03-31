class Ring{

	String brand;
	String color;
	String material;
	double price;
	int size;
	String design;
	boolean adjustable;
	int quantity;

	Ring(){
		System.out.println("Ring constructor invoked");
	}

	Ring(String brand,String color,String material,double price,int size,String design,boolean adjustable,int quantity){

		this.brand=brand;
		this.color=color;
		this.material=material;
		this.price=price;
		this.size=size;
		this.design=design;
		this.adjustable=adjustable;
		this.quantity=quantity;
	}

	public void getDisplay(){

		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Material: "+material);
		System.out.println("Price: "+price);
		System.out.println("Size: "+size);
		System.out.println("Design: "+design);
		System.out.println("Adjustable: "+adjustable);
		System.out.println("Quantity: "+quantity);

		System.out.println("----------------------");
	}
}