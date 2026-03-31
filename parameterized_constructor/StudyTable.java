class StudyTable{

	String brand;
	String color;
	String material;
	double price;
	double height;
	double width;
	boolean foldable;
	int quantity;

	StudyTable(){
		System.out.println("StudyTable constructor invoked");
	}

	StudyTable(String brand,String color,String material,double price,double height,double width,boolean foldable,int quantity){

		this.brand=brand;
		this.color=color;
		this.material=material;
		this.price=price;
		this.height=height;
		this.width=width;
		this.foldable=foldable;
		this.quantity=quantity;
	}

	public void getDisplay(){

		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Material: "+material);
		System.out.println("Price: "+price);
		System.out.println("Height: "+height);
		System.out.println("Width: "+width);
		System.out.println("Foldable: "+foldable);
		System.out.println("Quantity: "+quantity);

		System.out.println("----------------------");
	}
}