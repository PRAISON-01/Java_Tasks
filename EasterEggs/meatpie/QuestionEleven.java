import java.util.Scanner;

public class QuestionEleven {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a Number you want to half the value : ");
    int number = input.nextInt();
    int denominator = 2;

    int half = number / denominator;

    System.out.printf("Half the value of %d is %d%n", number, half);

 }
}
