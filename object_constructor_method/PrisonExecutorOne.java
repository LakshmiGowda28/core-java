class PrisonExecutorOne{
    public static void main(String[] args){
        Criminal criminal = new Criminal();

        criminal.id = 1102;
        criminal.name = "Kiran";

        Prison prison = new Prison(criminal);

        prison.prisonId = 2;
        prison.name = "CityJail";

        prison.getPrisonInfo();
    }
}