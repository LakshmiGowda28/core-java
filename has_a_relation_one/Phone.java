class Phone{
    String brand;
    int price;
    Battery battery;

    public void getPhoneDetails(){
        System.out.println("Phone brand is " + brand);
        System.out.println("Phone price is " + price);
        battery.getBatteryDetails();
    }
}