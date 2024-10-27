import javax.swing.*;
import java.util.Scanner;

public class LW2Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Object creation
        Q5 palindromCheck = new Q5();

        //Input a sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        //Ignore punctuation and spaces
        String cleanedSentence = palindromCheck.cleanSentence(sentence);

        //Check the sentence is a palindrome or not
        if(palindromCheck.isPalindrome(cleanedSentence)){
            System.out.println("The sentence is a palindrome!");
        }
        else{
            System.out.println("The sentence is not a palindrome");
        }

    }
}
