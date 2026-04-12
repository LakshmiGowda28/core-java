class ProgrammingLanguage{
    String type;
    String usage;
    Java java;

    public void getLanguageDetails(){
        System.out.println("Type is " + type);
        System.out.println("Usage is " + usage);
        java.getJavaDetails();
    }
}