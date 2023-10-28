import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);
        //The quick brown fox jumps over the lazy dog
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create an array to mark the presence of each letter in the alphabet
        boolean[] alphabet = new boolean[26];
        int index;

        // Convert the input to lowercase to handle both upper and lower case letters
        input = input.toLowerCase();

        // Iterate through the input and mark the presence of each letter
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                index = ch - 'a';
                alphabet[index] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are marked as present
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
    }
}
