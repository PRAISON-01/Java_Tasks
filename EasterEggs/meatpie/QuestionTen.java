import java.util.Scanner;

public class QuestionTen {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to Double : ");
    int number = input.nextInt();

    int twice = number * number;

    System.out.printf("twice the value of %d is %d%n", number, twice);

 }
}
