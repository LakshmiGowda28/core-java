class Banglore{

int pincodes[] = new int[5];
int index;

public boolean addPincode(int pincode){
boolean isPincodeAdded = false;
 
if(pincode > 0) 
{
pincodes[index++] = pincode;
isPincodeAdded = true;
}

else
System.out.println(pincode + "is not valid");


return isPincodeAdded;
}
 
public void getPincodes(){

System.out.println("The list of pincodes are :");

for(int pincode : pincodes)
System.out.println(pincode);
} 


}