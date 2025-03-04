import java.util.Scanner;

public class RemoveExtraSpaces {
    public static String removeSpacesAndReverseWords(String input) {
        String result = "";
        boolean insideWord = false;  
        String word = "";           
        String reversedWords = "";  

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
                if (insideWord) {
                    reversedWords = word + " " + reversedWords;
                    word = "";  
                    insideWord = false;
                }
            } else {
                word += currentChar;
                insideWord = true;
            }
        }
        if (insideWord) {
            reversedWords = word + " " + reversedWords;
        }
        if (reversedWords.length() > 0 && reversedWords.charAt(reversedWords.length() - 1) == ' ') {
            reversedWords = reversedWords.substring(0, reversedWords.length() - 1);
        }

        return reversedWords;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String input = in.nextLine();
        String result = removeSpacesAndReverseWords(input);
        System.out.println("Reversed words result: ");
        System.out.println(result);
    }
}
