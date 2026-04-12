class Library {

    String bookNames[] = new String[13];
    int index;

    public boolean addBook(String book) {

        boolean isBookAdded = false;

        if (index < bookNames.length) {

            if (book != null && !book.isEmpty()) {
                bookNames[index++] = book;
                isBookAdded = true;
            } else {
                System.out.println(book + " is not valid");
            }

        } else {
            System.out.println("Book list is full");
        }

        return isBookAdded;
    }

    public void getBooks() {

        System.out.println("Library Books are:");

        for (String book : bookNames) {
            System.out.println(book);
        }
    }

    public String getBookByName(String bookName) {

        String name = null;

        for (String book : bookNames) {
            if (book == bookName) {
                name = book;
                break;
            }
        }

        if (name == null) {
            System.out.println("Book is not found");
        }

        return name;
    }

    public boolean updateBook(String existingBook, String updatedBook) {

        boolean isUpdated = false;

        for (int index = 0; index < bookNames.length; index++) {

            if (bookNames[index] == existingBook) {
                bookNames[index] = updatedBook;
                isUpdated = true;
                break;
            }
        }

        if (isUpdated == false) {
            System.out.println(existingBook + " is not found");
        }

        return isUpdated;
    }
	
public boolean deleteBook(String bookName) {

    boolean isDeleted = false;

    for (int index = 0; index < bookNames.length; index++) {

        if (bookNames[index] == bookName) {
            bookNames[index] = null;
            isDeleted = true;
            break;
        }
    }

    if (isDeleted == false) {
        System.out.println(bookName + " is not found");
    }

    return isDeleted;
}	
	
}