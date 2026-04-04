import java.util.Scanner;

public class QuestionSeventeen {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to add 10 to : ");
    int number = input.nextInt();
    int ten = 10;

    int result = number + ten;

    System.out.printf("%d plus 10 is %d%n ", number , result );

 }
}
