import java.util.Scanner;

public class TriangularPrismCalc {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter length of side of an Equilateral Triangle");
    double side = input.nextDouble();

    System.out.println("Enter length : ");
    double length = input.nextDouble();

    double baseArea = (Math.sqrt(3) / 4) * Math.pow(side, 2);

    double area = baseArea * length;
    
    System.out.printf("Area of the Equilateral Triangular Prism : %.2f cubic metre%n", area);
 }
}
