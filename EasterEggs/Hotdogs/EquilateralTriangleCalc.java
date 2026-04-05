import java.util.Scanner;

public class EquilateralTriangleCalc {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter length of Equilateral Triangle : ");
    int length = input.nextInt();

    double root = Math.sqrt(3);
    int lengthProduct = length * length;
    int number = 4;

   double rootNum = root/number;
   double area = rootNum * lengthProduct;
   
   System.out.println("Area of an Equilateral Triangle : "+ area);
 }
}
