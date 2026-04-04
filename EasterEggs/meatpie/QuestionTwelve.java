import java.util.Scanner;

public class QuestionTwelve {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int firstNum = input.nextInt();

    System.out.print("Enter Second NUmber: ");
    int secondNum = input.nextInt();

    System.out.printf("The two numbers you inputed are %d and %d%n ", firstNum , secondNum);
 }
}
