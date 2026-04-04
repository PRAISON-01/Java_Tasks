import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to square : ");
    int number = input.nextInt();

    int square = number * number;

    System.out.printf("Square Results : %d%n", square);

 }
}
