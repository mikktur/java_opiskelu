package Module5.t1_1;

import java.util.HashMap;

public class Dictionary  {
    private HashMap<String, String> dictionary = new HashMap<String, String>();
    public Dictionary(){
        dictionary.put("Omena", "Apple");
        dictionary.put("Päärynä", "Pear");
        dictionary.put("Banaani", "Banana");
    }

    public void addWord(String word, String translation) {
        dictionary.put(word, translation);
    }
    public String getTranslation(String word) {
        return dictionary.get(word);
    }

}
