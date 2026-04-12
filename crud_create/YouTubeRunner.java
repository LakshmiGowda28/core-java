class YouTubeRunner {

public static void main(String[] video) {

YouTube yt = new YouTube();

boolean added = yt.addVideoTitle("Java Tutorial");
System.out.println(added);

added = yt.addVideoTitle("OOP Concepts");
System.out.println(added);
	
added = yt.addVideoTitle("Data Structures");
System.out.println(added);
	
added =	yt.addVideoTitle("Reels");
System.out.println(added);
	
added =	yt.addVideoTitle("Dance video");
System.out.println(added);
	
added =	yt.addVideoTitle("Shorts");
System.out.println(added);
	
added =	yt.addVideoTitle("vlogs");
System.out.println(added);
	
added =	yt.addVideoTitle("Cooking Recipies");
System.out.println(added);
	
added =	yt.addVideoTitle("Movies");
System.out.println(added);
	
added =	yt.addVideoTitle("Songs");
System.out.println(added);
	
added =	yt.addVideoTitle("Cartoons");
System.out.println(added);
	
added =	yt.addVideoTitle("Data Structures");
System.out.println(added);
	
added =	yt.addVideoTitle("Data Structures");
System.out.println(added);
	
added =	yt.addVideoTitle("Data Structures");
System.out.println(added);
	
added =	yt.addVideoTitle("Data Structures");
System.out.println(added);	
	

yt.getVideoTitles();
	
    }
}