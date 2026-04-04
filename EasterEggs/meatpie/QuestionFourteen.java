import java.util.Scanner;

public class QuestionFourteen {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int firstNum = input.nextInt();

    System.out.print("Enter Second NUmber: ");
    int secondNum = input.nextInt();

    System.out.print("Enter Third Number: ");
    int thirdNumber = input.nextInt();

    int denominator = 3;
    int numerator = firstNum + secondNum + thirdNumber;
    int average = numerator / denominator;

    System.out.printf("Average of the Three Numbers : %d%n", average);
 }
}
