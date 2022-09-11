import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println("Type the sentence and press Enter to count anagrams");
        System.out.println("Type 'stop' and press Enter to finish the program");
        Scanner scanner = new Scanner(System.in);
        boolean isActiveScanner = true;
        while (isActiveScanner) {
            String currentLine = scanner.nextLine();
            System.out.println(anagram.arrayChallenge(currentLine));
            if (currentLine.equals("stop")) {
                isActiveScanner = false;
            }
        }
    }

}
