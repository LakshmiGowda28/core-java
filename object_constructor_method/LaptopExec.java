class LaptopExec{
	public static void main(String args[]){
	Laptop laptop = new Laptop();
	Processor processor = new Processor();

	laptop.processor = processor;  

	laptop.laptopId = 1;
	laptop.brand = "HP";

	processor.id = 101;
	processor.brand = "Intel";

	laptop.getLaptopInfo();
	}
}