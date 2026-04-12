class Movie {

    String casts[] = new String[9];
    int index;

    public boolean addCast(String cast) {

        boolean isCastAdded = false;

        if (index < casts.length) {

            if (cast != null && !cast.isEmpty()) {
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

        for (String cast : casts) {
            if (cast != null) {
                System.out.println(cast);
            }
        }
    }

    public String getCastByName(String castName) {

        String name = null;

        for (String cast : casts) {
            if (cast == castName) {
                name = cast;
                break;
            }
        }

        if (name == null) {
            System.out.println("Cast is not found");
        }

        return name;
    }

    public boolean updateCast(String existingCast, String updatedCast) {

        boolean isUpdated = false;

        for (int i = 0; i < casts.length; i++) {

            if (casts[i] == existingCast) {
                casts[i] = updatedCast;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingCast + " is not found");
        }

        return isUpdated;
    }
	
public boolean deleteCast(String castName) {

    boolean isDeleted = false;

    for (int i = 0; i < casts.length; i++) {

        if (casts[i] == castName) {
            casts[i] = null;
            isDeleted = true;
            break;
        }
    }

    if (isDeleted == false) {
        System.out.println(castName + " is not found");
    }

    return isDeleted;
}	
}