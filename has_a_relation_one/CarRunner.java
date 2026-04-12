class CarRunner{
    public static void main(String[] args){

        Car car = new Car();
        car.brand = "Toyota";
        car.price = 900000;

        Engine e = new Engine();
        car.engine = e;

        e.engineNo = 111;
        e.fuelType = "Petrol";

        car.getCarDetails();
    }
}