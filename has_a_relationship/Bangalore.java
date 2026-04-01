class Bangalore{

 int cityId;
 String famousFor;
 int populationInLakhs;
 String state;
 MallOfAsia mallOfAsia;

 public void getBangaloreDetails(){

  System.out.println("Bangalore Details");
  System.out.println("City Id : " + cityId);
  System.out.println("Famous For : " + famousFor);
  System.out.println("Population (Lakhs) : " + populationInLakhs);
  System.out.println("State : " + state);

  mallOfAsia.getMallDetails();
 }
}