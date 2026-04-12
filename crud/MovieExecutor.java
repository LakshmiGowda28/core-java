class MovieExecutor {
    public static void main(String[] args) {
        Movie ref = new Movie();
        boolean added = ref.addCast("Hero");
        System.out.println(added);

        added = ref.addCast("Robert Downey Jr.");
        System.out.println(added);

        added = ref.addCast("Scarlett Johansson");
        System.out.println(added);

        added = ref.addCast("Director");
        System.out.println(added);

        added = ref.addCast("Emma Watson");
        System.out.println(added);

        added = ref.addCast("Heroine");
        System.out.println(added);

        added = ref.addCast("Jennifer Lawrence");
        System.out.println(added);

        added = ref.addCast("Will Smith");
        System.out.println(added);

        added = ref.addCast("Gal Gadot");
        System.out.println(added);

        ref.getCasts();
		
String cast = ref.getCastByName("Hero");
System.out.println("Cast name is available");

ref.updateCast("Heroine", "Lead Actress");
System.out.println("Cast name is updated");	

ref.deleteCast("Hero");
System.out.println("Deleted successfully");	

ref.getCasts();
    }
}