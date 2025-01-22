/*Write a program to process a paragraph of text and perform the following operations: 1. Count the
        number of words. 2. Find and replace a specific word. 3. Extract the first sentence. 4. Convert the text to
        uppercase and lowercase.*/

import java.util.Scanner;
public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph of text:");
        String paragraph = scanner.nextLine();
        int wordCount = countWords(paragraph);
        System.out.println("1. Number of words: " + wordCount);
        System.out.println("Enter the word to find:");
        String wordToFind = scanner.next();
        System.out.println("Enter the word to replace it with:");
        String wordToReplace = scanner.next();
        String replacedText = paragraph.replace(wordToFind, wordToReplace);
        System.out.println("2. Text after replacing \"" + wordToFind + "\" with \"" + wordToReplace + "\":");
        System.out.println(replacedText);
        String firstSentence = extractFirstSentence(paragraph);
        System.out.println("3. First sentence: " + firstSentence);
        System.out.println("4. Text in uppercase:");
        System.out.println(paragraph.toUpperCase());
        System.out.println("Text in lowercase:");
        System.out.println(paragraph.toLowerCase());
        scanner.close();
    }
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }
    public static String extractFirstSentence(String text) {
        int endOfSentence = text.indexOf('.');
        if (endOfSentence != -1) {
            return text.substring(0, endOfSentence + 1).trim();
        }
        return text.trim();
    }
}
