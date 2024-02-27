package Module5.t1_1;



public class DictionaryController {


    private DictionaryView gui;

    private Dictionary dict = new Dictionary();


    public DictionaryController(DictionaryView gui) {
        this.gui = gui;
    }


    public String getTranslation(String word) {
        if (word.isEmpty()) {
            return "No word entered";
        } else if (dict.getTranslation(word) == null) {
            return "No translation found";
        } else return "Translation: " + dict.getTranslation(word);


    }




    public void addWord(String word, String translation) {
        dict.addWord(word, translation);


    }


}

