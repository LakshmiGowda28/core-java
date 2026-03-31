class Wallet{

	String brand;
	String color;
	String material;
	double price;
	int compartments;
	boolean waterproof;
	String type;
	int quantity;

	Wallet(){
		System.out.println("Wallet constructor invoked");
	}

	Wallet(String brand,String color,String material,double price,int compartments,boolean waterproof,String type,int quantity){

		this.brand=brand;
		this.color=color;
		this.material=material;
		this.price=price;
		this.compartments=compartments;
		this.waterproof=waterproof;
		this.type=type;
		this.quantity=quantity;
	}

	public void getDisplay(){

		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Material: "+material);
		System.out.println("Price: "+price);
		System.out.println("Compartments: "+compartments);
		System.out.println("Waterproof: "+waterproof);
		System.out.println("Type: "+type);
		System.out.println("Quantity: "+quantity);

		System.out.println("----------------------");
	}
}