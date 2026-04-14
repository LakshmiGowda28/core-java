class PvrExecutorOne{
    public static void main(String[] args){
        Screen screen = new Screen();

        screen.id = 502;
        screen.type = "3D";

        Pvr pvr = new Pvr(screen);

        pvr.pvrId = 2;
        pvr.location = "OrionMall";

        pvr.getPvrInfo();
    }
}