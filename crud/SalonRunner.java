class SalonRunner {

    public static void main(String[] args) {

        Salon s = new Salon();

        boolean added = s.addService("Haircut");
        System.out.println(added);

        added = s.addService("Facial");
        System.out.println(added);

        added = s.addService("Manicure");
        System.out.println(added);

        added = s.addService("Pedicure");
        System.out.println(added);

        added = s.addService("Hair Coloring");
        System.out.println(added);

        added = s.addService("Hair Spa");
        System.out.println(added);

        added = s.addService("Threading");
        System.out.println(added);

        s.getServices();
		
String service = s.getServiceByName("Hair Cut");
System.out.println("Service name is available");

s.updateService("Facial", "Gold Facial");
System.out.println("Service name is updated");

 s.getServices();
    }
}