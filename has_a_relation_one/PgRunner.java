class PgRunner{
    public static void main(String[] args){

        Pg pg = new Pg();
        pg.pgName = "Sri PG";
        pg.area = "Marathahalli";

        Room r = new Room();
        pg.room = r;

        r.roomNo = 101;
        r.type = "2 Sharing";

        pg.getPgDetails();
    }
}