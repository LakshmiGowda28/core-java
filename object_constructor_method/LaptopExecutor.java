class LaptopExecutor{
    public static void main(String[] args){
        Processor processor = new Processor();

        processor.id = 1;
        processor.brand = "Intel";

        Laptop laptop = new Laptop(processor);

        laptop.laptopId = 101;
        laptop.brand = "HP";

        laptop.getLaptopInfo();
    }
}