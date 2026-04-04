import java.util.Scanner;

public class QuestionEighteen {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to subtract from 5 : ");
    int number = input.nextInt();
    int five = 5;

    int result = number - five;

    System.out.printf("Value of %d from 5 is %d%n", number , result );

 }
}
