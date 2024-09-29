import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constants
        final double CM_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;

        //Input length in centimeters
        System.out.print("Enter the length in centimeters: ");
        double lenCen = sc.nextDouble();

        //Convert centimeters into total inch
        double totInches = lenCen / CM_PER_INCH;

        //Calculate length in feet and remaining inches
        int feet = (int) totInches / INCHES_PER_FOOT;
        double remainingInches = totInches % INCHES_PER_FOOT;

        // Output: Print the result in feet and inches
        System.out.println("The equivalent length is: " + feet + " feet " + String.format("%.2f", remainingInches) + " inches.");
    }
}
