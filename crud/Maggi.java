class Maggi {

    String ingredients[] = new String[12];
    int index;

    public boolean addIngredient(String ingredient) {

        boolean isAdded = false;

        if (index < ingredients.length) {

            if (ingredient != null && !ingredient.isEmpty()) {
                ingredients[index++] = ingredient;
                isAdded = true;
            } else {
                System.out.println(ingredient + " is not valid");
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

    public String getIngredientByName(String ingredientName) {

        String name = null;

        for (String ingredient : ingredients) {
            if (ingredient == ingredientName) {
                name = ingredient;
                break;
            }
        }

        if (name == null) {
            System.out.println("Ingredient is not found");
        }

        return name;
    }

    public boolean updateIngredient(String existingIngredient, String updatedIngredient) {

        boolean isUpdated = false;

        for (int index = 0; index < ingredients.length; index++) {

            if (ingredients[index] == existingIngredient) {
                ingredients[index] = updatedIngredient;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingIngredient + " is not found");
        }

        return isUpdated;
    }
public boolean deleteItem(String itemName) {

    boolean isDeleted = false;

    for (int index = 0; index < ingredients.length; index++) {

        if (ingredients[index] == itemName) {
            ingredients[index] = null;
            isDeleted = true;
            break;
        }
    }

    if (isDeleted == false) {
        System.out.println(itemName + " is not found");
    }

    return isDeleted;
}	
}