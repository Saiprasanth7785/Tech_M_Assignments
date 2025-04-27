package Assignment4;
import java.util.*;

class Dictionary<K, V> {
    private TreeMap<K, V> dictionary;
    
    public Dictionary() {
        dictionary = new TreeMap<>();
    }
    
    public void addWord(K word, V meaning) {
        dictionary.put(word, meaning);
    }
    
    public V getMeaning(K word) {
        return dictionary.get(word);
    }
    
    public void displayDictionary() {
        for (Map.Entry<K, V> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

public class MultiLanguageDictionary {
    public static void main(String[] args) {
        Dictionary<String, String> englishToSpanish = new Dictionary<>();
        
        englishToSpanish.addWord("Hello", "Hola");
        englishToSpanish.addWord("Thank You", "Gracias");
        englishToSpanish.addWord("Goodbye", "Adiós");
        
        System.out.println("Multi-Language Dictionary:");
        englishToSpanish.displayDictionary();
        
        System.out.println("\nMeaning of 'Hello': " + englishToSpanish.getMeaning("Hello"));
    }
}
