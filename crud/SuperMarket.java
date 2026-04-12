class SuperMarket {

    String productNames[] = new String[8];
    int index;

    public boolean addProduct(String product) {

        boolean isProductAdded = false;

        if (index < productNames.length) {

            if (product != null && !product.isEmpty()) {
                productNames[index++] = product;
                isProductAdded = true;
            } else {
                System.out.println(product + " is not valid");
            }

        } else {
            System.out.println("Product list is full");
        }

        return isProductAdded;
    }

    public void getProducts() {

        System.out.println("SuperMarket Products are:");

        for (String product : productNames) {
            System.out.println(product);
        }
    }

    public String getProductByName(String productName) {

        String name = null;

        for (String product : productNames) {
            if (product == productName) {
                name = product;
                break;
            }
        }

        if (name == null) {
            System.out.println("Product is not found");
        }

        return name;
    }

    public boolean updateProduct(String existingProduct, String updatedProduct) {

        boolean isUpdated = false;

        for (int i = 0; i < productNames.length; i++) {

            if (productNames[i] == existingProduct) {
                productNames[i] = updatedProduct;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingProduct + " is not found");
        }

        return isUpdated;
    }

    public boolean deleteProduct(String productName) {

        boolean isDeleted = false;

        for (int index = 0; index < productNames.length; index++) {

            if (productNames[index] == productName) {
                productNames[index] = null;
                isDeleted = true;
                break;
            }
        }

        if (isDeleted == false) {
            System.out.println(productName + " is not found");
        }

        return isDeleted;
    }
}