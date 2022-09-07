import java.util.ArrayList;
import java.util.List;

/**
 * Counting anagrams in the sentence
 */
public class Anagram {

    /**
     * Return number of anagrams in the sentence
     *
     * @param input sentence that must contain only spaces and lowercase
     *              letters, no punctuation, numbers, or uppercase letters
     * @return number of anagrams
     */
    public int ArrayChallenge(String input) {
        int anagramCounter = 0;
        String[] words = input.split(" ");
        List<String> anagramBuffer = new ArrayList<>();
        for (int i = 0; i < words.length - 1; i++) {
            String currentWord = words[i];
            int startComparingFrom = i + 1;
            for (int j = startComparingFrom; j < words.length; j++) {
                String comparedWord = words[j];
                if (currentWord.length() == comparedWord.length() & !currentWord.equals(comparedWord) &
                        !anagramBuffer.contains(comparedWord) & checkForAnagram(currentWord, comparedWord)) {
                    anagramBuffer.add(comparedWord);
                    anagramCounter++;
                }
            }
        }
        return anagramCounter;
    }

    /**
     * Return a boolean value indicating if two comparing words are anagrams
     *
     * @param current  First word for comparing
     * @param compared Second word for comparing
     * @return Boolean two words are anagrams
     */
    private boolean checkForAnagram(String current, String compared) {
        for (int k = 0; k < current.length(); k++) {
            String currentChar = String.valueOf(current.charAt(k));
            if (!compared.contains(currentChar)) {
                return false;
            }
        }
        return true;
    }

}
