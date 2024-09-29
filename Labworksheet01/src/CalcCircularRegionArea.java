import java.util.Scanner;

public class CalcCircularRegionArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Get the radius of the inner circle
        System.out.print("Enter the radius of the inner circle (ri): ");
        double inRadius = sc.nextDouble();

        // Input: Get the radius of the outer circle
        System.out.print("Enter the radius of the outer circle (ro): ");
        double outRadius = sc.nextDouble();

        // Create Circle objects for the inner and outer circles
        Circle innCircle = new Circle(inRadius);
        Circle outCircle = new Circle(outRadius);

        // Calculate the area of the circular region (shaded area)
        double cirRegArea = outCircle.computeArea() - innCircle.computeArea();

        // Output: Display the computed area of the circular region
        System.out.println("The area of the circular region is: " + cirRegArea);
    }
}
