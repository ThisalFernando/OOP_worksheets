import java.util.Scanner;

public class Question02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Ask the user for their full name
        System.out.print("Enter your full name (first middle last): ");
        String fullName = sc.nextLine();

        // Split the input into an array of words (assumes there are 3 parts)
        String[] nameParts = fullName.split(" ");

        // Check if 3 parts (first, middle, last) were entered
        if (nameParts.length == 3) {
            String fName = nameParts[0];
            String mName = nameParts[1];
            String lName = nameParts[2];

            // Extract the middle initial
            char middleInitial = mName.charAt(0);

            // Output: Format the name as "last, first middle-initial."
            System.out.println(lName + ", " + fName + " " + middleInitial + ".");
        } else {
            System.out.println("The format is invalid!");
        }
    }
}
