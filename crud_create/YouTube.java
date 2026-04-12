class YouTube {

String videoTitleNames[] = new String[15];
int index;

public boolean addVideoTitle(String title) {
boolean isAdded = false;
        
	if(index < videoTitleNames.length ){
    if (title != null) {
    videoTitleNames[index++] = title;
    isAdded = true;
    } else
    System.out.println("Invalid title");
    }
	else
	System.out.println("YouTube is full...");

    return isAdded;
    }

public void getVideoTitles() {
    System.out.println("List of Video Titles:");

    for (String title : videoTitleNames) {
    System.out.println(title);
    }
  }
}