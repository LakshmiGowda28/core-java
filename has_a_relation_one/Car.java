class Car{
    String brand;
    int price;
    Engine engine;

    public void getCarDetails(){
        System.out.println("Brand is " + brand);
        System.out.println("Price is " + price);
        engine.getEngineDetails();
    }
}