class WeatherStationExecutor {

    public static void main(String[] args) {

        WeatherStation ws = new WeatherStation();

        boolean added = ws.addReading("32°C");
        System.out.println(added);

        added = ws.addReading("28°C");
        System.out.println(added);

        added = ws.addReading("30°C");
        System.out.println(added);

        added = ws.addReading("29°C");
        System.out.println(added);

        added = ws.addReading("35°C");
        System.out.println(added);

        added = ws.addReading("27C");
        System.out.println(added);

        added = ws.addReading("33C");
        System.out.println(added);

        added = ws.addReading("31C");
        System.out.println(added);

        added = ws.addReading("26°C");
        System.out.println(added);

        added = ws.addReading("34°C");
        System.out.println(added);

        added = ws.addReading("25°C");
        System.out.println(added);

        added = ws.addReading("36°C");
        System.out.println(added);

        added = ws.addReading("29°C");
        System.out.println(added);

        added = ws.addReading("28°C");
        System.out.println(added);

        added = ws.addReading("32°C");
        System.out.println(added);

        added = ws.addReading("30°C");
        System.out.println(added);

        added = ws.addReading("31°C");
        System.out.println(added);

        ws.getReadings();
    }
}