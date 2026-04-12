class Ibacoo{

String iceCreams[] = new String[10];
int index;

public boolean addIceCream (String iceCream){ 

boolean isIceCreamAdded = false;
  
  if(index < iceCreams.length ){
  if(iceCream != null && !iceCream.isEmpty()){
  iceCreams[index++] = iceCream;
  isIceCreamAdded = true;
  }
  else
  System.out.println(iceCream + " not valid");
  } 
  else
	System.out.println("Ibacoo is full.....") ; 
  
  return isIceCreamAdded;

}

public void getIceCreams(){
System.out.println("The list of IceCreams are :");

for(String iceCream : iceCreams)
System.out.println(iceCream);

}

public String getIceCreamByName(String iceCreamName){
	String name = null;
	
	for(String iceCream : iceCreams){
		if(iceCream == iceCreamName){
			name = iceCream;
			break;
		}
    }
	
	if(name == null)
    System.out.println("icecream is not found");
	
	return name;
    }
	
public boolean updatedIceCream(String existingIceCreamName, String UpdatedIceCreamName)	{
	
	boolean isIceCreamUpdated = false;
	
	for ( int index = 0; index < iceCreams.length; index++){ 
	
		if(iceCreams[index] == existingIceCreamName){
			iceCreams[index] = UpdatedIceCreamName;
			isIceCreamUpdated = true;
		}
	if(isIceCreamUpdated == false){
		System.out.println(existingIceCreamName + "is not found");
	}	
	}
	return isIceCreamUpdated;
	
	
}
}