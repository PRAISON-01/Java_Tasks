import java.util.Scanner;

public class TriangleAreaCalc {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Base of a triangle: ");
    double base = input.nextDouble();
    
    System.out.print("Enter height of the triangle: ");
    double height = input.nextDouble();

    double area = 0.5 * base * height;

    System.out.printf("Area of triangle is: %.2f square units\n", area);
 }
}
