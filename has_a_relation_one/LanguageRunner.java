class LanguageRunner{
    public static void main(String[] args){

        ProgrammingLanguage p = new ProgrammingLanguage();
        p.type = "Object Oriented";
        p.usage = "Software Development";

        Java j = new Java();
        p.java = j;

        j.version = "17";
        j.company = "Oracle";

        p.getLanguageDetails();
    }
}