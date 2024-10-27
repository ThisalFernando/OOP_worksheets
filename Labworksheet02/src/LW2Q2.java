import java.util.Scanner;

public class LW2Q2 {

    public static void main(String[] args) {

        //Create object for count digits
        Q2 number = new Q2();

        //Scanner definition
        Scanner sc = new Scanner(System.in);

        //Get the input from the user
        System.out.print("Enter integer: ");
        int num = sc.nextInt();

        while(true){
            //Check the number is negative or not
            if(num < 0){
                System.out.println("The number is in negative form!...");
                break;
            }
            else {
                //Print the digit count
                System.out.println("The digit count of the number is, " + number.countDigits(num));
                //Get the input from the user
                System.out.print("Enter integer: ");
                num = sc.nextInt();
            }
        }
    }
}
