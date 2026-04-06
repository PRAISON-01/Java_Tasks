import java.util.Scanner;

public class CylinderCalc {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Radius of cylinder: ");
    double radius = input.nextDouble();

    System.out.print("Enter Height of cylinder: ");
    double height = input.nextDouble();

    double pi = 3.142;
    double area = (2 * pi * radius * height) + (2 * pi) * (Math.pow(radius, 2));
    double volume = pi * height * (Math.pow(radius, 2));

    System.out.println("Area (square metres) : "+ area +"\nVolume (cubic metres) : "+ volume );
 }
}
