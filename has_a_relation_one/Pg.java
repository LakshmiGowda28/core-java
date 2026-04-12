class Pg{
    String pgName;
    String area;
    Room room;

    public void getPgDetails(){
        System.out.println("PG name is " + pgName);
        System.out.println("Area is " + area);
        room.getRoomDetails();
    }
}