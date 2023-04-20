package codecademy.java.inheritanceandpolymorphism.project;

class Language {
    // los fields
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    //el constructor
    Language(String langName, int speakers, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo() {

        System.out.println(this.name + " is spoken by " + numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);

    }


    public static void main(String[] args) {

        Language english = new Language("english", 10000000, "America", "subject");
        english.getInfo();

    }
}