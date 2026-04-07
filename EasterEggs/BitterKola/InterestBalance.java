
import java.util.Scanner;

public class InterestBalance {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter you bank balance : ");
    double balance = input.nextDouble();

    System.out.print("Enter Annual Interest Rate : ");
    double rate = input.nextDouble();
    double rated = rate / 100;

    double interestA = balance * (1 + rated);
    double interestB = interestA * (1 + rated);
    double interestC = interestB * (1 + rated);

    System.out.println("Balance after 1 year : $"+ interestA);
    System.out.println("Balance after 2 year : $"+ interestB);
    System.out.println("Balance after 3 year : $"+ interestC);
 }
} 
