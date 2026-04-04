import java.util.Scanner;

public class QuestionSixteen {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to multiply the value by 5 : ");
    int number = input.nextInt();
    int five = 5;

    int byFive = number * five;

    System.out.printf("%d multiplied by 5, is %d%n ", number , byFive );

 }
}
