import java.util.Scanner;
 public class WordCounter {
     public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        return sentence;
     }

     public static int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
     }
    public static void main(String[] args) {
        String sentence = getSentenceInput();
        int wordCount = countWords(sentence);
        System.out.println("Word count: " + wordCount);
    }
 }
