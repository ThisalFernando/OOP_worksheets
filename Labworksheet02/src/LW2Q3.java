import java.util.Scanner;

public class LW2Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int nrow = sc.nextInt();

        for(int i = 1; i <= nrow; i++){
            for (int j = 1; j <= nrow - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}