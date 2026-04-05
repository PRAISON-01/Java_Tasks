import java.util.Scanner;

public class Interest {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Balance : ");
    double balance = input.nextDouble();

    System.out.print("Enter Annual interest Rate : ");
    double rate = input.nextDouble();

    double interest = balance * (rate/1200);

    System.out.printf("Annual Interest Rate : %.2f\n", interest);
 }
}
