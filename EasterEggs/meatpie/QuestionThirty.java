import java.util.Scanner;

public class QuestionThirty {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First Number : ");
    int firstNum = input.nextInt();

    System.out.print("Enter secondNumber : ");
    int secondNum = input.nextInt();

    int sum = firstNum + secondNum;
    int product = firstNum * secondNum;
    System.out.printf("Sum and product Result : %d and %d%n ", sum , product);
 }
}

