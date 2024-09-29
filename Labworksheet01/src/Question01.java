import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Accept a word from the user
        System.out.print("Enter an word: ");
        String wrd = sc.nextLine();

        // Check if the word length is odd
        if (wrd.length() % 2 == 0) {
            System.out.println("The word is an odd length word!");
        } else {
            // Calculate the index of the middle character
            int midIndex = wrd.length() / 2;

            // Output: Print the middle character
            System.out.println("The middle character is: " + wrd.charAt(midIndex));
        }
    }
}
