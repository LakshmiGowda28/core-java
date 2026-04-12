class MovieExecutor {
    public static void main(String[] args) {
        Movie ref = new Movie();
        boolean added = ref.addCast("Leonardo DiCaprio");
        System.out.println(added);

        added = ref.addCast("Robert Downey Jr.");
        System.out.println(added);

        added = ref.addCast("Scarlett Johansson");
        System.out.println(added);

        added = ref.addCast("Chris Hemsworth");
        System.out.println(added);

        added = ref.addCast("Emma Watson");
        System.out.println(added);

        added = ref.addCast("Tom Hanks");
        System.out.println(added);

        added = ref.addCast("Jennifer Lawrence");
        System.out.println(added);

        added = ref.addCast("Will Smith");
        System.out.println(added);

        added = ref.addCast("Gal Gadot");
        System.out.println(added);

        ref.getCasts();
    }
}