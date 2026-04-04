import java.util.Scanner;

public class QuestionNineteen {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to find the remainder when divided by 2 : ");
    int number = input.nextInt();
    int two = 2;

    int result = number % two;

    System.out.printf("when divided by 2 the remainder is %d%n", number , result );

 }
}
