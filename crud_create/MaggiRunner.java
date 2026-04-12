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
		
		added = m.addIngredient("Masala");
        System.out.println(added);

        added = m.addIngredient("Salt");
        System.out.println(added);

        added = m.addIngredient("Water");
        System.out.println(added);
		
		added = m.addIngredient("Masala");
        System.out.println(added);

        added = m.addIngredient("Salt");
        System.out.println(added);

        added = m.addIngredient("Water");
        System.out.println(added);

        m.getIngredients();
    }
}