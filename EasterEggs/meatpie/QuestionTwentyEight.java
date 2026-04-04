import java.util.Scanner;

public class QuestionTwentyEight {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to divide the value by 3 : ");
    int number = input.nextInt();
    int three = 3;

    int result = number / three;

    System.out.printf("%d divided by 3, is %d%n ", number , result );

 }
}
