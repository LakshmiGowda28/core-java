class Tv{

 int tvId;
 String brand;
 double price;
 String type;
 Remote remote;
 
 public void getTvDetails(){
	 System.out.println("TV Details are");
	 System.out.println("TV Id :" + tvId);
	 System.out.println("Brand :" + brand);
	 System.out.println("Price :" + price);
	 System.out.println("Type :" + type);
	 
	 remote.getRemoteDetails();
 }
}