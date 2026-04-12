class TripExecutor {

public static void main(String[] args) {

    Trip ref = new Trip();

        boolean added = ref.addPlace("Goa");
        System.out.println(added);

        added = ref.addPlace("Ooty");
        System.out.println(added);

        added = ref.addPlace("Coorg");
        System.out.println(added);

        added = ref.addPlace("Manali");
        System.out.println(added);

        added = ref.addPlace("Shimla");
        System.out.println(added);

        added = ref.addPlace("Mysore");
        System.out.println(added);

        added = ref.addPlace("Darjeeling");
        System.out.println(added);

        added = ref.addPlace("Kodaikanal");
        System.out.println(added);

        added = ref.addPlace("Munnar");
        System.out.println(added);

        added = ref.addPlace("Kerala");
        System.out.println(added);

        added = ref.addPlace("Andaman");
        System.out.println(added);

        added = ref.addPlace("Leh Ladakh");
        System.out.println(added);

        added = ref.addPlace("Jaipur");
        System.out.println(added);

    ref.getPlaces();
    }
}