class Movie {

    String casts[] = new String[9];
    int index;

    public boolean addCast(String cast) {
        boolean isCastAdded = false;

        if(index < casts.length) {
            if(cast != null && !cast.isEmpty()) {
                casts[index++] = cast;
                isCastAdded = true;
            } else {
                System.out.println(cast + " is not valid");
            }
        } else {
            System.out.println("Casts list is full");
        }

        return isCastAdded;
    }

    public void getCasts() {
        System.out.println("Movie Casts are:");
        for(String cast : casts) {
            if(cast != null) {
                System.out.println(cast);
            }
        }
    }
}