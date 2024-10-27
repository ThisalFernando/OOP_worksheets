import java.util.Scanner;

public class LW2Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Array Definition
        int[] numArray = new int[5];

        //Input numbers into the array
        for(int i = 0; i < 5; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            numArray[i] = sc.nextInt();
        }

        //Define largest and second largest numbers
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < 5; i++){
            if (numArray[i] > max1) {
                max2 = max1;  // Update second-largest
                max1 = numArray[i]; // Update largest
            } else if (numArray[i] > max2 && numArray[i] != max1) {
                max2 = numArray[i]; // Update second-largest only if it's different from the largest
            }
        }

        //Print the second largest number
        System.out.println("The second largest number is, " + max2);


    }
}
