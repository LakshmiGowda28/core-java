class Book{
    String bookName;
    int price;
    Author author;

    public void getBookDetails(){
        System.out.println("Book name is " + bookName);
        System.out.println("Price is " + price);
        author.getAuthorDetails();
    }
}