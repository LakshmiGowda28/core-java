class Library{

  String bookNames[] = new String[13];
  int index;

  public boolean addBook(String book){
    boolean isBookAdded = false;

    if(index < bookNames.length){
      if(book != null && !book.isEmpty()){

        bookNames[index++] = book;
        isBookAdded = true;
      }
      else
        System.out.println(book + " is not valid");
    }
    else
      System.out.println("Book list is full");

    return isBookAdded;
  }

  public void getBooks(){
    System.out.println("Library Books are:");
    for(String book : bookNames){
      System.out.println(book);
    }
  }

}