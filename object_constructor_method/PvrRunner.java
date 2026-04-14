class PvrRunner{
	public static void main(String args[]){
	Pvr pvr = new Pvr();
	Screen screen = new Screen();

	screen.id = 503;
	screen.type = "4DX";

	pvr.createPvr(screen);  
	
	pvr.pvrId = 3;
	pvr.location = "GarudaMall";

	pvr.getPvrInfo();
	}
}