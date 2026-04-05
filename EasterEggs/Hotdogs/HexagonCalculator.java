import java.util.Scanner;

public class HexagonCalculator {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side of a hexagon to calculate its Area : ");
    int sides = input.nextInt();
    
    double area = (3 * Math.sqrt(3) / 2) * Math.pow(sides, 2);
    System.out.printf("Area of Hexagon : %.2f square unit\n", area);
 }
}
