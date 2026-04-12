class Trip {

String placeNames[] = new String[13];
int index;

public boolean addPlace(String place) {
boolean isPlaceAdded = false;

if(index < placeNames.length) {
if(place != null && !place.isEmpty()) {
    placeNames[index++] = place;
    isPlaceAdded = true;
    } 
    else 
    System.out.println(place + " is not valid");
    }
    else 
    System.out.println("Trip places list is full");
        
return isPlaceAdded;
    }
	
public void getPlaces() {
System.out.println("Trip Places are:");
        for(String place : placeNames)
        System.out.println(place);
       
    }

}
