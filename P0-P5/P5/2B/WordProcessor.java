import java.util.ArrayList;  

public class WordProcessor {
    // Atribut statik untuk menyimpan daftar kata
    private static ArrayList<String> words;

    /**
     * Konstruktor
     * Inisialisasi daftar kata
     */
    public WordProcessor() {
        words = new ArrayList<String>();
    }

    /**
     * Menambahkan kata ke dalam daftar kata
     * @param word
     */
    public static void addWord(String word) {
        words.add(word);
    }

    /**
     * Menghapus kata dari daftar kata
     * @param word
     */
    public static void removeWord(String word) {
        words.remove(word);
    }

    /**
     * Mencetak daftar kata dengan format:
     * 1. kata1
     * 2. kata2
     * ...
     */
    public static void printWords() {
        int i = 1;
        for (String word : words) {
            System.out.println(i + ". " + word);
            i++;
        }
    }

    /**
     * Mengembalikan kata terbalik pada index tertentu
     * Index dimulai dari 0
     * @param indeks
     * @return
     */
    private static StringBuilder reverseWord(int indeks) {
        String word = words.get(indeks);
        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();
        return reversedWord;
    }
    
    /**
     * Mengembalikan apakah suatu kata pada index tertentu merupakan palindrome
     * Clue: gunakan method reverseWord
     * @param indeks
     * @return  true jika kata pada index tertentu merupakan palindrome
     *          false jika kata pada index tertentu bukan palindrome atau index tidak valid
     */
    public static boolean isPalindrome(int indeks) {
        if (indeks < 0 || indeks >= words.size()) {
            return false;
        }
        String word = words.get(indeks);
        StringBuilder reversedWord = reverseWord(indeks);
        return word.equals(reversedWord.toString());
    }
}
