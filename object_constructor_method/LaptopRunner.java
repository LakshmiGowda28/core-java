class LaptopRunner{
	public static void main(String args[]){
	Laptop laptop = new Laptop();
	Processor processor = new Processor();

	processor.id = 103;
	processor.brand = "Ryzen";

	laptop.createLaptop(processor);  
	
	laptop.laptopId = 3;
	laptop.brand = "Lenovo";

	laptop.getLaptopInfo();
	}
}