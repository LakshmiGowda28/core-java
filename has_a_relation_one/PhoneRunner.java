class PhoneRunner{
    public static void main(String[] args){

    Phone phone = new Phone();
    phone.brand = "Realme";
    phone.price = 18000;

    Battery battery = new Battery();
    phone.battery = battery;

    battery.capacity = 5000;
    battery.type = "Lion";

    phone.getPhoneDetails();
    }
}