class District {

    static void run() {
        System.out.println("District administration running");
        taxing();
    }

    static void taxing() {
        System.out.println("Tax calculation started");
        measure();
    }

    static void measure() {
        System.out.println("Tax measured");
        collect();
    }

    static void collect() {
        System.out.println("Tax collected");
        revenue();
    }

    static void revenue() {
        System.out.println("Revenue generated");
        budget();
    }

    static void budget() {
        System.out.println("Budget prepared");
    }
}