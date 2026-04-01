class RestaurantExecutor{

 public static void main(String[] args){

  Restaurant r1=new Restaurant();
  Chef c1=new Chef();

  r1.restaurantId=1;
  r1.restaurantName="Empire";
  r1.location="Bangalore";
  r1.cuisineType="MultiCuisine";
  r1.chef=c1;
  c1.chefId=101;
  c1.chefName="Ramesh";
  c1.experienceYears=12;
  c1.speciality="Biryani";
  c1.isFamous=true;
  r1.getRestaurantDetails();

  Restaurant r2=new Restaurant();
  Chef c2=new Chef();

  r2.restaurantId=2;
  r2.restaurantName="Meghana Foods";
  r2.location="Bangalore";
  r2.cuisineType="Andhra";
  r2.chef=c2;
  c2.chefId=102;
  c2.chefName="Suresh";
  c2.experienceYears=15;
  c2.speciality="Chicken Biryani";
  c2.isFamous=true;

  r2.getRestaurantDetails();

  Restaurant r3=new Restaurant();
  Chef c3=new Chef();

  r3.restaurantId=3;
  r3.restaurantName="Udupi Upahar";
  r3.location="Mysore";
  r3.cuisineType="South Indian";
  r3.chef=c3;
  c3.chefId=103;
  c3.chefName="Ganesh";
  c3.experienceYears=10;
  c3.speciality="Dosa";
  c3.isFamous=true;
  r3.getRestaurantDetails();

  Restaurant r4=new Restaurant();
  Chef c4=new Chef();

  r4.restaurantId=4;
  r4.restaurantName="Barbeque Nation";
  r4.location="Chennai";
  r4.cuisineType="BBQ";
  r4.chef=c4;
  c4.chefId=104;
  c4.chefName="Rahul";
  c4.experienceYears=18;
  c4.speciality="Grill";
  c4.isFamous=true;

  r4.getRestaurantDetails();

  Restaurant r5=new Restaurant();
  Chef c5=new Chef();

  r5.restaurantId=5;
  r5.restaurantName="Dominos";
  r5.location="Hyderabad";
  r5.cuisineType="Italian";
  r5.chef=c5;
  c5.chefId=105;
  c5.chefName="Arjun";
  c5.experienceYears=8;
  c5.speciality="Pizza";
  c5.isFamous=true;
  r5.getRestaurantDetails();

  Restaurant r6=new Restaurant();
  Chef c6=new Chef();

  r6.restaurantId=6;
  r6.restaurantName="KFC";
  r6.location="Pune";
  r6.cuisineType="FastFood";
  r6.chef=c6;
  c6.chefId=106;
  c6.chefName="David";
  c6.experienceYears=9;
  c6.speciality="Fried Chicken";
  c6.isFamous=true;
  r6.getRestaurantDetails();

  Restaurant r7=new Restaurant();
  Chef c7=new Chef();

  r7.restaurantId=7;
  r7.restaurantName="Pizza Hut";
  r7.location="Delhi";
  r7.cuisineType="Italian";
  r7.chef=c7;
  c7.chefId=107;
  c7.chefName="Kiran";
  c7.experienceYears=11;
  c7.speciality="Cheese Pizza";
  c7.isFamous=true;

  r7.getRestaurantDetails();

  Restaurant r8=new Restaurant();
  Chef c8=new Chef();

  r8.restaurantId=8;
  r8.restaurantName="Truffles";
  r8.location="Bangalore";
  r8.cuisineType="American";
  r8.chef=c8;
  c8.chefId=108;
  c8.chefName="Vinay";
  c8.experienceYears=13;
  c8.speciality="Burger";
  c8.isFamous=true;

  r8.getRestaurantDetails();

  Restaurant r9=new Restaurant();
  Chef c9=new Chef();

  r9.restaurantId=9;
  r9.restaurantName="Cafe Coffee Day";
  r9.location="Goa";
  r9.cuisineType="Cafe";
  r9.chef=c9;
  c9.chefId=109;
  c9.chefName="Ajay";
  c9.experienceYears=7;
  c9.speciality="Coffee";
  c9.isFamous=true;

  r9.getRestaurantDetails();

  Restaurant r10=new Restaurant();
  Chef c10=new Chef();

  r10.restaurantId=10;
  r10.restaurantName="Subway";
  r10.location="Mumbai";
  r10.cuisineType="FastFood";
  r10.chef=c10;
  c10.chefId=110;
  c10.chefName="Ravi";
  c10.experienceYears=6;
  c10.speciality="Sandwich";
  c10.isFamous=true;
  r10.getRestaurantDetails();

  Restaurant r11=new Restaurant();
  Chef c11=new Chef();

  r11.restaurantId=11;
  r11.restaurantName="A2B";
  r11.location="Chennai";
  r11.cuisineType="South Indian";
  r11.chef=c11;
  c11.chefId=111;
  c11.chefName="Mohan";
  c11.experienceYears=14;
  c11.speciality="Meals";
  c11.isFamous=true;

  r11.getRestaurantDetails();

  Restaurant r12=new Restaurant();
  Chef c12=new Chef();

  r12.restaurantId=12;
  r12.restaurantName="McDonalds";
  r12.location="Delhi";
  r12.cuisineType="FastFood";
  r12.chef=c12;
  c12.chefId=112;
  c12.chefName="Joseph";
  c12.experienceYears=9;
  c12.speciality="Burger";
  c12.isFamous=true;
  r12.getRestaurantDetails();

  Restaurant r13=new Restaurant();
  Chef c13=new Chef();

  r13.restaurantId=13;
  r13.restaurantName="Wow Momo";
  r13.location="Kolkata";
  r13.cuisineType="Chinese";
  r13.chef=c13;
  c13.chefId=113;
  c13.chefName="Karthik";
  c13.experienceYears=8;
  c13.speciality="Momos";
  c13.isFamous=true;
  r13.getRestaurantDetails();

  Restaurant r14=new Restaurant();
  Chef c14=new Chef();

  r14.restaurantId=14;
  r14.restaurantName="Baskin Robbins";
  r14.location="Jaipur";
  r14.cuisineType="Dessert";
  r14.chef=c14;
  c14.chefId=114;
  c14.chefName="Rohan";
  c14.experienceYears=5;
  c14.speciality="IceCream";
  c14.isFamous=true;

  r14.getRestaurantDetails();

  Restaurant r15=new Restaurant();
  Chef c15=new Chef();

  r15.restaurantId=15;
  r15.restaurantName="Haldirams";
  r15.location="Nagpur";
  r15.cuisineType="Snacks";
  r15.chef=c15;
  c15.chefId=115;
  c15.chefName="Sanjay";
  c15.experienceYears=16;
  c15.speciality="Sweets";
  c15.isFamous=true;
  r15.getRestaurantDetails();

  Restaurant r16=new Restaurant();
  Chef c16=new Chef();

  r16.restaurantId=16;
  r16.restaurantName="Anand Sweets";
  r16.location="Bangalore";
  r16.cuisineType="Dessert";
  r16.chef=c16;
  c16.chefId=116;
  c16.chefName="Prakash";
  c16.experienceYears=20;
  c16.speciality="MysorePak";
  c16.isFamous=true;
  r16.getRestaurantDetails();

  Restaurant r17=new Restaurant();
  Chef c17=new Chef();

  r17.restaurantId=17;
  r17.restaurantName="Biryani By Kilo";
  r17.location="Hyderabad";
  r17.cuisineType="Mughlai";
  r17.chef=c17;
  c17.chefId=117;
  c17.chefName="Imran";
  c17.experienceYears=17;
  c17.speciality="Biryani";
  c17.isFamous=true;
  r17.getRestaurantDetails();

  Restaurant r18=new Restaurant();
  Chef c18=new Chef();

  r18.restaurantId=18;
  r18.restaurantName="Kanti Sweets";
  r18.location="Mysore";
  r18.cuisineType="Dessert";
  r18.chef=c18;
  c18.chefId=118;
  c18.chefName="Mahesh";
  c18.experienceYears=12;
  c18.speciality="Ladoo";
  c18.isFamous=true;
  r18.getRestaurantDetails();

  Restaurant r19=new Restaurant();
  Chef c19=new Chef();

  r19.restaurantId=19;
  r19.restaurantName="Corner House";
  r19.location="Bangalore";
  r19.cuisineType="Dessert";
  r19.chef=c19;
  c19.chefId=119;
  c19.chefName="Anil";
  c19.experienceYears=9;
  c19.speciality="Icecream";
  c19.isFamous=true;
  r19.getRestaurantDetails();

  Restaurant r20=new Restaurant();
  Chef c20=new Chef();

  r20.restaurantId=20;
  r20.restaurantName="Empire";
  r20.location="Bangalore";
  r20.cuisineType="MultiCuisine";
  r20.chef=c20;
  c20.chefId=120;
  c20.chefName="Rafiq";
  c20.experienceYears=15;
  c20.speciality="Kebab";
  c20.isFamous=true;

  r20.getRestaurantDetails();

 }
}