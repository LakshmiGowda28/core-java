class Laptop{
    int laptopId;
    String brand;

    Processor processor;

    Laptop(){}

    Laptop(Processor processor){
        this.processor = processor;
        System.out.println("Laptop constructor called");
    }

    public void createLaptop(Processor processor){
        this.processor = processor;
        System.out.println("createLaptop method called");
    }

    public void getLaptopInfo(){
        System.out.println("getLaptopInfo started");
        System.out.println("Laptop id is " + laptopId);
        System.out.println("Laptop brand is " + brand);
        System.out.println("getLaptopInfo executed");
    }
}