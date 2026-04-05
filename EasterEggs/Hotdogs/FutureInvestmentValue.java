import java.util.Scanner;

public class FutureInvestmentValue {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Investment Amount : ");
    double investment = input.nextDouble();

    System.out.print("Enter Monthly Interest Rate : ");
    double rate = input.nextDouble();
    double rateP = rate * 0.001;

    System.out.print("Enter Number of years : ");
    double time = input.nextDouble();

    double base = investment * (1 + rateP);
    double index = time * 12;
    double investmentValue = Math.pow(base, index);

    System.out.printf("Future Investment Value : %f\n", investmentValue);
 }
}
