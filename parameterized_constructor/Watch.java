class Watch{

	String brand;
	String color;
	String type;
	double price;
	String material;
	boolean waterproof;
	String displayType;
	int quantity;

	Watch(){
		System.out.println("Watch constructor invoked");
	}

	Watch(String brand,String color,String type,double price,String material,boolean waterproof,String displayType,int quantity){

		this.brand=brand;
		this.color=color;
		this.type=type;
		this.price=price;
		this.material=material;
		this.waterproof=waterproof;
		this.displayType=displayType;
		this.quantity=quantity;
	}

	public void getDisplay(){

		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);
		System.out.println("Price: "+price);
		System.out.println("Material: "+material);
		System.out.println("Waterproof: "+waterproof);
		System.out.println("Display Type: "+displayType);
		System.out.println("Quantity: "+quantity);

		System.out.println("----------------------");
	}
}