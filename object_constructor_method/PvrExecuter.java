class PvrExecuter{
	public static void main(String args[]){
	Pvr pvr = new Pvr();
	Screen screen = new Screen();

	pvr.screen = screen;  

	pvr.pvrId = 1;
	pvr.location = "ForumMall";

	screen.id = 501;
	screen.type = "IMAX";

	pvr.getPvrInfo();
	}
}