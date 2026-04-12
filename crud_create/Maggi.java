class Maggi {

    String ingredients[] = new String[12];
    int index;

    public boolean addIngredient(String ingredient) {
        boolean isAdded = false;

        if (index < ingredients.length) {
            if (ingredient != null) {
                ingredients[index++] = ingredient;
                isAdded = true;
            } else {
                System.out.println("Invalid ingredient");
            }
        } else {
            System.out.println("Ingredients list is full....");
        }

        return isAdded;
    }

    public void getIngredients() {
        System.out.println("Maggi Ingredients List:");

        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }
}