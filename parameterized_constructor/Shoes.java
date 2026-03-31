class Shoes{

	String brand;
	String color;
	int size;
	double price;
	String type;
	String material;
	int quantity;
	boolean waterproof;

	Shoes(){
		System.out.println("Shoes constructor invoked");
	}

	Shoes(String brand,String color,int size,double price,String type,String material,int quantity,boolean waterproof){
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.price=price;
		this.type=type;
		this.material=material;
		this.quantity=quantity;
		this.waterproof=waterproof;
	}

	public void getDisplay(){
		System.out.println(brand);
		System.out.println(color);
		System.out.println(size);
		System.out.println(price);
		System.out.println(type);
		System.out.println(material);
		System.out.println(quantity);
		System.out.println(waterproof);
		System.out.println("----------------");
	}
}