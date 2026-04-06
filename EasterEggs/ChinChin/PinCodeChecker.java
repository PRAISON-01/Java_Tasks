import java.util.Scanner;

public class PinCodeChecker {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Pin: ");
    int inputpin = input.nextInt();

    String pin;
    if (inputpin == 1234) {
        pin = ("Correct PIN\nAmount: $1000");
    } else {
        pin = ("Incorrect PIN!!!");
    }

    System.out.println(pin);
 }
}
