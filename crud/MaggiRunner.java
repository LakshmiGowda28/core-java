class MaggiRunner {

    public static void main(String[] args) {

        Maggi m = new Maggi();

        boolean added = m.addIngredient("Noodles");
        System.out.println(added);

        added = m.addIngredient("Masala");
        System.out.println(added);

        added = m.addIngredient("Salt");
        System.out.println(added);

        added = m.addIngredient("Water");
        System.out.println(added);
		
		added = m.addIngredient("wheat flour");
        System.out.println(added);

        added = m.addIngredient("palm oil");
        System.out.println(added);

        added = m.addIngredient("spices");
        System.out.println(added);
		
		added = m.addIngredient("Masala");
        System.out.println(added);

        added = m.addIngredient("Salt");
        System.out.println(added);

        added = m.addIngredient("Water");
        System.out.println(added);

        m.getIngredients();
		
String ingredient = m.getIngredientByName("Salt");
System.out.println("Ingredient name is available");

m.updateIngredient("Masala", "Special Masala");
System.out.println("Ingredient name is updated");

m.deleteItem("Water");
System.out.println("Item is deleted");	

 m.getIngredients();	
    }
}