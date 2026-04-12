class BookRunner{
    public static void main(String[] args){

        Book book = new Book();
        book.bookName = "Java Basics";
        book.price = 500;

        Author a = new Author();
        book.author = a;

        a.authorName = "James";
        a.country = "USA";

        book.getBookDetails();
    }
}