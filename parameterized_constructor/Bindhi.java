class Bindhi{

	String brand;
	String color;
	String shape;
	double price;
	String size;
	int quantity;
	boolean waterproof;
	String material;

	Bindhi(){
		System.out.println("Bindhi constructor invoked");
	}

	Bindhi(String brand,String color,String shape,double price,String size,int quantity,boolean waterproof,String material){

		this.brand=brand;
		this.color=color;
		this.shape=shape;
		this.price=price;
		this.size=size;
		this.quantity=quantity;
		this.waterproof=waterproof;
		this.material=material;
	}

	public void getDisplay(){

		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Shape: "+shape);
		System.out.println("Price: "+price);
		System.out.println("Size: "+size);
		System.out.println("Quantity: "+quantity);
		System.out.println("Waterproof: "+waterproof);
		System.out.println("Material: "+material);

		System.out.println("----------------------");
	}
}