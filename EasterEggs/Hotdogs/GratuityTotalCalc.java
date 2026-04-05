import java.util.Scanner;

public class GratuityTotalCalc {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Subtotal (in $) : ");
    int subTotal = input.nextInt();

    System.out.print("Enter Gratuity Rate (in %) : ");
    double gRate = input.nextDouble();

    double gratuity = gRate * 0.01 * subTotal;
    double total = gratuity + subTotal;

    System.out.printf("Gratuity = $%.2f, Total = $%.2f\n", gratuity , total );
 }
}
