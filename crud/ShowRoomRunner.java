class ShowRoomRunner {

    public static void main(String[] args) {

        ShowRoom s = new ShowRoom();

        boolean added = s.addManager("Ramesh");
        System.out.println(added);

        added = s.addManager("Suresh");
        System.out.println(added);

        added = s.addManager("Mahesh");
        System.out.println(added);

        added = s.addManager("Naresh");
        System.out.println(added);

        added = s.addManager("Rajesh");
        System.out.println(added);

        added = s.addManager("Ganesh");
        System.out.println(added);

        added = s.addManager("Dinesh");
        System.out.println(added);

        added = s.addManager("Lokesh");
        System.out.println(added);

    s.getManagers();
	
String manager = s.getManagerByName("Rajesh");
System.out.println("Manager name is available");

s.updateManager("Ramesh", "Ramesh Kumar");
System.out.println("Manager name is updated");

s.deleteManager("Suresh");
System.out.println("Manager name is deleted");	

s.getManagers();
    }
}