class LibraryExecutor{

  public static void main(String[] args){

    Library ref = new Library();

    boolean added = ref.addBook("Java");
    System.out.println(added);

    added = ref.addBook("Python Basics");
    System.out.println(added);

    added = ref.addBook("Data Structures");
    System.out.println(added);

    added = ref.addBook("Operating Systems");
    System.out.println(added);

    added = ref.addBook("Computer Networks");
    System.out.println(added);

    added = ref.addBook("Database Systems");
    System.out.println(added);

    added = ref.addBook("Machine Learning");
    System.out.println(added);

    added = ref.addBook("Artificial Intelligence");
    System.out.println(added);

    added = ref.addBook("Software Engineering");
    System.out.println(added);

    added = ref.addBook("Web Development");
    System.out.println(added);

    added = ref.addBook("Cyber Security");
    System.out.println(added);

    added = ref.addBook("Cloud Computing");
    System.out.println(added);

    added = ref.addBook("Computer Architecture");
    System.out.println(added);

    ref.getBooks();
	
String book = ref.getBookByName("Java");
System.out.println("Book name is available");

ref.updateBook("Python Basics", "Advanced Python");
System.out.println("Book name is updated");	

ref.deleteBook("Computer Networks");
System.out.println("Book name is deleted");

ref.getBooks();
  }
}